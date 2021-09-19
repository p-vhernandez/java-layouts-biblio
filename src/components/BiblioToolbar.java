package components;

import javax.swing.*;

public class BiblioToolbar extends JToolBar {

    private final BiblioToolbarUI view;

    public BiblioToolbar() {
        this.view = new BiblioToolbarUI(this);

        setFloatable(false);
        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
