package mooc.part1.ch4;

public class Agent {
    private String name;
    private String surname;

    public Agent(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "My name is " + this.name + ", " + this.name + " " + this.surname;
    }
}
