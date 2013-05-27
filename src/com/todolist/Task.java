package com.todolist;


/**
 * Created with IntelliJ IDEA.
 * User: ialbuqu
 * Date: 5/23/13
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */

public class Task {
    private String taskName;
    private String taskDate;
    private Boolean taskCheck;

    public Task (String taskName){
        this.taskName = taskName;
    }

    public Task (String taskName, String taskDate){
        this.taskName = taskName;
        this.taskDate = taskDate;
    }

    public Task (Boolean taskCheck){
        this.taskCheck = taskCheck;
    }



    public String getTaskName(){
        return this.taskName;
    }

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    public String getTaskDate() {
        return taskDate;
    }


    public void setTaskDate(String taskName, String taskDate) {
        this.taskName = taskName;
        this.taskDate = taskDate;
    }

    public Boolean getTaskCheck(){
        return this.taskCheck;
    }

    public void setTaskCheck(Boolean taskCheck){
        this.taskCheck = taskCheck;
    }
}
