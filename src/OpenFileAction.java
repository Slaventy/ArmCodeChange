import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class OpenFileAction extends Component implements ActionListener {
    protected StringBuilder stringBuilder = new StringBuilder();
    protected JFileChooser chooser = new JFileChooser();

    @Override
    public void actionPerformed(ActionEvent e) {
        FrameContent.textArea.removeAll();
        stringBuilder.delete(0, stringBuilder.length());
                try {
                    chooser.setCurrentDirectory(new File("."));
                    chooser.showOpenDialog(OpenFileAction.this);
                    File openFile = chooser.getSelectedFile().getAbsoluteFile();
                    Scanner scanner = new Scanner(openFile, "Cp866");
                    while(scanner.hasNextLine()){
                        stringBuilder.append(scanner.nextLine()).append("\n");
                    }
                    FrameContent.textArea.setText(stringBuilder.toString());
                }catch (Exception exception){
                    exception.printStackTrace();
                }
    }
}
