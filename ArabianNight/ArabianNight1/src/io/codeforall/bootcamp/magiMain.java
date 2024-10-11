package io.codeforall.bootcamp;

public class magiMain {
    public static void main(String[] args) {

        MagicLamp magicLamp1 = new MagicLamp(3); // Lampada com 3 genios
        MagicLamp magicLamp2 = new MagicLamp(5); // Lampada com 5 genios

        // Testar a primeira lampada
       Genie genie = magicLamp1.rubLamp(); // // Esfregar a lâmpada uma vez (vai sair Grumpy)
       genie.makeAWish();
       genie.makeAWish(); // Deve falhar após o 1 pedido

       Genie genie2 = magicLamp1.rubLamp(); // Esfregar a segunda vez (Friendly)
        genie2.makeAWish();
        genie2.makeAWish();
        genie2.makeAWish(); // Friendly concede até 3 desejos
        genie2.makeAWish(); // Deve falhar após 3 desejos

       Genie genie3 = magicLamp1.rubLamp(); // Esfregar a terceira vez (Grumpy)

       Genie genie4 = magicLamp1.rubLamp(); // Quarta vez, deve ser um Demon
        genie4.makeAWish(); // Demon concede desejos, mas há uma consequência

        magicLamp1.recycle(); // Reset à lâmpada

        Genie genie5 = magicLamp1.rubLamp(); // Deve reiniciar o ciclo
        genie5.makeAWish();

        System.out.println("-------------------");

        // Lampada 2
        Genie genie6 = magicLamp2.rubLamp();
        genie6.makeAWish();

        Genie genie7 = magicLamp2.rubLamp();
        genie7.makeAWish();

        System.out.println("-------------------");

        // Comparar as duas lâmpadas
        magicLamp1.compare(magicLamp2);



    }
}
