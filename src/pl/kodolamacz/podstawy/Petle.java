package pl.kodolamacz.podstawy;

public class Petle {
    public static void main(String[] args) {
        //for
        for (int i=0;i<5;i++) {
            System.out.println(i)
            ;
        }

        int i=0;
        //najpierw sprawdza potem wykonuje
        while (i<5) {
            System.out.println(i);
            i++;
        }
        // co najmniej raz się wykona a potem sprawdza
        do {
            System.out.println(i);
            i++;
        } while (i<5);


    }
}
