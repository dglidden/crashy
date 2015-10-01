package crashy;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CrashyServlet extends HttpServlet {

    public void init() throws ServletException{

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        process(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext ctx = getServletContext();
        String option = request.getParameter("dowhat");
        if(option.equals("crash")) {
            throw new NullPointerException();
        }
        if(option.equals("log")) {
            // log some stuff
            ctx.log("Here is some stuff");
            ctx.log("Here is some more stuff");
            ctx.log("Here is some different stuff");
            ctx.log("Here is some final stuff");
        }
    }
}