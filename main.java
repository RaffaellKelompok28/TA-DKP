import java.awt.*;

public class main {
    public static void main(String args[]) {

        calculator calc = new calculator();
        Image kalku = Toolkit.getDefaultToolkit().getImage("kalku.png");
        calc.setIconImage(kalku);
        calc.setTitle("GUI - Calculator");
        calc.setSize(300, 350);
        calc.setBackground(Color.BLACK);
        calc.setForeground(Color.GREEN);
        calc.setVisible(true);
    }
}
