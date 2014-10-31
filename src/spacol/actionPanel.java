package spacol;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

/**
 * Created by hdtech on 10/31/2014.
 */
public class actionPanel extends JPanel {

    public actionPanel() {
        this.setLayout(new FlowLayout());
        this.setBounds(5, 545, 570, 50);
        this.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
        this.add(new Button("Buy"));
    }
}
