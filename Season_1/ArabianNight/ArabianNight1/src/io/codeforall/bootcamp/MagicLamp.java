package io.codeforall.bootcamp;

import java.lang.classfile.Label;

public class MagicLamp {
    private int maxGenie;  // Capacidade máxima de génios
    private int numberRub;  // Número de vezes que a lâmpada foi esfregada
    private int numberRecycles;
    private int numberDemons; // Número de vezes que a lâmpada foi recarregada

    public MagicLamp(int maxGenie){
        this.maxGenie = maxGenie;
        this.numberRub = 0; // Inicia como 0
        this.numberRecycles = 0;
        this.numberDemons = 0; // Inicia a contagem de demónios como 0
    }

   // Metodo para esfregar a lampada

    public Genie rubLamp() {
        if (numberRub < maxGenie) {  // Enquanto o número de esfregadas for menor que a capacidade de génios
            numberRub++;  // Incrementa o número de esfregadas
            if (numberRub % 2 == 1) {
                System.out.println("You got a Grumpy Genie");
                return new Grumpy();
            } else {
                System.out.println("You got a Friendly Genie");
                return new Friendly();
            }
        } else {  // Quando o número de esfregadas atingir o máximo de génios
            if (numberDemons < 3) {  // Permite invocar até 3 Demons
                numberDemons++;
                System.out.println("You got a Demon");
                return new Demon();
            } else {
                System.out.println("No more genies or demons can be summoned.");
                return null;  // Retorna null quando já não há mais génios ou demónios disponíveis
            }
        }
    }

    // Metodo para reciclar a lâmpada
    public void recycle(){
        numberRub = 0;
        numberRecycles ++;
        numberDemons --;
        System.out.println("The magic lamp has been reset");
    }

    // Métodos de comparação:
    public int getCapacity() {
        return maxGenie;
    }

    public int getRecharges() {
        return numberRecycles;
    }

    public int getRemainingGenies() {
        return Math.max(0, maxGenie - numberRub);  // Retorna o número de génios restantes
    }

    // Metodo para comparar duas lâmpadas mágicas
    public void compare(MagicLamp otherLamp) {
        System.out.println("Comparing Magic Lamps:");
        System.out.println("Capacity: " + this.getCapacity() + " vs " + otherLamp.getCapacity());
        System.out.println("Recharges: " + this.getRecharges() + " vs " + otherLamp.getRecharges());
        System.out.println("Remaining Genies: " + this.getRemainingGenies() + " vs " + otherLamp.getRemainingGenies());
    }

}









