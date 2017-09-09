package pl.kodolamacz.podstawy;

public class Zmienne {

    public static void main(String[] args) {
        System.out.println("Witaj swiecie");
        System.out.println("Witaj ponownie");


    int i=0;
    i=i+1;
    i+=1;
    i++;

        System.out.println(false&false);
        //podwojny && i || - leniwe nanlizowane jest od lewej do prawej i konczy sie gdy rozstrzygajace
        //pojedyncze oznaczaja pelne wyliczanie wartości
        System.out.println(false&&false);

        //operatory bitowe
        System.out.println(4^4);
        System.out.println(4^2);
        System.out.println(4&4);
        System.out.println(4|4);
        System.out.println(1<<2);
        System.out.println(1>>2);

    }
}
