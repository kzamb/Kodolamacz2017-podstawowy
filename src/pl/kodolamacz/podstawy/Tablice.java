package pl.kodolamacz.podstawy;

public class Tablice {
    public static void main(String[] args) {

        int[] tablica = {1,2,3};

        int[] tab1 = new int[2];
        tab1[0]=1;
        tab1[1]=2;
        //tez mozna ale nie jest zalecana
        int tab2[] = {1,2,3};

        String[] napisy={"Abc","Pies","Kot"};

        for (String s: napisy) {
            System.out.println(s);
        }
        //it - iteratory

        for (int i = 0; i < napisy.length; i++) {
            String s = napisy[i];

        }

    }
}
