package Score;

import Score.ScoreReader.*;
import java.util.ArrayList;

public class ReaderSelector{
	private ScoreReader reader;
	
	public void setReader(ScoreReader reader){
		this.reader = reader;
	}
	public int getHighScore(){
		return reader.getHighScore();
	}
	public ArrayList getScoreTable(){
		return reader.getScoreTable();
	}
}