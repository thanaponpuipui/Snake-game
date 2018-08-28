import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import Score.*;
import Score.ScoreWriter.*;
import Score.ScoreReader.*;

public class ScoreServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		request.setCharacterEncoding("Windows-31J");
		
		String score = request.getParameter("score");
		HttpSession session = request.getSession();
		String mode = String.valueOf(session.getAttribute("gameSpeed"));
		System.out.println(mode);
		String name = request.getParameter("name");
		
		
		WriterSelector writer = new WriterSelector();
		ScoreWriter sw = WriterFactory.getWriter(mode);
		writer.setWriter(sw);
		System.out.println(String.valueOf(sw));
		writer.writeScore(score, name);
		
		ReaderSelector reader = new ReaderSelector();
		ScoreReader sr = ReaderFactory.getReader(mode);
		reader.setReader(sr);
		
		request.setAttribute("score",reader.getScoreTable());

		RequestDispatcher dis = request.getRequestDispatcher("score");
		
		dis.forward(request,response);
	}
}