package com.itvillage.vo;

public class ToDo {
    private String todoName;
    private String todoDate;

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
