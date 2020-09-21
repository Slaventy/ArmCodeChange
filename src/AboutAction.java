import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame aboutAction1 = new JFrame("About");
        aboutAction1.setSize(250,100);
        JTextArea textAreaAbout = new JTextArea();

        textAreaAbout.setFont(new Font("Arial", Font.BOLD, 24));
        textAreaAbout.setForeground(Color.DARK_GRAY);
        textAreaAbout.append("версия 0.001 Beta\n");

        textAreaAbout.setFont(new Font("Arial", Font.ITALIC, 12));
        textAreaAbout.setForeground(Color.GRAY);
        textAreaAbout.append("Разработчик Лебедев В.Е.");

        textAreaAbout.setEditable(false);

        aboutAction1.add(textAreaAbout);
        aboutAction1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aboutAction1.setAlwaysOnTop(true);
        aboutAction1.setVisible(true);
    }
}
