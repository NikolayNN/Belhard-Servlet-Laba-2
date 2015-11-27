package dao.fs;

import dao.ConnectionToFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17.11.2015.
 */
public class ConnectionToThemeFile implements ConnectionToFile {
    private String path;
    private final static String FOLDER_NAME = "resources/";
    private final static String FILE_NAME = "listOfThemes.txt";

    public ConnectionToThemeFile(String servletRealPath) {
        this.path = servletRealPath+FOLDER_NAME+FILE_NAME;
    }






    @Override
    public String getPath() {
        return path;
    }

    @Override
    public ArrayList readList() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line=reader.readLine()) != null) {
            list.add(line);
        }
        return list;
    }
}
