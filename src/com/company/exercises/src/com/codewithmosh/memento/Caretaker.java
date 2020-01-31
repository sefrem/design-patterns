package com.company.exercises.src.com.codewithmosh.memento;

import com.company.memento.EditorState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Caretaker {
//
         private List<Memento> contentStates = new ArrayList<>();
        private  List<Memento> fontNameStates = new ArrayList<>();
         private List<Memento> fontSizeStates = new ArrayList<>();

    public void pushContent(Memento content) {contentStates.add(content);}
    public void pushFontName(Memento fontName) {fontNameStates.add(fontName);}
    public void pushFontSize(Memento fontSize) {fontSizeStates.add(fontSize);}


    public Memento popContent() {
        var lastIndex = contentStates.size() - 1;
        var lastState = contentStates.get(lastIndex);
        contentStates.remove(lastState);
        return lastState;
    }

    public Memento popfontSize() {
        var lastIndex = fontNameStates.size() - 1;
        var lastState = fontNameStates.get(lastIndex);
        fontNameStates.remove(lastState);
        return lastState;
    }

    public Memento popFontName() {
        var lastIndex = fontSizeStates.size() - 1;
        var lastState = fontSizeStates.get(lastIndex);
        fontSizeStates.remove(lastState);
        return lastState;
    }
}
