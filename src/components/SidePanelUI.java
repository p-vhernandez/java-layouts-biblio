package components;

import utils.Utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SidePanelUI {

    private final SidePanel sidePanel;

    public SidePanelUI(SidePanel sidePanel) {
        this.sidePanel = sidePanel;
    }

    public void initializeUI() {
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.PAGE_AXIS));
        sidePanel.setBackground(Color.lightGray);
        sidePanel.setPreferredSize(new Dimension(Utils.getSidePanelWidth(),
                Utils.getFullScreenHeight()));

        generateFakeThumbnails();
    }

    private void generateFakeThumbnails() {
        JButton button1 = Utils.generateIconButton(this, "document", "First doc");
        JButton button2 = Utils.generateIconButton(this, "document", "Second doc");

        sidePanel.add(createButtonPanel(button1));
        sidePanel.add(createButtonPanel(button2));
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
