package com.company.exercises.src.com.codewithmosh.memento;

public class Memento {
   private final String content;
   private final String fontName;
   private final String fontSize;

    public Memento (String content, String fontName, String fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
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
}
