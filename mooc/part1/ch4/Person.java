package mooc.part1.ch4;

public class Person {
    private String name; // private means encapsulated
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.age = 0;
        this.height = 0;
        this.weight = 0;
        this.name = initialName;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public void growOlder() {
        this.age += 1;
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
