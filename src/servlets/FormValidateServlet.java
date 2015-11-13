package servlets;

import objects.Field;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11.11.2015.
 */
@WebServlet(urlPatterns = "/ok" , name = "FormValidateServlet")
public class FormValidateServlet extends HttpServlet {
    static final String NAME_STUDENT_SECOND_NAME = "sname";
    static final String NAME_STUDENT_FIRST_NAME = "fname";
    static final String NAME_STUDENT_MIDDLE_NAME = "mname";
    static final String NAME_START_DATE = "startdate";
    static final String NAME_FINAL_DATE = "finaldate";
    static final String NAME_TEXT_AREA_PROJECT_NAME = "study-work-name";
    static final String NAME_LECTURE_SECOND_NAME = "lec-sname";
    static final String NAME_LECTURE_FIRST_NAME = "lec-fname";
    static final String NAME_LECTURE_MIDDLE_NAME = "lec-mname";


    static final String ERR_MESSAGE_STUDEND_SECOND_NAME_IS_EMPTY = "Text field \"Student second name\" can't be empty";
    static final String ERR_MESSAGE_STUDENT_SECOND_NAME_CONSIST_NUMB = "Text field \"Student second name\" can't consist numbs";
    static final String ERR_MESSAGE_STUDEND_FIRST_NAME_IS_EMPTY = "Text field \"Student first name\" can't be empty";
    static final String ERR_MESSAGE_STUDENT_FIRST_NAME_CONSIST_NUMB = "Text field \"Student first name\" can't consist numbs";
    static final String ERR_MESSAGE_STUDEND_MIDDLE_NAME_IS_EMPTY = "Text field \"Student middle name\" can't be empty";
    static final String ERR_MESSAGE_STUDENT_MIDDLE_NAME_CONSIST_NUMB = "Text field \"Student middle name\" can't consist numbs";
    static final String ERR_MESSAGE_START_DATE_IS_EMPTY = "Field \"Start date\" can't be empty";
    static final String ERR_MESSAGE_FINAL_DATE_IS_EMPTY = "Field \"Final date\" can't be empty";
    static final String ERR_MESSAGE_TEXT_AREA_NAME_PROJECT_IS_EMPTY = "Field \"Project name\" can't be empty";
    static final String ERR_MESSAGE_LECTURER_SECOND_NAME_IS_EMPTY = "Text field \"Lecturer second name\" can't be empty";
    static final String ERR_MESSAGE_LECTURER_SECOND_NAME_CONSIST_NUMB = "Text field \"Lecturer second name\" can't consist numbs";
    static final String ERR_MESSAGE_LECTURER_FIRST_NAME_IS_EMPTY = "Text field \"Lecturer first name\" can't be empty";
    static final String ERR_MESSAGE_LECTURER_FIRST_NAME_CONSIST_NUMB = "Text field \"Lecturer first name\" can't consist numbs";
    static final String ERR_MESSAGE_LECTURER_MIDDLE_NAME_IS_EMPTY = "Text field \"Lecturer middle name\" can't be empty";
    static final String ERR_MESSAGE_LECTURER_MIDDLE_NAME_CONSIST_NUMB = "Text field \"Lecturer middle name\" can't consist numbs";

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType( "text/html" );
        List<String> errorList = new ArrayList<>();

        Field studFirstName = new Field(req.getParameter(NAME_STUDENT_SECOND_NAME));
        Field studSecondName = new Field(req.getParameter(NAME_STUDENT_FIRST_NAME));
        Field studMiddleName = new Field(req.getParameter(NAME_STUDENT_MIDDLE_NAME));
        Field startDate = new Field(req.getParameter(NAME_START_DATE));
        Field finalDate = new Field(req.getParameter(NAME_FINAL_DATE));
        Field textAreaProjectName = new Field(req.getParameter(NAME_TEXT_AREA_PROJECT_NAME));
        Field lectSecondName = new Field(req.getParameter(NAME_LECTURE_SECOND_NAME));
        Field lectFirstName = new Field(req.getParameter(NAME_LECTURE_FIRST_NAME));
        Field lectMiddleName = new Field(req.getParameter(NAME_LECTURE_MIDDLE_NAME));

        if(studFirstName.getIsEmpty()){
            errorList.add(ERR_MESSAGE_STUDEND_SECOND_NAME_IS_EMPTY);
        }
        if (studFirstName.getIsConsistNumb()){
            errorList.add(ERR_MESSAGE_STUDENT_SECOND_NAME_CONSIST_NUMB);
        }
        if(studSecondName.getIsEmpty()){
            errorList.add(ERR_MESSAGE_STUDEND_FIRST_NAME_IS_EMPTY);
        }
        if (studSecondName.getIsConsistNumb()){
            errorList.add(ERR_MESSAGE_STUDENT_FIRST_NAME_CONSIST_NUMB);
        }

        if(studMiddleName.getIsEmpty()){
            errorList.add(ERR_MESSAGE_STUDEND_MIDDLE_NAME_IS_EMPTY);
        }

        if(studMiddleName.getIsConsistNumb()){
            errorList.add(ERR_MESSAGE_STUDENT_MIDDLE_NAME_CONSIST_NUMB);
        }

        if(startDate.getIsEmpty()){
            errorList.add(ERR_MESSAGE_START_DATE_IS_EMPTY);
        }

        if(finalDate.getIsEmpty()){
            errorList.add(ERR_MESSAGE_FINAL_DATE_IS_EMPTY);
        }

        if(textAreaProjectName.getIsEmpty()){
            errorList.add(ERR_MESSAGE_TEXT_AREA_NAME_PROJECT_IS_EMPTY);
        }

        if(lectSecondName.getIsEmpty()){
            errorList.add(ERR_MESSAGE_LECTURER_SECOND_NAME_IS_EMPTY);
        }

        if(lectSecondName.getIsConsistNumb()){
            errorList.add(ERR_MESSAGE_LECTURER_SECOND_NAME_CONSIST_NUMB);
        }

        if(lectFirstName.getIsEmpty()){
            errorList.add(ERR_MESSAGE_LECTURER_FIRST_NAME_IS_EMPTY);
        }

        if(lectFirstName.getIsConsistNumb()){
            errorList.add(ERR_MESSAGE_LECTURER_FIRST_NAME_CONSIST_NUMB);
        }

        if(lectMiddleName.getIsEmpty()){
            errorList.add(ERR_MESSAGE_LECTURER_MIDDLE_NAME_IS_EMPTY);
        }

        if(lectMiddleName.getIsConsistNumb()){
            errorList.add(ERR_MESSAGE_LECTURER_MIDDLE_NAME_CONSIST_NUMB);
        }

        PrintWriter out = res.getWriter();
        if (errorList.size() != 0) {
            for (String s : errorList){
                out.print("<p>");
                out.println(s);
                out.print("</p>");
            }
        }else {out.println("OK!");}
        out.close();
    }
}
