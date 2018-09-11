import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletContext;

import java.io.File;
import java.io.IOException;

import Score.*;
import Score.ScoreWriter.*;
import Score.ScoreReader.*;

public class ScoreServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String NORMAL_SOCRE = "/ScoreData/NormalModeScore.txt";
		String FAST_SOCRE = "/ScoreData/FastModeScore.txt";
		
		request.setCharacterEncoding("Windows-31J");
		
		ServletContext servletContext = getServletContext();
		String contextPath = servletContext.getRealPath(File.separator);
		
		String path;
		
		String score = request.getParameter("score");
		HttpSession session = request.getSession();
		String mode = String.valueOf(session.getAttribute("gameSpeed"));
		System.out.println(mode);
		String name = request.getParameter("name");
		
		if(mode == "70"){
			path = contextPath + FAST_SOCRE;
		}else{
			path = contextPath + NORMAL_SOCRE;
		}
		
		WriterSelector writer = new WriterSelector();
		ScoreWriter sw = WriterFactory.getWriter(mode);
		writer.setWriter(sw);
		System.out.println(String.valueOf(sw));
		writer.writeScore(score, name, path);
		
		ReaderSelector reader = new ReaderSelector();
		ScoreReader sr = ReaderFactory.getReader(mode);
		reader.setReader(sr);
		
		request.setAttribute("score",reader.getScoreTable(path));

		RequestDispatcher dis = request.getRequestDispatcher("score");
		
		dis.forward(request,response);
	}
}