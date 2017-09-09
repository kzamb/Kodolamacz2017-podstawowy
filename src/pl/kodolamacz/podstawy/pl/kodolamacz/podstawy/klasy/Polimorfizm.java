package pl.kodolamacz.podstawy.pl.kodolamacz.podstawy.klasy;

public class Polimorfizm {
    public static void main(String[] args) {
        Person ela = new Queen("Elżbieta",90);
        Person ziutek = new Employee("Ziutek",40);
        Person mietek = new Employee("Mietek",30);
        Person robert = new Pilkarz("Robert",30,"FC Kołomyja");

        Person wladza = new Person("Kazik",30) {
            @Override
            public void introduce() {
                System.out.println("Jestem władza");
            }
        };

        Person[] osoby = {ela,ziutek,mietek,robert,wladza};



        for (Person person : osoby) {
            person.introduce();
            person.sing();
        }
    }
}
