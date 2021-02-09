public class main {
    public static void main(String[] args) {

        // Арифметические операторы Java
        // объявление переменных
        int a = 12, b = 5;

        // оператор сложения
        System.out.println("a + b = " + (a + b));

        // оператор вычитания
        System.out.println("a - b = " + (a - b));

        // оператор умножения
        System.out.println("a * b = " + (a * b));

        // оператор деления
        System.out.println("a / b = " + (a / b));

        // оператор по модулю дает остаток при делении первого операнда на второй
        System.out.println("a % b = " + (a % b));


        // Операторы присваивания
        // объявление переменных
        int s = 4;
        int var;

        // присвоение значение с помощью =
        var = s;
        System.out.println("var using =: " + var);

        // присвоение значение с помощью =+
        var += s;
        System.out.println("var using +=: " + var);

        // присвоение значение с помощью =*
        var *= s;
        System.out.println("var using *=: " + var);


        // Реляционные операторы Java
        // объявление переменных
        int y = 7, x = 11;

        // значение у и х
        System.out.println("y is " + y + " and x is " + x);

        // == 
        System.out.println(y == x);  // false

        // != 
        System.out.println(y != x);  // true

        // > 
        System.out.println(y > x);  // false

        // < 
        System.out.println(y < x);  // true

        // >= 
        System.out.println(y >= x);  // false

        // <= 
        System.out.println(y <= x);  // true


        // Логические операторы Java
        // && логическое И 
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || логическое ИЛИ
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! логическое отрицание
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
        
        /*
        (5 > 3) && (8 > 5) вернёт true потому что оба (5 > 3) и (8 > 5) правда.
        (5 > 3) && (8 < 5) вернёт false потому что (8 < 5) не правда.
        (5 > 3) || (8 > 5) вернёт true потому что (8 > 5) правда.
        (5 > 3) && (8 > 5) вернёт true потому что (5 > 3) правда.
        (5 > 3) && (8 > 5) вернёт false потому что оба (5 < 3) и (8 < 5) не правда.
        !(5 == 3) вернёт true потому что 5 == 3 не правда.
        !(5 > 3) вернёт false потому что 5 > 3 правда.
        */


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
