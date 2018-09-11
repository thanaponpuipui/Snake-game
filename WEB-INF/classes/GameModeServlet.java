import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import java.io.IOException;

public class GameModeServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("Windows-31J");
		HttpSession session=request.getSession();
		String speed = request.getParameter("GameSpeed");
		
		if(speed==null){speed="normal";};
		System.out.println(speed);
		String gameSpeed = "120";
		String mode = "Normal Mode";
		if(speed.equals("fast")){
			gameSpeed = "70";
			mode = "Fast Mode";
		}
		session.setAttribute("gameMode",mode);
		session.setAttribute("gameSpeed",gameSpeed);
		RequestDispatcher dis = request.getRequestDispatcher("game");
		
		dis.forward(request,response);
	}
}