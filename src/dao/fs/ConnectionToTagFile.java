package dao.fs;
import dao.ConnectionToFile;
import objects.Tag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17.11.2015.
 */
public class ConnectionToTagFile implements ConnectionToFile {
    private String path;
    private final static String FOLDER_NAME = "resources/";
    private final static String FILE_NAME = "listOfTag.txt";


    public ConnectionToTagFile(String servletRealPath) {
        this.path = servletRealPath+FOLDER_NAME+FILE_NAME;
    }

    @Override
    public ArrayList readList () throws IOException {
        ArrayList<Tag> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line=reader.readLine()) != null) {
            list.add(new Tag(line));
        }
        return list;
    }

    @Override
    public String getPath() {
        return path;
    }
}







