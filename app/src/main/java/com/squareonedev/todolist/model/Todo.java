package com.squareonedev.todolist.model;

public class Todo {

    public String mTodo;

    public Todo() {

    }

    public Todo(String todo) {
        mTodo = todo;
    }

    public String getTodo() {
        return mTodo;
    }

    public void setTodo(String todo) {
        mTodo = todo;
    }
}
