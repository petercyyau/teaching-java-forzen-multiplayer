// Define a base class "Character"
class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    // Method overriding and polymorphism
    public void introduce() {
        System.out.println("Hi, I'm " + name + "!");
    }

    // Method overriding and polymorphism
    public void useSpecialPower() {
        System.out.println(name + " doesn't have a special power.");
    }
}

// Define a derived class "Elsa" that inherits from "Character"
class Elsa extends Character {
    public Elsa() {
        super("Elsa");
    }

    // Method overriding and polymorphism
    @Override
    public void useSpecialPower() {
        System.out.println("I can create ice and snow!");
    }
}

// Define a derived class "Anna" that inherits from "Character"
class Anna extends Character {
    public Anna() {
        super("Anna");
    }

    // Method overloading and polymorphism
    public void introduce(String siblingName) {
        System.out.println("Hi, I'm " + getName() + "! I'm " + siblingName + "'s sister.");
    }

    // Method overriding and polymorphism
    @Override
    public void useSpecialPower() {
        System.out.println("I don't have any special powers, but I'm brave!");
    }
}

// Define a derived class "Olaf" that inherits from "Character"
class Olaf extends Character {
    public Olaf() {
        super("Olaf");
    }

    // Method overriding and polymorphism
    @Override
    public void introduce() {
        System.out.println("Hi, I'm Olaf, the friendly snowman!");
    }

    // Method overriding and polymorphism
    @Override
    public void useSpecialPower() {
        System.out.println("I can give warm hugs!");
    }
}

// Define a derived class "Kristoff" that inherits from "Character"
class Kristoff extends Character {
    public Kristoff() {
        super("Kristoff");
    }

    // Method overriding and polymorphism
    @Override
    public void useSpecialPower() {
        System.out.println("I'm great at ice harvesting and I have a loyal reindeer friend, Sven!");
    }
}

// Main class to test the inheritance and polymorphism
public class FrozenCharacters {
    public static void main(String[] args) {
        Character elsa = new Elsa();
        Character anna = new Anna();
        Character olaf = new Olaf();
        Character kristoff = new Kristoff();

        // Polymorphism - invoking overridden methods
        elsa.introduce();
        elsa.useSpecialPower();

        anna.introduce();
        anna.useSpecialPower();

        // Method overloading and polymorphism
        anna.introduce("Elsa");

        olaf.introduce();
        olaf.useSpecialPower();

        kristoff.introduce();
        kristoff.useSpecialPower();
    }
}
