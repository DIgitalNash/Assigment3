package org.example;

/**
 * Hello world!
 *
 */
public class App 
{



    public static void main( String[] args )
    {
       Animal a = new Animal();
       Animal Cat = new Cat();
       Animal Dog = new Dog();

        System.out.println("Default Animal:\nType: " + a.getType() + "\nHas legs: " + a.hasLegs() + "\nSays: '" + a.speak() + "'\n" );
        System.out.println("Cat:\nType: " + Cat.getType() + "\nHas legs: " + Cat.hasLegs() + "\nSays: '" + Cat.speak() + "'\n" );
        System.out.println("Dog:\nType: " + Dog.getType() + "\nHas legs: " + Dog.hasLegs() + "\nSays: '" + Dog.speak() + "'\n" );


       Truck T1 = new Truck();
       Bus B1 = new Bus();

        System.out.println("Truck model: " + T1.getModel() + "\nTruck Max Load: " + T1.getMaxLoad());
        System.out.println("Bus model: " + B1.getModel() + "\nBus Max Load: " + B1.getMaxLoad());




    }





}
