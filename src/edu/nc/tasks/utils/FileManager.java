package edu.nc.tasks.utils;

import java.io.IOException;
import java.nio.file.*;

/**
 * Utility to work with files
 */
public class FileManager {

    /**
     * This method checks if a specified file
     * exists
     *
     * @param path - the path to the file
     * @return boolean - whether the file exists
     */
    public static boolean fileExists(String path) {

        return Files.exists(Path.of(path));
    }

    /**
     * This method creates the specified file
     * and writes to it
     *
     * @param path - the path to the file
     * @param con - the contents to write to the file
     * @throws IOException - on failing to create or
     * write to file
     */
    public static void writeFile(String path, String con) throws IOException {

        Path ofile = Path.of(path);
        ofile = ofile = Files.createFile(ofile);
        Files.writeString(ofile, con, StandardOpenOption.TRUNCATE_EXISTING);

        return;
    }

    /**
     * This method truncates the specified existing
     * file and writes to it
     *
     * @param path - the path to the file
     * @param con - the contents to write to the file
     * @throws IOException - on failing to write to file
     */
    public static void rewriteFile(String path, String con) throws IOException {

        Path ofile = Path.of(path);
        Files.writeString(ofile, con, StandardOpenOption.TRUNCATE_EXISTING);

        return;
    }
}
