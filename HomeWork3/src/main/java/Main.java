import java.util.Random;
import java.util.Scanner;

    public class Main {


        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            //playLevelOne();
            playLevelTwo();
            scanner.close();

        }

        private static void playLevelOne (){
            System.out.println("Ваша задача угадать число");
            int round = 3;
            int range = 9;
            int number = (int) (Math.random() * range);
            while (round > 0){
                System.out.println("Угадайте число от 0 до " + range);
                System.out.println("У вас  " + round + " попытки");
                int input_number = scanner.nextInt();
                if (input_number == number){
                    System.out.println("Вы угадали");
                }else if (input_number < number){
                    System.out.println("Загаданное число больше");
                    round--;
                }else {
                    System.out.println("Загаданное число меньше");
                    round--;
                }if (round == 0 || input_number == number){
                    System.out.println("THE END");
                    int not = 1;
                    int yes = 2;
                    System.out.println("Повторить игру еще раз? 1 – NO / 2 – YES");
                    int input_level = scanner.nextInt();
                    if (input_level == yes){
                        playLevelOne();
                    }else {
                        System.exit(1);
                    }
                }
            }
        }

        private static void playLevelTwo(){
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                    "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                    "pear", "pepper", "pineapple", "pumpkin", "potato"};
            Random random = new Random();
            int indWord = random.nextInt(words.length - 1);
            String word = words[indWord];
            int lenWord = word.length();
            System.out.println("Я загадал слово, попробуй отгадать его");
            System.out.println(word);

            do {
                System.out.println("Введи свой ответ: (для выхода из игры, просто нажмите Enter)");
                String answer = scanner.nextLine();

                if (answer.equals("")){
                    break;
                }else if (word.equals(answer)) {
                    System.out.println("Вы угадали слово, игра закончена!!!");
                    return;
                }
                char[] charsAnswer = answer.toCharArray();
                for (int i = 0; i < lenWord; i++) {
                    if (i >= charsAnswer.length) {
                        break;
                    }if (word.charAt(i) != charsAnswer[i]){
                        charsAnswer[i] = '-';
                    }

                }
                String masAnswer = new String(charsAnswer);
                StringBuffer sb = new StringBuffer(masAnswer);
                sb = new StringBuffer(sb);
                System.out.println(sb.replace(2, 14, "-------"));
            }
            while (true);
        }

    }
