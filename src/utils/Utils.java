package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 12.11.2015.
 */
public class Utils {

    public static void main(String[] args) {
        System.out.println(checkWithRegExp("asdadasd"));
    }
    public static boolean checkWithRegExp(String str){
        Pattern p = Pattern.compile("(\\D+)");
        Matcher m = p.matcher(str);
        return !m.matches();
    }

    public static ArrayList<String> readListFromExternalFile(String servletRealPath) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(servletRealPath+"resources/listOfThemes.txt"));
        String line;
        while ((line=reader.readLine()) != null) {
            list.add(line);
        }
        return list;
    }
}
