package pl.kodolamacz.podstawy.pl.kodolamacz.podstawy.klasy;

public class Pilkarz extends Person{
    private String klub;

    public Pilkarz(String name, int age, String klub) {
        super(name, age);
        this.klub = klub;
    }

    public String getKlub() {

        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    @Override
    public void introduce() {
        System.out.println("Jestem "+this.getName()+" i gram w " + this.getKlub());
    }
}
