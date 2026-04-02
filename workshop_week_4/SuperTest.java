package workshop4;


class Creature {
 String name;

 
 Creature(String name) {
     this.name = name;
     System.out.println("Creature constructor called");
 }

 void displayCreature() {
     System.out.println("Name: " + name);
 }
}


class Puppy extends Creature {
 String breed;

 
 Puppy(String name, String breed) {
     super(name); 
     this.breed = breed;
     System.out.println("Puppy constructor called");
 }

 void displayPuppy() {
     displayCreature();
     System.out.println("Breed: " + breed);
 }
}


public class SuperTest {
 public static void main(String[] args) {
     Puppy p1 = new Puppy("Charlie", "Beagle");
     System.out.println();
     p1.displayPuppy();

     System.out.println();

     Puppy p2 = new Puppy("Max", "Bulldog");
     System.out.println();
     p2.displayPuppy();
 }
}