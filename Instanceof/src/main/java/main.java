public class main {
    public static void main(String[] args) {
        String str = "Program";
        boolean result;

        // checks if str is an instance of
        // the String class
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);
    }
}
