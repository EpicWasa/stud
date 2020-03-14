package ua.hackaton;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainServlet extends HttpServlet {

    private static PlanList list;

    @Override
    public void init() throws ServletException {
        super.init();
        list = new PlanList();
        addDate();
    }

    @Override
    public void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {
            req.setAttribute("notes", list);
            RequestDispatcher rd = getServletContext()
                .getRequestDispatcher("/list.jsp");
            rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studied = req.getParameter("studied");
        String dateInString = req.getParameter("deadline");
        String details = req.getParameter("details");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        list.getNodes().add(new Notes(studied, LocalDate.parse(dateInString, formatter), details));
        req.setAttribute("notes", list);
        RequestDispatcher rd = getServletContext()
                .getRequestDispatcher("/list.jsp");
        rd.forward(req, resp);
    }

    private static void addDate(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateInString = "2018-07-14";

        try {


            list.getNodes().add(new Notes("Math", LocalDate.parse(dateInString, formatter)));
            list.getNodes().add(new Notes("Phys", LocalDate.parse(dateInString, formatter)));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
