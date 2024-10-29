package io.codeforall.fanstatics;

public class FileManager {

    private boolean isLogin = false;
    private String file;
    private File[] files = new File[2];


    public void createFile(String file) throws NotEnoughSpaceException, NotEnoughPermissionsException {

        if (!isLogin) {
            throw new NotEnoughPermissionsException("You need to login first");
        }

        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = new File(file);
                break;
            }

                if (files.length == 2) {
                    throw new NotEnoughSpaceException("Not enough space");
                }
            }
        }


    public File getFile(String file) throws FileNotFoundException {
        for (int i = 0 ; i < files.length ; i++) {
            if (files[i].getName().equals(file)) {
                System.out.println(files[i].getName());
                return files[i];
            } else {
                throw new FileNotFoundException("There's no file with that name");
            }
        }
        return null;
    }

    public void login() {
        this.isLogin = true;
    }

    public void logOut() {
        this.isLogin = false;
    }
}
