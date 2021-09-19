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
        setPreferredSize(new Dimension(Utils.getFullScreenWidth(),
                Utils.getToolbarHeight()));
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
        searchBar.setPlaceholder(Utils.getTxtSearch());
        searchBar.setPreferredSize(new Dimension(Utils.getSearchBarWidth(),
                Utils.getSearchBarHeight()));
        searchBar.setMaximumSize(searchBar.getPreferredSize());

        add(searchBar);
    }

    private void setUpFinalButton() {
        JButton btnQuotes = Utils.generateIconButton(
                this, "left-quote", "Custom quotes");

        add(btnQuotes);
    }

}
