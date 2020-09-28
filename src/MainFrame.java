import java.awt.*;

public class MainFrame {

    public static void main(String[] args) {
        //создаем новый поток
        EventQueue.invokeLater(() -> {
            //Запускаем класс с диалоговым окном
            FrameContent frameContent = new FrameContent();
        });
    }
}

