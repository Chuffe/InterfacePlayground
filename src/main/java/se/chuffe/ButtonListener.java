package se.chuffe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Chuffe' on 2017-02-13.
 */
public class ButtonListener implements ActionListener {
    Spel spel;
    public void setSpel(Spel spel){
        this.spel = spel;
    }
    public void actionPerformed(ActionEvent e) {
        if ("FIGHT".equals(e.getActionCommand())){
            spel.fight();
        }
    }
}
