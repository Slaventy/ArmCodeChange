import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructionAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame instruction1 = new JFrame("Instruction");
        instruction1.setSize(500, 250);
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.BOLD, 24));
        textArea.setForeground(Color.DARK_GRAY);
        textArea.append("ИНСТРУКЦИЯ");
        JTextArea textArea1 = new JTextArea();
        textArea1.setFont(new Font("Arial", Font.ITALIC, 12));
        textArea1.setForeground(Color.gray);
        ScrollPane scrollbar = new ScrollPane();
        textArea1.setColumns(5);
        scrollbar.add(textArea1);
        textArea1.append("Программа предназначена для преобразования текста\nформата CP866 в формат UTF-8.\n1.Открыть файл формата CP866: File->Open\n" +
                "2.Убедиться в читаемости информации отображенной в окне программы\n3.Сохранить файл: File->Save\n4.Выйти из программы: File->Exit");
        textArea.setEditable(false);
        textArea1.setEditable(false);
        instruction1.add(textArea, BorderLayout.NORTH);
        instruction1.add(textArea1, BorderLayout.CENTER);

        instruction1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        instruction1.setVisible(true);
    }
}
