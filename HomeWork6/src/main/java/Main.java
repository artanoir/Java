public class Main {

    public static void main (String[] args) {
        Animal cat1 = new Cat("Boris");
        Animal cat2 = new Cat("Musya");
        Animal cat3 = new Cat("Pusya");

        Animal dog4 = new Dog("Layka");
        Animal dog5 = new Dog("Bim");
        Animal dog6 = new Dog("Reks");
        Animal dog7 = new Dog("Bobik");


        cat1.run(300);
        cat2.run(150);
        cat3.swim(10);

        dog4.run(700);
        dog5.run(450);
        dog6.swim(15);
        dog7.swim(10);


        System.out.println("\nБыло создано: "+Animal.getCount()+" животных.");
        System.out.println("Кошек: "+Cat.getCount()+" шт.");
        System.out.println("Собак: "+Dog.getCount()+" шт.");


    }

}
