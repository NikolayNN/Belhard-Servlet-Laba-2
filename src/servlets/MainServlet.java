package servlets;

import dao.fs.ConnectionToTagFile;
import dao.fs.ConnectionToThemeFile;
import utils.Utils;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Nikol on 07.11.2015.
 */
@WebServlet(urlPatterns = "/main", name = "MainServlet")
public class MainServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {


        ArrayList<String> studiedAdditionThemes = new ArrayList<>();
        studiedAdditionThemes = new ConnectionToThemeFile(req.getServletContext().getRealPath("")).readList();
        res.setContentType( "text/html" );
        PrintWriter out = res.getWriter();
        out.println(
        "<html>"
                +"<head>"
                    +"<meta charset=\"utf-8\">"
                    +"<script src=\"scripts/ShowOrHideRadioButtons.js\"></script>"
                    +"<script src=\"scripts/formValidate.js\"></script>"
                    +"<script src=\"scripts/utils.js\"></script>"
                    +"<link rel=\"stylesheet\" href=\"css/main.css\">"
                    +"<script type=\"text/javascript\" src=\"jquery-1.8.2.js\"></script>    "
                +"</head>"
                +"<body>"
                    +"<div class=\"main\">"
                        +"<div class = \"middle\">"
                            +"<form method=\"get\" action=\"/ok\"  onsubmit=\"return formValidate();\">"
                            +"<div class=\"field\"><label>Student second name: <input type=\"text\" name=\"sname\" id=\"stud-sname\"></label><br></div>"
                            +"<div class=\"field\"><label>Student first name: <input type=\"text\" name=\"fname\" id=\"stud-fname\"></label><br></div>"
                            +"<div class=\"field\"><label>Student middle name: <input type=\"text\" name=\"mname\" id=\"stud-mname\"></label><br></div>"
                            +"<div class=\"field\"><label>Start date of the classes: <input type=\"date\" name=\"startdate\" id = \"start-date\" ></label><br></div>"
                            +"<div class=\"field\"><label>Finish date of the classes: <input type=\"date\" name=\"finishdate\" id = \"finish-date\" ></label><br></div>"
                            +"<hr>"
                            +"<h3>The list of topics stydied by himself:</h3>");
                            for(String s : studiedAdditionThemes){
                               out.println("<div class=\"field\"><label> <input type=\"checkbox\" name=\"chbox\" value=\""+s+"\" >"+s+"</label><br></div>");
                            }
                            out.println("<hr>"
                            +"<h3>The theme of the training project: </h3>"
                            +"<div class=\"field\"><textarea name=\"study-work-name\" rows=\"3\" cols=\"40\" id = \"t-project\"> </textarea> <br></div>"
                            +"<hr>"
                            +"<h3>Project evalution: </h3>"
                            +"<div class=\"field\"><label><input type=\"radio\" name=\"mark\" value=\"Excelent\" checked >Excelent</label><br></div>"
                            +"<div class=\"field\"><label><input type=\"radio\" name=\"mark\" value=\"Good\" >Good</label><br></div>"
                            +"<div class=\"field\"><label> <input type=\"radio\" name=\"mark\" value=\"Poor\" >Poor</label><br></div>"
                            +"<hr>"
                            +"<div class=\"field\"><label>Lecturer second name <input type=\"text\" name=\"lec-sname\" id=\"lect-sname\" ></label><br></div>"
                            +"<div class=\"field\"><label>Lecturer first name: <input type=\"text\" name=\"lec-fname\" id=\"lect-fname\"></label><br></div>"
                            +"<div class=\"field\"><label>Lecturer middle name <input type=\"text\" name=\"lec-mname\" id=\"lect-mname\"></label><br></div>"
                            +"<hr>"
                            +"<div class=\"field\"><label><input type=\"checkbox\" name=\"arhive\" value=\"css\" onchange=\"showRadioButtons();\" id=\"arhive\">Do you like pack in arhive? </label><br></div>"
                            +"<p>fs type:</p>"
                            +"<div class=\"field\"><label><input type=\"radio\" name=\"type-arhive\" value=\"zip\" disabled id=\"zip\" checked>*.zip</label><br>"
                            +"</div>"
                            +"<div class=\"field\"><label><input type=\"radio\" name=\"type-arhive\" value=\"jar\" disabled id=\"jar\">*.jar</label><br>"
                            +"</div>"
                            +"<hr>"
                            +"<div class=\"field\"> <input type=\"submit\" name=\"submit\" value=\"Generate the letter\" ><br><br></div>"
                            +"</form>"
                        +"</div>"
                    +"</div>"
                +"</body>"
                +"</html>");
    }
}
