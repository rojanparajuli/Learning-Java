import javax.swing.*;
import java.io.*;

public class SwingUserDetail {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField name = new JTextField(20);
        JTextField surname = new JTextField(20);
        JTextField age = new JTextField(3);
        JCheckBox c = new JCheckBox("Accept Terms");
        JButton b = new JButton("Submit");
        f.setLayout(
                new java.awt.FlowLayout());
        f.add(name);
        f.add(surname);
        f.add(age);
        f.add(c);
        f.add(b);
        b.addActionListener(
                e -> {
                    if (c.isSelected()) {
                        try (FileWriter w = new FileWriter("details.txt")) {

                            w.write("Name:"+name.getText() + "\n"+"Surname:" + surname.getText() + "\n" +"age:"+ age.getText() + "\n");
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
