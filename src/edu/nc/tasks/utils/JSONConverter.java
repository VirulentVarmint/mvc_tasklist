package edu.nc.tasks.utils;

import java.util.HashMap;

/**
 * Utility to convert the tasklist hashmap
 * to .json format
 */
public class JSONConverter {

    /**
     * This method converts the tasklist to
     * a json string.
     *
     * @param tasklist - the tasklist
     * @return - the json string
     */
    public static String toJSON(HashMap<Integer, String> tasklist) {

        StringBuilder json = new StringBuilder("{\n");
        tasklist.forEach((key, task) ->
                json.append("\t" + key + ": \"" + task + "\",\n")
        );
        json.append("}");

        return json.toString();
    }
}
