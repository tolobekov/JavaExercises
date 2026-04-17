package mooc.part1.ch4;

public class Film {
    private String name;
    private int ageRating;

    public Film(String name, int rating) {
        this.name = name;
        this.ageRating = rating;
    }

    public String name() {
        return name;
    }

    public int ageRating() {
        return this.ageRating;
    }

}
