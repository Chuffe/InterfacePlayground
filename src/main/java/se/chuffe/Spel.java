package se.chuffe;

/**
 * Created by Chuffe' on 2017-02-13.
 */
public class Spel {
    UI ui;
    public void setUi(UI ui){
        this.ui = ui;
    }
    public void fight() {
        ui.addMessage("FIGHT");
    }
}
