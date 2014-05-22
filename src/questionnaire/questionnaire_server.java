package questionnaire;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class questionnaire_server
 */
@WebServlet("/questionnaire_server")
public class questionnaire_server extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public questionnaire_server() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter();
	    
	    
	    RequestDispatcher 
        writer.println("<html><head><meta charset=\""+ "UTF-8" +"\"><title>アンケートにご協力下さい！</title></head><body>");
        writer.println("<h1>アンケートにご協力下さい！</h1>");
        writer.println("<form method=post action=\""+ "questionnaire.jsp" +"\">");
        writer.println("<h1>アンケートにご協力下さい！</h1>");
        writer.println("<性別<br>>");
        writer.println("<input type=\""+ "radio" +"\"name = \""+ "sex" +"\" value= \""+""+"\"checked=\""+"checked"+"\" />男<br>");
        writer.println("<h1>アンケートにご協力下さい！</h1>");
        writer.println("<h1>アンケートにご協力下さい！</h1>");
        writer.println("<h1>アンケートにご協力下さい！</h1>");
        writer.println("<h1>アンケートにご協力下さい！</h1>");
        writer.println("<h1>アンケートにご協力下さい！</h1>");
        writer.println("<h1>アンケートにご協力下さい！</h1>");
        writer.println("<h1>アンケートにご協力下さい！</h1>");
       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
