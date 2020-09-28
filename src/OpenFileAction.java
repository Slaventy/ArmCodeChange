import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class OpenFileAction extends Component implements ActionListener {
    private String pathFile = ".";  //путь к файлу изначально открываем рабочую папку
    private final JFrame jFrame;
    private final String titleThis;
    public OpenFileAction(JFrame frame, String title){
        jFrame = frame;
        titleThis = title;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        FrameContent.textArea.removeAll();
                try {
                    JFileChooser chooser = new JFileChooser();
                    StringBuilder stringBuilder = new StringBuilder();
                    chooser.setCurrentDirectory(new File(pathFile));
                    chooser.showOpenDialog(OpenFileAction.this);
                    File openFile = chooser.getSelectedFile().getAbsoluteFile();
                    pathFile = openFile.getAbsolutePath(); //заменим путь к файлу на текущею папку
                    Scanner scanner = new Scanner(openFile, "Cp866");
                    while(scanner.hasNextLine()){
                        stringBuilder.append(scanner.nextLine()).append("\n");
                    }
                    FrameContent.textArea.setText(stringBuilder.toString());
                    jFrame.setTitle(titleThis + " - " + openFile.getName());
                }catch (Exception exception){
                    exception.printStackTrace();
                }
    }
}
