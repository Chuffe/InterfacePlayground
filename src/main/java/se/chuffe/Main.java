package se.chuffe;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chuffe' on 2017-02-13.
 */
public class Main {
    public static void main(String[] args){
        ButtonListener bl = new ButtonListener();
        UI ui = new UI();
        ui.create(bl);
        ui.addMessage("MERP");
        ui.addMessage("DERP");
        Spel spel = new Spel();
        bl.setSpel(spel);
        spel.setUi(ui);
    }
}
