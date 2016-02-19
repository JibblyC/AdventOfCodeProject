package com.testProject.utilclasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ciaran on 19/02/2016.
 */
public class FileIOUtil {

    public FileIOUtil(){}


    public String readFileIntoSingleString(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    public String[] readFileIntoArray(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List arrayLines = new ArrayList();
        String line = null;
        while ((line = br.readLine()) != null) {
            arrayLines.add(line);
        }
        br.close();
        return (String[]) arrayLines.toArray(new String[arrayLines.size()]);
    }
}
