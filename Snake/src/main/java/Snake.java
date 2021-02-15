import javax.swing.*;

public class Snake extends JFrame {
    public Snake (){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        add(new Game());
        setVisible(true);
    }
    public static void main(String[] args) {
        Snake mw = new Snake();
    }

}
