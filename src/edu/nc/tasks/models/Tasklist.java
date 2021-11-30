package edu.nc.tasks.models;

import java.util.HashMap;

/**
 * The model component of the MVC pattern
 */
public class Tasklist {
    private HashMap<Integer, String> tasks;

    /**
     * This method gets the tasks
     *
     * @return - tasks
     */
    public HashMap<Integer, String> getTasks() {

        return tasks;
    }

    /**
     * This method sets the tasks
     *
     * @param tasks - new map to replace the tasks
     */
    public void setTasks(HashMap<Integer, String> tasks) {

        this.tasks = tasks;
    }

    /**
     * This method adds a task to the map
     *
     * @param key - # of the task
     * @param task - the task
     */
    public void addTask(int key, String task) {

        tasks.put(key, task);
    }

    /**
     * This method removes the task from the map
     *
     * @param key - # of the task
     */
    public void removeTask(int key) {

        tasks.remove(key);
    }

    /**
     * This method gets a specified task from the map
     *
     * @param key  - # of the task
     * @return - the specified task
     */
    public String getTask(int key) {

        return tasks.get(key);
    }
}
