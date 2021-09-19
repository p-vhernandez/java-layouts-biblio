package components;

import utils.Utils;

import javax.swing.*;
import java.awt.*;

public class DocumentDetailsUI {

    private final DocumentDetails documentDetails;

    public DocumentDetailsUI(DocumentDetails documentDetails) {
        this.documentDetails = documentDetails;
    }

    public void initializeUI() {
        documentDetails.setLayout(new FlowLayout(FlowLayout.LEFT));
        documentDetails.setPreferredSize(new Dimension(Utils.getFullScreenWidth(),
                Utils.getDocDetailsHeight()));

        generateDummyLabel();
    }

    private void generateDummyLabel() {
        JLabel label = new JLabel();
        label.setText("This is supposed to be the panel that displays" +
                " all the document details, but it is empty for now" +
                " 'cause we are just displaying layouts.");

        documentDetails.add(label);
    }

}
