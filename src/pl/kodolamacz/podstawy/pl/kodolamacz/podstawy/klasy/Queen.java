package pl.kodolamacz.podstawy.pl.kodolamacz.podstawy.klasy;

import java.util.Queue;

public class Queen extends Person{

    public Queen(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("jestem krolowa "+this.getName());
    }

    @Override
    public void sing() {
        System.out.println("Nie wypada");
    }

    public static void main(String[] args) {
        Queen ela = new Queen("Ela",80);
        ela.introduce();

    }
}
