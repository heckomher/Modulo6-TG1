package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="contacto" , value="/contacto")
public class Contacto extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        request.setAttribute("seccion", "contacto");
        request.setAttribute("respuesta", "");
        getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);


    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String nombre = request.getParameter("nombre");
        request.setAttribute("respuesta", " tu formulario ya ha sido enviado , nos contactaremos a la brevedad");
        //response.getWriter().write(");
        PrintWriter out = response.getWriter();
        out.println("Información del contacto :");
        out.println("Nombre : " + nombre);
        out.println("Correo :" + request.getParameter("email"));
        out.println("Detalle : " + request.getParameter("detalle"));


        RequestDispatcher rd = request.getRequestDispatcher("/views/contacto.jsp");
        rd.forward(request, response);
    }

}

