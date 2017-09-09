package pl.kodolamacz.podstawy.pl.kodolamacz.podstawy.klasy;

public class Employee extends Person{


    @Override
    public void introduce() {
        System.out.println("Ten pracownik ma na imie "+this.getName() + " i mam " + this.getAge()+" lat.");
    }

    public Employee(String nazwa, int wiek) {
       super(nazwa,wiek);
    }


    public static void main(String[] args) {
        Employee mietek = new Employee("Mietek",18);
        Employee ziutek = new Employee("Ziutek",40);
        mietek.introduce();
        ziutek.introduce();


    }
}
