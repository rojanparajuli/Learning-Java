import javax.swing.*;

class SquareNumber{
    public static void main(String[] a) {
        JFrame f = new JFrame();
        JTextField t = new JTextField(10);
        JButton b = new JButton("Square");
        JLabel l = new JLabel("Result:");
        f.add(new JPanel() {
            {
                add(t);
                add(b);
                add(l);
            }
        });
        b.addActionListener(e -> {
            try {
                int n = Integer.parseInt(t.getText());
                l.setText("Result:" + n * n);
            } catch (Exception x) {
                l.setText("Invalid");
            }
        });
        f.setSize(300, 200);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
}