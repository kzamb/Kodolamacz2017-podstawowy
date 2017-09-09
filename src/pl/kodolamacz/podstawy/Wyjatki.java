package pl.kodolamacz.podstawy;

public class Wyjatki {
    private int age;

    public Wyjatki(int age) throws NegativeAgeException, TooOldException {
        if (age>=0) {
            if(age<150) {
                this.age = age;
            } else new TooOldException();
        } else {
            throw new NegativeAgeException();
          }
        }

    public static void main(String[] args) {
        String napis = "1.23x";
        Wyjatki w;
        try {
            w = new Wyjatki(1000);
        } catch (NegativeAgeException e) {
            e.printStackTrace();
        } catch (TooOldException e) {
            e.printStackTrace();
        }

    }
}

class NegativeAgeException extends Exception{
    public NegativeAgeException() {
       super("Ujemny wiek");
    }
}
class TooOldException extends Exception {
    public TooOldException() {
    super("Zbyt stary");
    }
}