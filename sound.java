class Animal {
    String name, sound;
    int leg;
    public void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Sound: " + sound);
        System.out.println("Legs: " + leg);
    }
}

public class sound {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Dog";
        dog.sound = "bark";
        dog.leg = 4;
       
        Animal tiger = new Animal();
        tiger.name = "Tiger";
        tiger.sound = "Roar";
        tiger.leg = 4;
        dog.displayAnimal();
        tiger.displayAnimal();
        
    }
}