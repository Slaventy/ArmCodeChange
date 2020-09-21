import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

public class PrintAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JEditorPane text = new JEditorPane("cp1251", FrameContent.string);
        text.setFont(new Font("Consolas", Font.PLAIN, 9));//меняем стиль на отображаемый
        text.setAutoscrolls(true);
        PrintService service = PrintServiceLookup.lookupDefaultPrintService();

        try {
            text.print(null, null, true, service, null, true);
        } catch (PrinterException e1) {
            e1.printStackTrace();
        }
    }
}
