package servlets;

import dao.fs.ConnectionToLetterFile;
import dao.fs.ConnectionToTagFile;
import objects.Tag;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by User on 17.11.2015.
 */
@WebServlet(name = "LetterProcesingServlet", urlPatterns = "/createLetter")
public class LetterProcesingServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // получаем путь к файлу с тегами

        ConnectionToTagFile tagFile = new ConnectionToTagFile(req.getServletContext().getRealPath(""));
        ConnectionToLetterFile letterFile = new ConnectionToLetterFile(req.getServletContext().getRealPath(""));
        //читаем файлы тегов и письма в списки


        ArrayList<String> attrList = new ArrayList<>();
        attrList.add(req.getParameter(FormValidateServlet.NAME_STUDENT_FIRST_NAME));
        attrList.add(req.getParameter(FormValidateServlet.NAME_STUDENT_SECOND_NAME));
        attrList.add(req.getParameter(FormValidateServlet.NAME_STUDENT_MIDDLE_NAME));
        attrList.add(req.getParameter(FormValidateServlet.NAME_START_DATE));
        attrList.add(req.getParameter(FormValidateServlet.NAME_FINAL_DATE));
        attrList.add(req.getParameter(FormValidateServlet.NAME_TEXT_AREA_PROJECT_NAME));
        attrList.add(req.getParameter(FormValidateServlet.NAME_COURSE_MARK));
        attrList.add(req.getParameter(FormValidateServlet.NAME_LECTURE_FIRST_NAME));
        attrList.add(req.getParameter(FormValidateServlet.NAME_LECTURE_SECOND_NAME));
        attrList.add(req.getParameter(FormValidateServlet.NAME_LECTURE_MIDDLE_NAME));




        ArrayList<Tag> tagList = tagFile.readList();
        ArrayList<String> letter = letterFile.readList();
        res.setContentType( "text/html" );
        PrintWriter out = res.getWriter();



        for (int i = 0; i < tagList.size()-1; i++) {
            for (int j = 0; j < letter.size(); j++) {
                letter.set(j,letter.get(j).replaceAll(tagList.get(i).getRegExp(),attrList.get(i)));
            }
        }
//        for (String s : attrList) {
//            out.print("<p>");
//            out.print(s);
//            out.print("</p>");
//        }

            out.println(letter);
    }
}
