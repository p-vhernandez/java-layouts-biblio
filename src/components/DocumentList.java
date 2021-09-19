package components;

import javax.swing.*;

public class DocumentList extends JPanel {

    private final DocumentListUI view;

    public DocumentList() {
        this.view = new DocumentListUI(this);

        setUpUI();
    }

    private void setUpUI() {
        this.view.initializeUI();
    }

    static final String[] COLUMN_NAMES = {
            "Key quotes",
            "Title",
            "Date",
            "Author",
            "Topic",
            "Added"
    };

    static final Object[][] TABLE_DATA = {
            {"wilson01", "This is title 1", "01/01/2020", "Author 1", "Design", "03/03/2021"},
            {"wilson02", "This is title 2", "01/01/2020", "Author 2", "Maths", "03/03/2021"},
            {"wilson03", "This is title 3", "01/01/2020", "Author 3", "Cryptocurrency", "03/03/2021"},
            {"wilson04", "This is title 4", "01/01/2020", "Author 4", "Design", "03/03/2021"},
            {"wilson05", "This is title 5", "01/01/2020", "Author 5", "Design", "03/03/2021"},
            {"wilson06", "This is title 6", "01/01/2020", "Author 6", "Physics", "03/03/2021"},
            {"wilson07", "This is title 7", "01/01/2020", "Author 7", "Design", "03/03/2021"},
            {"wilson08", "This is title 8", "01/01/2020", "Author 8", "UX/UI", "03/03/2021"},
            {"wilson09", "This is title 9", "01/01/2020", "Author 9", "Design", "03/03/2021"},
    };

}
