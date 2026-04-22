import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class ExamFileGUI {

    public static void main(String[] a) {
        JFrame f = new JFrame();
        JTextField t = new JTextField(15);
        JCheckBox c = new JCheckBox("Accept Terms");
        JButton b = new JButton("Submit");

        f.setLayout(new java.awt.FlowLayout());
        f.add(t);
        f.add(c);
        f.add(b);

        b.addActionListener(e -> {
            if (c.isSelected()) {
                try (FileWriter w = new FileWriter("exam.txt", true)) {
                    w.write(t.getText() + "\n");
                    JOptionPane.showMessageDialog(f, "Saved!");
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(f, "Error saving file");
                }
            } else {
                JOptionPane.showMessageDialog(f, "Please accept terms first");
            }
        });

        f.setSize(300, 200);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
}
