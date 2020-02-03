package com.company.mediator;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("Textbox" + titleTextBox.getContent());
        System.out.println("Button" + saveButton.getEnabled());
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var empty = (content == null || content.isEmpty());
        saveButton.setEnabled(!empty);
    }
}
