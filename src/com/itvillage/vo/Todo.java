package com.itvillage.vo;

import java.util.ArrayList;
import java.util.List;

public class Todo {
    private String todoName;
    private String todoDate;
    public static List todoList = new ArrayList<>();

    public Todo(String todoName, String todoDate) {
        this.todoName = todoName;
        this.todoDate = todoDate;
    }

    public String getTodoName() {
        return todoName;
    }

    public String getTodoDate() {
        return todoDate;
    }
}
