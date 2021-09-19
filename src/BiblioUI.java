import components.BiblioToolbar;
import components.DocumentDetails;
import components.DocumentList;
import components.SidePanel;
import utils.Utils;

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
        biblio.setTitle(Utils.getAppName());
        biblio.setPreferredSize(new Dimension(Utils.getFullScreenWidth(),
                Utils.getFullScreenHeight()));
        biblio.setLayout(biblioLayout);

        setUpToolbar();
        setUpMainPanel();
        setUpSidePanel();
    }

    private void setUpToolbar() {
        BiblioToolbar biblioToolbar = new BiblioToolbar();
        biblio.add(biblioToolbar, BorderLayout.NORTH);
    }

    private void setUpMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        setUpDocumentList(mainPanel);
        setUpDocumentDetails(mainPanel);

        biblio.add(mainPanel);
    }

    private void setUpDocumentList(JPanel mainPanel) {
        DocumentList documentList = new DocumentList();
        mainPanel.add(documentList);
    }

    private void setUpDocumentDetails(JPanel mainPanel) {
        DocumentDetails documentDetails = new DocumentDetails();
        mainPanel.add(documentDetails);
    }

    private void setUpSidePanel() {
        SidePanel sidePanel = new SidePanel();
        biblio.add(sidePanel, BorderLayout.EAST);
    }

}
