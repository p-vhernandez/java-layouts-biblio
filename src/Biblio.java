import utils.Utils;

import javax.swing.*;

public class Biblio extends JFrame {

    private final BiblioUI view;

    public Biblio() {
        this.view = new BiblioUI(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUpAppIcon();
        setUpUI();
    }

    private void setUpAppIcon() {
        setIconImage(Utils.generateImage(this,
                "resources/img/books.png"));
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

}
