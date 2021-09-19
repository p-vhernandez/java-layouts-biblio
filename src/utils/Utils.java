package utils;

import javax.swing.*;
import java.awt.*;

public class Utils {

    private static final int SCREEN_WIDTH = 950;
    private static final int SCREEN_HEIGHT = 850;
    private static final int TOOLBAR_HEIGHT = 70;
    private static final int SEARCHBAR_WIDTH = 250;
    private static final int SEARCHBAR_HEIGHT = 40;
    private static final int DOC_DETAILS_HEIGHT = 450;
    private static final int SIDE_PANEL_WIDTH = 150;

    private static final String APP_NAME = "Biblio.bib";
    private static final String TXT_SEARCH = "Search...";

    public static String getAppName() {
        return APP_NAME;
    }

    public static int getFullScreenWidth() {
        return SCREEN_WIDTH;
    }

    public static int getFullScreenHeight() {
        return SCREEN_HEIGHT;
    }

    public static int getToolbarHeight() {
        return TOOLBAR_HEIGHT;
    }

    public static int getSearchBarWidth() {
        return SEARCHBAR_WIDTH;
    }

    public static int getSearchBarHeight() {
        return SEARCHBAR_HEIGHT;
    }

    public static int getDocListHeight() {
        return SCREEN_HEIGHT - DOC_DETAILS_HEIGHT - TOOLBAR_HEIGHT;
    }

    public static int getDocDetailsHeight() {
        return DOC_DETAILS_HEIGHT;
    }

    public static int getSidePanelWidth() {
        return SIDE_PANEL_WIDTH;
    }

    public static int getDocTableWidth() {
        return SCREEN_WIDTH - SIDE_PANEL_WIDTH - 20;
    }

    public static String getTxtSearch() {
        return TXT_SEARCH;
    }

    public static Image generateImage(Object object, String directory) {
        return Toolkit.getDefaultToolkit()
                .getImage(object.getClass().getResource(directory));
    }

    public static JButton generateIconButton(Object object, String imgName, String btnText) {
        String directory = "../resources/img/" + imgName + ".png";
        Image image = generateImage(object, directory);

        JButton button = new JButton(btnText, new ImageIcon(image));
        button.setIcon(new ImageIcon(image));
        button.setText(btnText);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);

        return button;
    }

}
