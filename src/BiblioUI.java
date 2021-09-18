import components.BiblioToolbar;

import javax.swing.*;
import java.awt.*;

public class BiblioUI {

    private final Biblio biblio;
    private final BorderLayout biblioLayout;

    public BiblioUI (Biblio biblio) {
        this.biblio = biblio;
        this.biblioLayout = new BorderLayout();
    }

    public void initializeUI() {
        biblio.setTitle("Biblio.bib");
        biblio.setPreferredSize(new Dimension(850, 850));
        biblio.setLayout(biblioLayout);

        setUpToolbar();
    }

    private void setUpToolbar() {
        BiblioToolbar biblioToolbar = new BiblioToolbar();
        biblio.add(biblioToolbar, BorderLayout.NORTH);
    }

    private void setUpDocumentList() {
        JPanel listPanel = new JPanel();
        biblio.add(listPanel);
    }

}
