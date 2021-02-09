public class main {
    public static void main(String[] args) {

        // Экземпляр оператора Java
        /*
        Экземпляр оператора используется для проверки типа.
        Его можно использовать для проверки, является ли объект экземпляром класса, подкласса или интерфейса.
        */

        Person obj1 = new Person();
        Person obj2 = new Boy();

        // Поскольку объект obj имеет тип person, он не является экземпляром Boy или интерфейсом
        System.out.println("obj1 instanceof Person: " + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: " + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "+ (obj1 instanceof MyInterface));

        // Поскольку obj2 имеет тип Boy, чей родительский класс -
        // Person и реализует интерфейс Myinterface это экземпляр всех этих классов.
        System.out.println("obj2 instanceof Person: "+ (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "+ (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "+ (obj2 instanceof MyInterface));

    }
}
    class Person {
}
    class Boy extends Person implements MyInterface {
}
    interface MyInterface {
}