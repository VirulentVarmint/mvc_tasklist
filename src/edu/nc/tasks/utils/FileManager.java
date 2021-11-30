package edu.nc.tasks.utils;

import java.io.IOException;
import java.nio.file.*;

public class FileManager {
    public static boolean fileExists(String path) {

        return Files.exists(Path.of(path));
    }

    public static void writeFile(String path, String con) throws IOException {

        Path ofile = Path.of(path);
        ofile = ofile = Files.createFile(ofile);
        Files.writeString(ofile, con, StandardOpenOption.TRUNCATE_EXISTING);

        return;
    }

    public static void rewriteFile(String path, String con) throws IOException {

        Path ofile = Path.of(path);
        Files.writeString(ofile, con, StandardOpenOption.TRUNCATE_EXISTING);

        return;
    }
}
