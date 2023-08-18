package servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serial;

@WebServlet(name="listarCapaitacion", value="/listar-capacitacion")
public class ListarCapacitacion extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 1L;
    public ListarCapacitacion() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/capacitacion_listar.jsp").forward(request, response);


    }
}

