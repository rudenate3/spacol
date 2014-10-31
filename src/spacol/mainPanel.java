package spacol;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

/**
 * Created by hdtech on 10/31/2014.
 */
public class mainPanel extends JPanel {

    public mainPanel() {
        this.setLayout(new FlowLayout());
        this.setBounds(5, 105, 570, 400);
        this.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));

    }
}
