public class Dog {
    private String breed, name, color;

    public Dog(String Breed, String Name, String Color){
        this.breed = Breed;
        this.name = Name;
        this.color = Color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
