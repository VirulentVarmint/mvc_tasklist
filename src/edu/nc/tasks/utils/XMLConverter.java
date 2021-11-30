package edu.nc.tasks.utils;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/**
 * Utility to convert the tasklist hashmap
 * to .xml format
 */
public class XMLConverter {

    /**
     * This method converts the tasklist to
     * a xml string.
     *
     * @param tasklist - the tasklist
     * @return - the xml string
     */
    public static String toXML(HashMap<Integer, String> tasklist) {
        ByteArrayOutputStream xml = new ByteArrayOutputStream();
        XMLEncoder xmlEncoder = new XMLEncoder(xml);
        xmlEncoder.writeObject(tasklist);
        xmlEncoder.close();

        return xml.toString();
    }
}
