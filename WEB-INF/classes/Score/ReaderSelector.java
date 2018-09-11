package Score;

import Score.ScoreReader.*;
import java.util.ArrayList;

public class ReaderSelector{
	private ScoreReader reader;
	
	public void setReader(ScoreReader reader){
		this.reader = reader;
	}
	public int getHighScore(String path){
		return reader.getHighScore(path);
	}
	public ArrayList getScoreTable(String path){
		return reader.getScoreTable(path);
	}
}