import javax.swing.*;
import java.awt.*;

public class FrameContent extends JFrame {
    private static final int DEFAULT_WEIGHT = 800;
    private static final int DEFAULT_HEIGHT = 800;
    protected static String string = "11223554";
    protected static JTextArea textArea = new JTextArea();

    public FrameContent(String str){
        //В окне создаем менюБар
        JMenuBar jMenuBar = new JMenuBar();

        //Создаем текстовое поле
        textArea.setEditable(false);//поле не редактируется
        textArea.setFont(new Font("Consolas", Font.PLAIN, 11));//меняем стиль

        //Пункты менюБар
        JMenu jFile = new JMenu("File");
        JMenu jHelp = new JMenu("Help");

        //Содердимое пунктов менюБар
        JMenuItem jOpen = new JMenuItem("Open");
        JMenuItem jSave = new JMenuItem("Save");
        JMenuItem jPrint = new JMenuItem("Print");
        JMenuItem jExit = new JMenuItem("Exit");
        JMenuItem about = new JMenuItem("About");
        JMenuItem instruction = new JMenuItem("Instruction");

        //Добавим элементы в менюБар
            //Подменю File
        jFile.add(jOpen);
        jFile.add(jSave);
        jFile.add(jPrint);
        jFile.add(jExit);

            //Подменю Help
        jHelp.add(instruction);
        jHelp.add(about);
            //внесение в менюБар
        jMenuBar.add(jFile);
        jMenuBar.add(jHelp);

        //Устанавливаем во фрейм менюБар
        setJMenuBar(jMenuBar);

        //Слушаем пункты менюБар
        jOpen.addActionListener(new OpenFileAction());

        add(textArea);
        jSave.addActionListener(new SaveFileAction());
        jPrint.addActionListener(new PrintAction());
        jExit.addActionListener(new ExitAction());
        about.addActionListener(new AboutAction());
        instruction.addActionListener(new InstructionAction());

        //установки фрейма
        setSize(DEFAULT_WEIGHT, DEFAULT_HEIGHT);
        setTitle(str);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
