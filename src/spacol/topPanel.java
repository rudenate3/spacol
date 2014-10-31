package spacol;

import sun.font.TrueTypeFont;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

/**
 * Created by hdtech on 10/31/2014.
 */
public class topPanel extends JPanel {

    public topPanel() {
        this.setLayout(new FlowLayout());
        this.setBounds(5, 5, 570, 100);
      //  this.setBound
        this.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
        this.add(new JLabel("Year: "));
        this.add(new JLabel(Integer.toString(gSystem.getIntYear())));


    }


}
