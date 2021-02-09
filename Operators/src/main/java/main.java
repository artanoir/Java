public class main {
    public static void main(String[] args) {

        //Java Arithmetic Operators
        // declare variables
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));


        //Java Assignment Operators
        // create variables
        int s = 4;
        int var;

        // assign value using =
        var = s;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += s;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= s;
        System.out.println("var using *=: " + var);


        //Java Relational Operators
        // create variables
        int y = 7, x = 11;

        // value of a and b
        System.out.println("y is " + y + " and x is " + x);

        // == operator
        System.out.println(y == x);  // false

        // != operator
        System.out.println(y != x);  // true

        // > operator
        System.out.println(y > x);  // false

        // < operator
        System.out.println(y < x);  // true

        // >= operator
        System.out.println(y >= x);  // false

        // <= operator
        System.out.println(y <= x);  // true


        //Java Logical Operators
        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false


        //Java Unary Operators
        // declare variables
        int c = 12, v = 12;
        int result1, result2;

        // original value
        System.out.println("Value of a: " + c);

        // increment operator
        result1 = ++c;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + v);

        // decrement operator
        result2 = --v;
        System.out.println("After decrement: " + result2);


        //Java Ternary Operator
        int februaryDays = 29;
        String result;

        // ternary operator
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);




    }
}
