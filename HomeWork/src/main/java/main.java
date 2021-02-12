public class main {
    public static void main(String[] args) {
        QuestionTwo();
        System.out.println("a * (b + (c / d)) = " + QuestionThree(4,3,2,1));
        System.out.println(QuestionFour(9, 2));
        QuestionFive(-10);
        System.out.println(QuestionSix(-5));
        QuestionSeven("BANANA");
        QuestionEight(2021);


    }

    static void QuestionTwo() {
        System.out.println("2--------------");
        boolean b = false;
        byte bt = 3;
        long l = 5L;
        int i = 4;
        short s = 8;
        float f = 2.7F;
        double d = 8.5;
        char ch = 102; // символ 'f'
        System.out.println("boolean = " + b);
        System.out.println("byte = " + bt);
        System.out.println("long = " + l);
        System.out.println("int = " + i);
        System.out.println("short = " + s);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("char = " + ch);

    }

    static float QuestionThree(float a, float b, float c, float d) {
        System.out.println("3--------------");
        return a * (b + (c / d));
    }

    static boolean QuestionFour(int a, int b) {
        System.out.println("4--------------");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;

    }

    static void QuestionFive(int a) {
        System.out.println("5--------------");
        if (a >= 0) System.out.println("Число положительное: " + a);
        else System.out.println("Число отрицательное: " + a);
    }

    static boolean QuestionSix(int a) {
        System.out.println("6--------------");
        if (a < 0) return true;
        return false;
    }

    static void QuestionSeven(String name) {
        System.out.println("7--------------");
        System.out.println("GOODBY, " + name + "!:D");
    }

    static void QuestionEight(int year) {
        System.out.println("*--------------");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " Не високосный");
        else System.out.println(year + " Високосный");
    }
}


