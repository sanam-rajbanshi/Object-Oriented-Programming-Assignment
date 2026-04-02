package workshop4;


class Animal {
 String name;
 int age;

 
 Animal(String name, int age) {
     this.name = name;
     this.age = age;
     System.out.println("Animal constructor called");
 }

 void displayAnimal() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}


class Dog extends Animal {
 String breed;

 
 Dog(String name, int age, String breed) {
     super(name, age); 
     this.breed = breed;
     System.out.println("Dog constructor called");
 }

 void displayDog() {
     displayAnimal();
     System.out.println("Breed: " + breed);
 }
}


public class AnimalTest {
 public static void main(String[] args) {
     Dog d = new Dog("BHAUBHAU", 3, "Golden Retriever");
     d.displayDog();
 }
}