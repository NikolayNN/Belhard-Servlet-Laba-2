//package servlets;
//
//import objects.Tag;
//import utils.Utils;
//
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//
///**
// * Created by User on 16.11.2015.
// */
//@WebServlet(urlPatterns = "/l", name = "WriteLetterServlet")
//public class WriteLetterServlet extends HttpServlet {
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        ArrayList<String> strList = new ArrayList<>();
//        strList = Utils.readListFromExternalFile(req.getServletContext().getRealPath(""), "listOfTag.txt");
////        ArrayList<Tag> tagList = new ArrayList<>();
////        for(int i = 0; i<strList.size(); i++){
////            tagList.set(i, new Tag(strList.get(i)));
////        }
//        res.setContentType( "text/html" );
//        PrintWriter out = res.getWriter();
//
//        for (String s : strList) {
//            out.print(s);
//        }
//
//
//
////        for(Tag t : tagList){
////            out.println(t);
////        }
//
//    }
//}
