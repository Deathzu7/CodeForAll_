public class Room {

    private int roomNumber;
    private boolean isAvailable;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean roomIsFull() {
        return !isAvailable;
    }

    public boolean emptyRoom() {
        return isAvailable;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
