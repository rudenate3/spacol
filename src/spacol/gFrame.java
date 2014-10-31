package spacol;

import javax.swing.*;
import java.awt.*;

/**
 * Created by hdtech on 10/30/2014.
 */
public class gFrame extends JFrame {

    public gFrame() {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SpaCol");
        this.setVisible(true);
        this.setPreferredSize(new Dimension(600,600));
        this.add(new topPanel());
        this.add(new mainPanel());
        this.add(new actionPanel());

        this.pack(); // should be last.

        
    }
}
