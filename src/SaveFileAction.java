import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFileAction extends Component implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.showSaveDialog(SaveFileAction.this);
        File saveFile = chooser.getSelectedFile().getAbsoluteFile();
        try {
            FileWriter fileWriter = new FileWriter(saveFile);
            fileWriter.write(FrameContent.textArea.getText());
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
