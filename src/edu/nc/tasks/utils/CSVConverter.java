package edu.nc.tasks.utils;

import java.util.HashMap;

public class CSVConverter {
    public static String toCSV(HashMap<Integer, String> tasklist) {
        StringBuilder csv = new StringBuilder();
        tasklist.forEach((key, task) ->
                csv.append(key + "," + task + "\n")
        );

        return csv.toString();
    }
}
