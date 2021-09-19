package components;

import javax.swing.*;

public class DocumentDetails extends JPanel {

    private final DocumentDetailsUI view;

    public DocumentDetails() {
        this.view = new DocumentDetailsUI(this);

        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
