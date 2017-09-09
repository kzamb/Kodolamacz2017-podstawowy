package pl.kodolamacz.podstawy.pl.kodolamacz.podstawy.klasy;

public abstract class Person implements NamedEntity{
    private String name;
    private int age;
    public abstract void introduce();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sing() {
        System.out.println("Nie umiem spiewac");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
