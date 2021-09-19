package components;

import javax.swing.*;

public class SidePanel extends JPanel {

    private final SidePanelUI view;

    public SidePanel() {
        this.view = new SidePanelUI(this);

        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
