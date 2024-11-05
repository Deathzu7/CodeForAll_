package io.codeforall.fanstatics;

public class Machine {

    public static void main(String[] args) {

        MonoOperation<Integer> duplicate = (number -> number * 2);
        Integer result = duplicate.duplicate(5);
        System.out.println(result);


        BiOperation<Integer> executeBio = ((number, n) -> number + n);
        Integer result2 = executeBio.executeBio(5, 12);
        System.out.println(result2);

        BiOperation<String> stringBiOperation = (string1, string2) -> string1 + string2;
        String result3 = stringBiOperation.executeBio("Joao", ", bom dia");
        System.out.println(result3);

        

    }
}
