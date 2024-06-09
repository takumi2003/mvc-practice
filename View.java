import javax.swing.JFrame;
import javax.swing.JLabel;

public class View {
    private JFrame frame;
    private JLabel label;

    public View(String text){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);

        label = new JLabel(text);
        frame.getContentPane().add(label);

        frame.setVisible(true);
    }

    public void setText(String text){
        label.setText(text);
    }
    
}
