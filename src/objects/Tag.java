package objects;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by User on 16.11.2015.
 * к строке добавляется спец символы чтобы использовать как регулярное выражение в последующем
 */

public class Tag {

    private String regExp;
    private final static String TAG_Escape_Begin = "\\Q";
    private final static String TAG_ESCAPE_End = "\\E";

    public Tag(String str) {
        this.regExp = TAG_Escape_Begin + str + TAG_ESCAPE_End;
    }

    public String getRegExp() {
        return regExp;
    }

    public static void main(String[] args) {
        Tag tag = new Tag("{STUDENT_FIRST_NAME}");
        Tag tag1 = new Tag("{STUDENT_SECOND_NAME}");
        Tag tag2 = new Tag("{STUDENT_MIDDLE_NAME}");

        ArrayList<Tag> tagList = new ArrayList<>();
        tagList.add(tag);
        tagList.add(tag1);
        tagList.add(tag2);

        ArrayList<String> letter = new ArrayList<>();
        letter.add("asadsad {STUDENT_FIRST_NAME} ddsvcdsvdsvdsv ");
        letter.add("adslcnkdsnvlksdkvnlkndsvkln {STUDENT_FIRST_NAME} dsdv;sdmvklmdskvmdsmv");
        letter.add("sdvsdcnadsklckdsnc {STUDENT_SECOND_NAME} dsvsvdsvdsvdsv ");

        for (int i = 0; i < tagList.size(); i++) {
            for (int j = 0; j < letter.size(); j++) {
              letter.set(j,letter.get(j).replaceAll(tagList.get(i).getRegExp(),"Nickolay"));
            }

        }

               System.out.println(letter);
    }
}
