package components;

import utils.Utils;

import javax.swing.*;
import java.awt.*;

public class DocumentDetails extends JPanel {

    public DocumentDetails() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(Utils.getFullScreenWidth(),
                Utils.getDocDetailsHeight()));
        setUpUI();
    }

    private void setUpUI() {
        JLabel label = new JLabel();
        label.setText("This is supposed to be the panel that displays" +
                " all the document details, but it is empty for now" +
                " 'cause we are just displaying layouts.");

        add(label);
    }

}
