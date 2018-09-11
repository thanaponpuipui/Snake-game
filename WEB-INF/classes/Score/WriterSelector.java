package Score;

import Score.ScoreWriter.*;

public class WriterSelector{
	private ScoreWriter writer;
	
	public void setWriter(ScoreWriter writer){
		this.writer = writer;
	}
	public void writeScore(String score, String name ,String path){
		writer.writeScore(score, name, path);
	}
}