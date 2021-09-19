package components;

import utils.Utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SidePanel extends JPanel {

    public SidePanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBackground(Color.lightGray);
        setPreferredSize(new Dimension(Utils.getSidePanelWidth(),
                Utils.getFullScreenHeight()));

        setUpUI();
    }

    private void setUpUI() {
        JButton button1 = Utils.generateIconButton(this, "document", "First doc");
        JButton button2 = Utils.generateIconButton(this, "document", "Second doc");

        add(createButtonPanel(button1));
        add(createButtonPanel(button2));
    }

    private JPanel createButtonPanel(JButton button) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.setMaximumSize(new Dimension(Utils.getSidePanelWidth(),
                Utils.getSidePanelWidth() - 50));
        panel.setPreferredSize(panel.getMaximumSize());
        panel.setBorder(new EmptyBorder(10, 10, 0, 10));
        panel.setBackground(Color.lightGray);
        panel.add(button);

        return panel;
    }

}
