package com.example.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ApiUtils {

    /**
     * @param filePath La ruta del archivo a leer (relativa a la raíz del proyecto).
     * @return El contenido del archivo como String.
     */
    public static String readFile(String filePath) {
        try {
            File file = new File(filePath);
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}