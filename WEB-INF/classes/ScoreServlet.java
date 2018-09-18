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
		
		request.setCharacterEncoding("UTF-8");
		
		String score = request.getParameter("score");
		HttpSession session = request.getSession();
		String mode = String.valueOf(session.getAttribute("gameSpeed"));
		String name = request.getParameter("name");
		
		name = name.replaceAll(",","");
		name = name.replaceAll("<","&lt;");
		name = name.replaceAll("<","&gt;");
		name = name.replaceAll("&","&amp;");
		
		String path = getPath(mode);
		
		WriterSelector writer = new WriterSelector();
		ScoreWriter sw = WriterFactory.getWriter(mode);
		writer.setWriter(sw);
		writer.writeScore(score, name, path);
		
		ReaderSelector reader = new ReaderSelector();
		ScoreReader sr = ReaderFactory.getReader(mode);
		reader.setReader(sr);
		
		request.setAttribute("score",reader.getScoreTable(path));

		RequestDispatcher dis = request.getRequestDispatcher("score");
		
		dis.forward(request,response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException{

		request.setCharacterEncoding("UTF-8");

		String fastPath = getPath("70");
		String normalPath = getPath("120");
		ReaderSelector reader = new ReaderSelector();

		ScoreReader normal = ReaderFactory.getReader("120");
		ScoreReader fast = ReaderFactory.getReader("70");

		reader.setReader(normal);
		reader.setReader(fast);

		request.setAttribute("normalScore",reader.getScoreTable(normalPath));
		request.setAttribute("fastScore",reader.getScoreTable(fastPath));

		RequestDispatcher dis = request.getRequestDispatcher("scoretable");

		dis.forward(request, response);
	}

	public String getPath(String mode){

		final String NORMAL_SOCRE = "/ScoreData/NormalModeScore.txt";
		final String FAST_SOCRE = "/ScoreData/FastModeScore.txt";
		String path = null;

		ServletContext servletContext = getServletContext();
		String contextPath = servletContext.getRealPath(File.separator);

		if(mode == "70"){
			path = contextPath + FAST_SOCRE;
		}else{
			path = contextPath + NORMAL_SOCRE;
		}
		return path;
	}
}