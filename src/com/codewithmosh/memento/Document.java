package com.codewithmosh.memento;

import com.company.exercises.src.com.codewithmosh.memento.Caretaker;
import com.company.exercises.src.com.codewithmosh.memento.Memento;
import com.company.exercises.src.com.codewithmosh.memento.Originator;
import com.company.memento.Editor;
import com.company.memento.History;

public class Document {

    public static void main(String[] args) {
        var originator = new Originator();
        var caretaker = new Caretaker();

        originator.setContent("a");
        caretaker.pushContent(originator.createState());

        originator.setContent("blablab");

        originator.restoreContent(caretaker.popContent());

//
        originator.setFontName("This is new font family");
        caretaker.pushFontName(originator.createState());

        originator.setFontName("This is the newest font family");

        originator.restoreContent(caretaker.popFontName());
//
//
//        originator.setFontSize("This is new font size");
//        caretaker.pushFontSize(originator.createState());
//
//        originator.setFontSize("This is the newest font size");
//        caretaker.pushFontSize(originator.createState());
//
//        originator.restoreContent(caretaker.popfontSize());


      System.out.println(originator.getContent());
//        System.out.println(originator.getFontName());
//        System.out.println(originator.getFontSize());

    }
    }
//    private String content;
//    private String fontName;
//    private int fontSize;
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getFontName() {
//        return fontName;
//    }
//
//    public void setFontName(String fontName) {
//        this.fontName = fontName;
//    }
//
//    public int getFontSize() {
//        return fontSize;
//    }
//
//    public void setFontSize(int fontSize) {
//        this.fontSize = fontSize;
//    }
//
//    @Override
//    public String toString() {
//        return "Document{" +
//                "content='" + content + '\'' +
//                ", fontName='" + fontName + '\'' +
//                ", fontSize=" + fontSize +
//                '}';
//    }



