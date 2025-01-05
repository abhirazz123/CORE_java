package DEC_05;

class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void makeSound() {
        System.out.println("Generic animal sound");
    }

    @Override
    public String toString() {
        return "Animal species=" + species;
    }

    public Animal reproduce() {
        System.out.println("Generic reproduction method for all animals.");
        return new Animal("Unknown");
    }
}

class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String species, boolean hasFur) {
        super(species);
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println(getSpecies() + " makes a mammalian sound.");
    }

    @Override
    public String toString() {
        return "Mammal: " + getSpecies() + ", Has fur: " + hasFur;
    }

    @Override
    public Mammal reproduce() {
        System.out.println("Mammals give birth to live young.");
        return new Mammal(getSpecies() + " offspring", hasFur);
    }
}

public class ZooSimulation {
    public static void main(String[] args) {
        Animal a1 = new Mammal("Lion", false);

        
        System.out.println("Species: " + a1.getSpecies());

        
        a1.makeSound();

        
        System.out.println("Details: " + a1.toString());

       
        Animal offspring = a1.reproduce();
        System.out.println("Offspring: " + offspring.toString());
    }
}
