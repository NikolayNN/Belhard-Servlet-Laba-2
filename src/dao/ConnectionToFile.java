package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17.11.2015.
 */
public interface ConnectionToFile {
    String getPath();
    ArrayList readList () throws IOException;


}
