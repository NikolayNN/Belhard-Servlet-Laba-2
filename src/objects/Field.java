package objects;

import utils.Utils;

/**
 * Created by User on 12.11.2015.
 */
public class Field {
    private String value;
    private boolean isEmpty;
    private boolean isConsistNumb;

    public Field(String value) {
        this.value = value;
        this.isEmpty = this.isFieldEmpty(value);
        this.isConsistNumb = this.isFieldConsistNumb(value);
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    public boolean getIsConsistNumb() {
        return isConsistNumb;
    }

    private   boolean isFieldEmpty(String fieldValue){
        try {
            if ((fieldValue.equals("")) || (fieldValue.trim().equals(""))) {
                return true;
            }
            return false;
        }catch (NullPointerException e){
            return true;
        }
    }

    private boolean isFieldConsistNumb(String fieldValue){
        if(!isFieldEmpty(fieldValue)){
            return Utils.checkWithRegExp(fieldValue);
        }return false;
    }

//    public static void main(String[] args) {
//        Field n = new Field("sadasd121");
//
//        System.out.println(n.isFieldConsistNumb("asdsa"));
//    }


}
