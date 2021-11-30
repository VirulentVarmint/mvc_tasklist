package edu.nc.tasks.utils;

import java.util.HashMap;

public class JSONConverter {
    public static String toJSON(HashMap<Integer, String> tasklist) {
        StringBuilder json = new StringBuilder("{\n");
        tasklist.forEach((key, task) ->
                json.append("\t" + key + ": \"" + task + "\",\n")
        );
        json.append("}");

        return json.toString();
    }
}
