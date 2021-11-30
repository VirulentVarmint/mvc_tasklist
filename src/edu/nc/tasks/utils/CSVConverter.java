package edu.nc.tasks.utils;

import java.util.HashMap;

/**
 * Utility to convert the tasklist hashmap
 * to .csv format
 */
public class CSVConverter {

    /**
     * This method converts the tasklist to
     * a csv string.
     *
     * @param tasklist - the tasklist
     * @return - the csv string
     */
    public static String toCSV(HashMap<Integer, String> tasklist) {

        StringBuilder csv = new StringBuilder();
        tasklist.forEach((key, task) ->
                csv.append(key + "," + task + "\n")
        );

        return csv.toString();
    }
}
