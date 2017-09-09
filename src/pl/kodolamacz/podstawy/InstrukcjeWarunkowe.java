package pl.kodolamacz.podstawy;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {

        if (8<10)
            System.out.println("Bez klamer");
        if(10 > 8) {
            System.out.println("z klamrami");
        }

        int temperatura=20;
        if (temperatura>30) {

        } else if (temperatura>20) {

        }

        char znak='a';
        switch (znak) {
            case 'a':
                System.out.println(znak);
                break;
            case 'b':
                System.out.println(znak);
                break;
            default:
                System.out.println("Nie wiem co to jest");
        }

    // komentarz

    }
}
