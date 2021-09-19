package components;

import utils.Utils;

import javax.swing.*;
import java.awt.*;

public class DocumentListUI {

    private final DocumentList documentList;

    public DocumentListUI(DocumentList documentList) {
        this.documentList = documentList;
    }

    public void initializeUI() {
        documentList.setLayout(new BorderLayout());
        documentList.setPreferredSize(new Dimension(Utils.getFullScreenWidth(),
                Utils.getDocListHeight()));
        documentList.setMinimumSize(documentList.getPreferredSize());

        setUpDocumentTable();
    }

    private void setUpDocumentTable() {
        JTable documentTable = new JTable(DocumentList.TABLE_DATA, DocumentList.COLUMN_NAMES);
        documentTable.setFillsViewportHeight(true);
        documentTable.setPreferredSize(new Dimension(Utils.getDocTableWidth(),
                Utils.getDocListHeight()));

        documentList.add(documentTable.getTableHeader(), BorderLayout.NORTH);
        documentList.add(documentTable, BorderLayout.CENTER);
    }

}
