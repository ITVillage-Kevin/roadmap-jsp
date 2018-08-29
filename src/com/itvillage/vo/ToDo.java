package com.itvillage.vo;

import java.util.ArrayList;
import java.util.List;

public class ToDo {
    private String todoName;
    private String todoDate;
    public static List todoList = new ArrayList<>();

    public ToDo(String todoName, String todoDate) {
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
