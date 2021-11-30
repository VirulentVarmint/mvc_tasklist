package edu.nc.tasks.controllers;

import edu.nc.tasks.models.Tasklist;
import edu.nc.tasks.views.ConsoleMenu;

import java.util.HashMap;

/**
 * The controller component of the MVC pattern
 */
public class TasklistManager {
    private Tasklist model;
    private ConsoleMenu view;

    /**
     * This method instantiates a new Task controller.
     *
     * @param model - model component
     * @param view  - view component
     */
    public TasklistManager(Tasklist model, ConsoleMenu view) {
        this.model = model;
        this.view = view;
    }

    /**
     * This method calls the model component to
     * get the tasks.
     *
     * @return - map of tasks
     */
    public HashMap<Integer, String> getTasks() {

        return model.getTasks();
    }

    /**
     * This method calls the model component to
     * set the tasks.
     *
     * @param tasks - tasklist
     */
    public void setTasks(HashMap<Integer, String> tasks) {

        model.setTasks(tasks);

        return;
    }

    /**
     * This method checks if a task with a specified
     * number exists.
     *
     * @param key - # to check
     * @return boolean - whether the task exists
     */
    public boolean existsTask(int key) {

        return model.getTasks().containsKey(key);
    }

    /**
     * This method gets a task with a specified
     * number.
     *
     * @param key - # of the task to return
     * @return - the task
     */
    public String getTask(int key) {

        return model.getTask(key);
    }

    /**
     * This method calls the model component to
     * add a task to the map
     *
     * @param key  - # of the task
     * @param task - the task
     */
    public void addTask(int key, String task) {
        model.addTask(key, task);
        return;
    }

    /**
     * This method calls the model component to
     * remove a task from the map
     *
     * @param key - # of the task to remove
     */
    public void removeTask(int key) {
        model.removeTask(key);
        return;
    }

    /**
     * This method calls the view component to print
     * the task list to the console
     */
    public void showTasks() {

        view.printTasks(model.getTasks());
    }
}
