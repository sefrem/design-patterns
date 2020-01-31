package com.company.exercises.src.com.codewithmosh.memento;

import com.company.memento.EditorState;

public class Originator {
    private String content;
    private String fontName;
    private String fontSize;

    public Memento createState() {
        return new Memento(content, fontName, fontSize);
    }

    public void restoreContent(Memento state) {
        content = state.getContent();
    }

    public void restoreFontName(Memento state) {
        content = state.getFontName();
    }

    public void restoreFontSize(Memento state) {
        content = state.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }



}