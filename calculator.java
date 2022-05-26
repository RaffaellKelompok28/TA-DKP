import java.awt.*;
import java.awt.event.*;

class calculator extends Frame implements ActionListener {

    TextField text;
    Panel panel;
    String button[] = {
            "7",
            "8",
            "9",
            "+",
            "4",
            "5",
            "6",
            "-",
            "1",
            "2",
            "3",
            "*",
            "AC",
            "0",
            "/",
            "="
    };
    Button btn[] = new Button[16];
    double A = 0, B = 0, output = 0;
    char opt;

    public calculator() {

        Font f = new Font("Helvetica", Font.PLAIN, 20);

        text = new TextField(10);
        text.setFont(f);
        text.setBackground(Color.gray);
        panel = new Panel();
        panel.setBackground(Color.RED);
        add(text, "North");
        add(panel, "Center");
        panel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 16; i++) {

            btn[i] = new Button(button[i]);
            btn[i].setFont(f);
            btn[i].setBackground(Color.BLACK);
            btn[i].addActionListener(this);
            panel.add(btn[i]);
        }

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {

        String str = ae.getActionCommand();

        if (str.equals("+")) {

            opt = '+';
            A = Integer.parseInt(text.getText());
            text.setText("");
        } else if (str.equals("-")) {
            opt = '-';
            A = Integer.parseInt(text.getText());
            text.setText("");
        } else if (str.equals("*")) {
            opt = '*';
            A = Integer.parseInt(text.getText());
            text.setText("");
        } else if (str.equals("/")) {
            opt = '/';
            A = Integer.parseInt(text.getText());
            text.setText("");
        } else if (str.equals("=")) {

            B = Integer.parseInt(text.getText());

            switch (opt) {

                case '+':
                    output = A + B;
                    break;
                case '-':
                    output = A - B;
                    break;
                case '*':
                    output = A * B;
                    break;
                case '/':
                    try {
                        output = A / B;
                    } catch (Exception e) {
                        text.setText(String.valueOf(output));
                        break;
                    }

            }
            text.setText(output + "");
            output = 0;
        } else if (str.equals("AC")) {

            text.setText("");
            A = B = output = 0;
        } else {
            text.setText(text.getText() + str);
        }
    }
}