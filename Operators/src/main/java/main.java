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


        // Унарный оператор Java
        // объявление переменных
        int c = 12, v = 12;
        int result1, result2;

        // исходное значение
        System.out.println("Значение с : " + c);

        // оператор инкремента
        result1 = ++c;
        System.out.println("После инкремента: " + result1);
        System.out.println("Значение v : " + v);

        // оператор декремента
        result2 = --v;
        System.out.println("После декремента: " + result2);




        // Тернарный оператор Java
        int februaryDays = 29;
        String result;

        // тернарный оператор
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);



        // Побитовые операторы Java

        // если int f = 010
        // Java считает это восьмеричным значением из 8, поскольку число начинается с 0.

        // объявление переменных
        int f = 0x0005;
        int g = 0x0007;

        // поразрядно и 0101 & 0111 = 0101
        System.out.println("f&g = " + (f & g));

        // поразрядно и 0101 | 0111 = 0111
        System.out.println("f|g = " + (f | g));

        // побитовый xor 0101 ^ 0111 = 0010
        System.out.println("f^g = " + (f ^ g));

        // поразрядно и  ~ 0101 = 1010
        System.out.println("~f = " + ~f);

        // Также можно комбинировать с оператором присваивания для краткого обозначения.
        f &= g;
        System.out.println("f = " + f);


        // Операторы сдвига

        /*
        Эти операторы используются для сдвига битов числа влево или вправо,
        таким образом, умножая или деля число на два соответственно.
        Их можно использовать, когда нам нужно умножить или разделить число на два.

        1. <<, Оператор сдвига влево: сдвигает биты числа влево и в результате заполняет 0 в пустых полях.
        Аналогичный эффект умножения числа с некоторой степенью двойки.
        2. >>, Оператор сдвига со знаком: сдвигает биты числа вправо и в результате заполняет 0 в пустотах слева.
        Крайний левый бит зависит от знака начального номера.
        Аналогичный эффект деления числа с некоторой степенью двойки.
        3. >>>, Оператор сдвига без знака вправо: сдвигает биты числа вправо и в результате заполняет 0 в пустых полях.
        Крайний левый бит установлен в 0
        */

        // объявление переменных
        int r = 0x0005;
        int t = -10;

        // оператор левого смещения 0000 0101 << 2 = 0001 0100 (20) аналогично 5 * (2 ^ 2)
        System.out.println("r<<2 = " + (r << 2));

        // Оператор вправо 0000 0101 >> 2 = 0000 0001 (1) аналогично 5 / (2 ^ 2)
        System.out.println("r>>2 = " + (r >> 2));

        // беззнаковый оператор смещения вправо
        System.out.println("t>>>2 = " + (t >>> 2));


        // Экземпляр оператора Java - в другом файле "Instanceof"






    }
}
