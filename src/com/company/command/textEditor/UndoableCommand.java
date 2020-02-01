package com.company.command.textEditor;

import java.util.ArrayDeque;
import java.util.Deque;

public interface UndoableCommand extends Command {
    void unexecute();
}
