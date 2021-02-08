import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Sss extends HttpServlet {
    private ServletConfig config;
    public void init(ServletConfig sc) throws ServletException {
        this.config=sc;
        super.init(config);
        sc.getServletContext().log("Sss:init");
    }

    public void destroy() {
        super.destroy();
        config.getServletContext().log("Sss:destroy");
    }

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        config.getServletContext().log("Sss:service");
        
        PrintWriter pw = resp.getWriter();
        pw.println("<html><body"
                + "<br>Sss: FirstName = " + req.getParameter("firstname")
                + "<br>Sss: LastName = " + req.getParameter("lastname")
                + "</body></html>");
        pw.close();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.println("<html><body"
                + "<br>Sss: doPost: FirstName = " + req.getParameter("firstname")
                + "<br>Sss: doPost: LastName = " + req.getParameter("lastname")
                + "</body></html>");
        pw.close();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.println("<html><body"
                + "<br>Sss: doGet: FirstName = " + req.getParameter("firstname")
                + "<br>Sss: doGet: LastName = " + req.getParameter("lastname")
                + "</body></html>");
        pw.close();
    }
}