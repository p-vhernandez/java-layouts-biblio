package components;

import utils.PlaceholderTextField;
import utils.Utils;

import javax.swing.*;
import java.awt.*;

public class BiblioToolbarUI {

    private final BiblioToolbar toolbar;

    public BiblioToolbarUI(BiblioToolbar toolbar) {
        this.toolbar = toolbar;
    }

    public void initializeUI() {
        toolbar.setPreferredSize(new Dimension(Utils.getFullScreenWidth(),
                Utils.getToolbarHeight()));
        toolbar.setMaximumSize(toolbar.getPreferredSize());
        toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));

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

        toolbar.add(btnAction);
        toolbar.add(btnNew);
        toolbar.add(btnEdit);
        toolbar.add(btnDelete);
        // add(Box.createHorizontalGlue());
    }

    private void setUpSearchBar() {
        PlaceholderTextField searchBar = new PlaceholderTextField();
        searchBar.setPlaceholder(Utils.getTxtSearch());
        searchBar.setPreferredSize(new Dimension(Utils.getSearchBarWidth(),
                Utils.getSearchBarHeight()));
        searchBar.setMaximumSize(searchBar.getPreferredSize());

        toolbar.add(searchBar);
    }

    private void setUpFinalButton() {
        JButton btnQuotes = Utils.generateIconButton(
                this, "left-quote", "Custom quotes");

        toolbar.add(btnQuotes);
    }

}
