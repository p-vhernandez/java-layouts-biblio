package utils;

import javax.swing.*;
import java.awt.*;

public class Utils {

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
