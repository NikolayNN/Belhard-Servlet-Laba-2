/**
 * Created by Nikol on 09.11.2015.
 */

function formValidate(){
    var TEXT_FIELD_STUDENT_FIRST_NAME = "stud-fname";
    var TEXT_FIELD_STUDENT_SECOND_NAME = "stud-sname";
    var TEXT_FIELD_STUDENT_MIDDLE_NAME = "stud-mname";
    var DATE_FIELD_START_CLASSES = "start-date";
    var DATE_FIELD_FINISH_CLASSES ="finish-date";
    var TEXT_AREA_PROJECT = "t-project";
    var TEXT_FIELD_LECTURER_FIRST_NAME = "lect-fname";
    var TEXT_FIELD_LECTURER_SECOND_NAME = "lect-sname";
    var TEXT_FIELD_LECTURER_MIDDLE_NAME = "lect-mname";

    var ERR_MESSAGE_STUDENT_SECOND_NAME_IS_EMPTY ="Please, fill the text field \"Student second name\"";
    var ERR_MESSAGE_STUDENT_SECOND_NAME_CONSIST_NUMB ="Text field \"Student second name\" can't consist numbs";

    var ERR_MESSAGE_STUDENT_FIRST_NAME_IS_EMPTY ="Please, fill the text field \"Student first name\"";
    var ERR_MESSAGE_STUDENT_FIRST_NAME_CONSIST_NUMB ="Text field \"Student first name\" can't consist numbs";

    var ERR_MESSAGE_STUDENT_MIDDLE_NAME_IS_EMPTY ="Please, fill the text field \"Student middle name\"";
    var ERR_MESSAGE_STUDENT_MIDDLE_NAME_CONSIST_NUMB ="Text field \"Student middle name\" can't consist numbs";

    var ERR_MESSAGE_STUDENT_START_DATE_IS_EMPTY ="Please, fill the field \"Start date of the class\"";
    var ERR_MESSAGE_STUDENT_FINISH_DATE_IS_EMPTY ="Please, fill the field \"Finish date of the class\"";

    var ERR_MESSAGE_TEXT_AREA_T_PROJECT_IS_EMPTY = "Please, fill fielfd \"Training project\"";

    var ERR_MESSAGE_LECTURER_SECOND_NAME_IS_EMPTY ="Please, fill the text field \"LECTURER second name\"";
    var ERR_MESSAGE_LECTURER_SECOND_NAME_CONSIST_NUMB ="Text field \"LECTURER second name\" can't consist numbs";

    var ERR_MESSAGE_LECTURER_FIRST_NAME_IS_EMPTY ="Please, fill the text field \"LECTURER first name\"";
    var ERR_MESSAGE_LECTURER_FIRST_NAME_CONSIST_NUMB ="Text field \"LECTURER first name\" can't consist numbs";

    var ERR_MESSAGE_LECTURER_MIDDLE_NAME_IS_EMPTY ="Please, fill the text field \"LECTURER middle name\"";
    var ERR_MESSAGE_LECTURER_MIDDLE_NAME_CONSIST_NUMB ="Text field \"LECTURER middle name\" can't consist numbs";

    var isFormValid;


    isFormValid = isTextFieldEmpty(TEXT_FIELD_STUDENT_FIRST_NAME,ERR_MESSAGE_STUDENT_FIRST_NAME_IS_EMPTY, isFormValid);
    isFormValid = isTextFieldContansNumb(TEXT_FIELD_STUDENT_FIRST_NAME,ERR_MESSAGE_STUDENT_FIRST_NAME_CONSIST_NUMB, isFormValid);

    isFormValid = isTextFieldEmpty(TEXT_FIELD_STUDENT_SECOND_NAME, ERR_MESSAGE_STUDENT_SECOND_NAME_IS_EMPTY, isFormValid);
    isFormValid = isTextFieldContansNumb(TEXT_FIELD_STUDENT_SECOND_NAME, ERR_MESSAGE_STUDENT_SECOND_NAME_CONSIST_NUMB, isFormValid);

    isFormValid = isTextFieldEmpty(TEXT_FIELD_STUDENT_MIDDLE_NAME,ERR_MESSAGE_STUDENT_MIDDLE_NAME_IS_EMPTY, isFormValid);
    isFormValid = isTextFieldContansNumb(TEXT_FIELD_STUDENT_MIDDLE_NAME,ERR_MESSAGE_STUDENT_MIDDLE_NAME_CONSIST_NUMB,isFormValid);

    isFormValid = isTextFieldEmpty(DATE_FIELD_START_CLASSES,ERR_MESSAGE_STUDENT_START_DATE_IS_EMPTY, isFormValid);

    isFormValid = isTextFieldEmpty(DATE_FIELD_FINISH_CLASSES,ERR_MESSAGE_STUDENT_FINISH_DATE_IS_EMPTY, isFormValid);

    isFormValid = isTextFieldEmpty(TEXT_AREA_PROJECT,ERR_MESSAGE_TEXT_AREA_T_PROJECT_IS_EMPTY, isFormValid);

    isFormValid = isTextFieldEmpty(TEXT_FIELD_LECTURER_FIRST_NAME, ERR_MESSAGE_LECTURER_FIRST_NAME_IS_EMPTY, isFormValid);
    isFormValid = isTextFieldContansNumb(TEXT_FIELD_LECTURER_FIRST_NAME, ERR_MESSAGE_LECTURER_FIRST_NAME_CONSIST_NUMB, isFormValid);

    isFormValid = isTextFieldEmpty(TEXT_FIELD_STUDENT_SECOND_NAME, ERR_MESSAGE_LECTURER_SECOND_NAME_IS_EMPTY, isFormValid);
    isFormValid = isTextFieldContansNumb(TEXT_FIELD_LECTURER_SECOND_NAME, ERR_MESSAGE_LECTURER_SECOND_NAME_CONSIST_NUMB, isFormValid);

    isFormValid = isTextFieldEmpty(TEXT_FIELD_LECTURER_MIDDLE_NAME, ERR_MESSAGE_LECTURER_MIDDLE_NAME_IS_EMPTY, isFormValid);
    isFormValid = isTextFieldContansNumb(TEXT_FIELD_LECTURER_MIDDLE_NAME, ERR_MESSAGE_LECTURER_MIDDLE_NAME_CONSIST_NUMB, isFormValid);

    return isFormValid;

}
