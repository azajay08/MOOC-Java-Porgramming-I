
public class PersonPet {

    private String name;
    private Pet pet;

    public PersonPet(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public PersonPet(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    public PersonPet() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    @Override
    public String toString() {
		return this.name + ", has a friend called " + this.pet.getName() + "(" + this.pet.getBreed() + ")";
    }

}
