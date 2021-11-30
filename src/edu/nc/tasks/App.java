package edu.nc.tasks;

import edu.nc.tasks.controllers.TasklistManager;
import edu.nc.tasks.models.Tasklist;
import edu.nc.tasks.views.ConsoleMenu;

import java.beans.XMLDecoder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;

/**
 * The App class implements a console application
 * which allows the user to create, store, and modify a
 * simple list of tasks.
 * <p>
 * By default the list is loaded from and stored in an
 * .xml file, but the user can also choose to save the list
 * as a .json or a .csv file.
 *
 * @author Sigeeva Sofia
 * @version 1.0
 */
public class App {

    /**
     * The entry point of application.
     *
     * @param args - input arguments
     * @throws IOException - on failing to create or
     * read from file
     */
    public static void main(String[] args) throws IOException {

        //mvc components
        Path file = Path.of("data.xml");
        Tasklist tasks = new edu.nc.tasks.models.Tasklist();
        if (Files.exists(file)) {
            //parse xml
            ByteArrayInputStream databytes;
            databytes = new ByteArrayInputStream(Files.readAllBytes(file));

            XMLDecoder xmlDecoder = new XMLDecoder(databytes);
            HashMap<Integer, String> dmap = (HashMap<Integer, String>) xmlDecoder.readObject();
            tasks.setTasks(dmap);

            System.out.println("Список задач загружен из файла \"data.xml\"");
        } else {
            tasks = new edu.nc.tasks.models.Tasklist();
            tasks.setTasks(new HashMap<>());

            System.out.println("Не найден файл \"data.xml\". Создан новый список задач");
        }
        ConsoleMenu view = new ConsoleMenu();
        TasklistManager controller = new TasklistManager(tasks, view);

        view.callMenu(controller);

        return;
    }
}