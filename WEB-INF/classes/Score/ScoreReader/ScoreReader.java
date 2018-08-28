package Score.ScoreReader;
import java.util.ArrayList;

public interface ScoreReader{
	String NORMAL_SCORE_PATH = "c:/Webapps/ss/ScoreData/NormalModeScore.txt";
	String FAST_MODE_SCORE_PATH = "c:/Webapps/ss/ScoreData/FastModeScore.txt";
	
	public void readScore();
	public int getHighScore();
	public ArrayList<ScoreBean> getScoreTable();
}
