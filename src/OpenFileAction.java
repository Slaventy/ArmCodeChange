import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class OpenFileAction extends Component implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("."));
                chooser.showOpenDialog(OpenFileAction.this);
                File openFile = chooser.getSelectedFile().getAbsoluteFile();
        StringBuilder stringBuilder = new StringBuilder();
                try {
//                    FileReader fileReader = new FileReader(openFile);

                    Scanner scanner = new Scanner(openFile, "Cp866");
                    while(scanner.hasNextLine()){
                        stringBuilder.append(scanner.nextLine()).append("\n");
                    }
                    FrameContent.string = stringBuilder.toString();
                    FrameContent.textArea.append(FrameContent.string);
                }catch (Exception exception){
                    exception.printStackTrace();
                }

    }

}
