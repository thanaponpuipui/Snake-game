package Score.ScoreReader;
import java.util.ArrayList;

public interface ScoreReader{
	
	public void readScore(String path);
	public int getHighScore(String path);
	public ArrayList<ScoreBean> getScoreTable(String path);
}
