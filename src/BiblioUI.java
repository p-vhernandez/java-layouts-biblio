import java.awt.*;

public class BiblioUI {

    private final Biblio biblio;
    private final BorderLayout biblioLayout;

    public BiblioUI (Biblio biblio) {
        this.biblio = biblio;
        this.biblioLayout = new BorderLayout();
    }

    public void initializeUI() {
        biblio.setTitle("Biblio");
        biblio.setPreferredSize(new Dimension(800, 1000));
        biblio.setLayout(biblioLayout);

        setUpToolbar();
    }

    private void setUpToolbar() {

    }

}
