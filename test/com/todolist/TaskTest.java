package com.todolist;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: ialbuqu
 * Date: 5/23/13
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class TaskTest {

    @Test
    public void getTaskNameTest(){
        Task task = new Task("Go to the dorctor");
        String result = task.getTaskName();
        assertEquals(result, "Go to the dorctor");
    }

    @Test
    public void setTaskNameTest(){
        Task task = new Task("Go to the doctor");
        task.setTaskName("Change of task done!");
        assertEquals(task.getTaskName(), "Change of task done!");
    }

    @Test
    public void getTaskDate(){
        Task task = new Task("Go to the doctor", "22/03/1990");
        String result = task.getTaskDate();
        assertEquals(result, "22/03/1990" );
    }

    @Test
    public void setTaskDate(){
        Task task = new Task("Go to the doctor", "22/03/1990");
        task.setTaskDate("Go to the doctor", "22/03/2013");
        assertEquals(task.getTaskDate(), "22/03/2013");
    }

    @Test
    public void getTaskCheck(){
        Task task = new Task(true);
        Boolean result = task.getTaskCheck();
        assertEquals(result, true);
    }

    @Test
    public void setTaskCheck(){
        Task task = new Task(true);
        task.setTaskCheck(false);
        assertEquals(task.getTaskCheck(), false);
    }

}
