import javax.swing.*;
import java.awt.*;

public class FrameContent extends JFrame {
    private static final int DEFAULT_WEIGHT = 500;
    private static final int DEFAULT_HEIGHT = 500;
    protected static JTextArea textArea;        //текстовое поле для вводимого текста
    protected String title = "ARMTextForWin";

    public FrameContent(){
        //В окне создаем менюБар
        JMenuBar jMenuBar = new JMenuBar();

        //Создаем текстовое поле
        textArea = new JTextArea(8, 40);
        textArea.setEditable(false); //поле не редактируется
        textArea.setFont(new Font("Liberation Mono", Font.PLAIN, 9));   //меняем стиль

        //создание скрол панели для текстового поля
        JScrollPane jScrollPane = new JScrollPane(textArea);

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
        //Название программы добавиться и название файла
        jOpen.addActionListener(new OpenFileAction(this, title));

        jSave.addActionListener(new SaveFileAction());
        jPrint.addActionListener(new PrintAction());
        jExit.addActionListener(new ExitAction());
        about.addActionListener(new AboutAction());
        instruction.addActionListener(new InstructionAction());

        //располагаем скрол панель с текстовым полем во фрейме
        add(jScrollPane, BorderLayout.CENTER);

        //установки фрейма
        setTitle(title);//устанавливаем название программы в заголовок
        setSize(DEFAULT_WEIGHT, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
