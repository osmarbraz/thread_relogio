
import javax.swing.UIManager;

public class Principal {

    boolean packFrame = false;

    public Principal() {

        FrmJanela frame = new FrmJanela();
        if (packFrame) {
            frame.pack();
        } else {
            frame.validate();
        }
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Principal();
    }
}
