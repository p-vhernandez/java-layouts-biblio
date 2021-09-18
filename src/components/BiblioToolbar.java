package components;

import utils.PlaceholderTextField;
import utils.Utils;

import javax.swing.*;
import java.awt.*;

public class BiblioToolbar extends JToolBar {

    public BiblioToolbar() {
        setFloatable(false);
        setUpUI();
    }

    private void setUpUI() {
        setPreferredSize(new Dimension(850, 70));
        setMaximumSize(getPreferredSize());
        setLayout(new FlowLayout(FlowLayout.LEFT));

        setUpIconButtons();
        setUpSearchBar();
        setUpFinalButton();
    }

    private void setUpIconButtons() {
        JButton btnAction = Utils.generateIconButton(
                this, "arrow", "Action");
        JButton btnNew = Utils.generateIconButton(
                this,"new", "Creation");
        JButton btnEdit = Utils.generateIconButton(
                this,"edit", "Edition");
        JButton btnDelete = Utils.generateIconButton(
                this, "trash", "Deletion");

        add(btnAction);
        add(btnNew);
        add(btnEdit);
        add(btnDelete);
        // add(Box.createHorizontalGlue());
    }

    private void setUpSearchBar() {
        PlaceholderTextField searchBar = new PlaceholderTextField();
        searchBar.setPlaceholder("Search...");
        searchBar.setPreferredSize(new Dimension(250, 40));
        searchBar.setMaximumSize(new Dimension(250, 40));

        add(searchBar);
    }

    private void setUpFinalButton() {
        JButton btnQuotes = Utils.generateIconButton(
                this, "left-quote", "Custom quotes");

        add(btnQuotes);
    }

}
