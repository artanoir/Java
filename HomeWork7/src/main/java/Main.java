public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik1", 35),
                new Cat("Barsik2", 25),
                new Cat("Barsik3", 18),
                new Cat("Barsik4", 28),
                new Cat("Barsik5", 13),
        };

        Plate plate = new Plate(80);
        plate.inInfo();
        for(Cat itemCat:cats) {
            itemCat.eat(plate);
            itemCat.info();
        }
        plate.offInfo();


    }
}
