package com.example.mobilki3;

import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();

    private final List<Task> tasks;

    public static TaskStorage getInstance() {
        return taskStorage;
    }

    private TaskStorage() {
        tasks = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Task task = new Task();
            task.setName("Zadanie " + i);
            task.setDone(i % 3 == 0);
            if(i % 3 == 0){
                task.setCategory(Category.STUDIES);
            }else{
                task.setCategory(Category.HOME);
            }
            tasks.add(task);
        }

        Task special_task = new Task();
        special_task.setName("a na cholere te 100+ zadan?");
        special_task.setDone(false);
        special_task.setCategory(Category.STUDIES);
        tasks.add(special_task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID index) {
        for (Task t : tasks) {
            if (t.getId().equals(index)) {
                return t;
            }
        }
        return null;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

}
