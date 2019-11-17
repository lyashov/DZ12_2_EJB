package web;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/tree")
public class FileTreeServlet extends HttpServlet {
    @EJB
    private POJOBean pojoBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = FileTreeService.getHTTPFileTree(System.getProperty("user.dir"));
        pojoBean.setHttpPage(page);
        System.out.println(pojoBean.getHttpPage());
        req.setAttribute("fileTree", pojoBean.getHttpPage());
        req.getServletContext().getRequestDispatcher("/fileTree.jsp").forward(req, resp);
        //super.doGet(req, resp);
    }
}
