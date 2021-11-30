package edu.nc.tasks.utils;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

public class XMLConverter {
    public static String toXML(HashMap<Integer, String> tasklist) {
        ByteArrayOutputStream xml = new ByteArrayOutputStream();
        XMLEncoder xmlEncoder = new XMLEncoder(xml);
        xmlEncoder.writeObject(tasklist);
        xmlEncoder.close();

        return xml.toString();
    }
}
