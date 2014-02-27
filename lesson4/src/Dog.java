/**
 * Created by ecasilla on 12/16/13.
 */
public abstract class Dog implements Movable {
    private String name;
    private String breed;
    private int numberOfLegs;
    // private int numberOfLegs=4;

    public Dog(){
        this.numberOfLegs = 4;
        this.name = "Rover";
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    public abstract String getBreed();

    public String bark(){return "Woof";}

    public int numberOfLegs(){
     return this.numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public move(){
        return this.name + "walked 4 steps";
    }
}
