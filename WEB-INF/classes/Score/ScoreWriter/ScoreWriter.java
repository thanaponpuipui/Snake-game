package Score.ScoreWriter;

public interface ScoreWriter{
	String NORMAL_SCORE_PATH = "c:/Webapps/ss/ScoreData/NormalModeScore.txt";
	String FAST_MODE_SCORE_PATH = "c:/Webapps/ss/ScoreData/FastModeScore.txt";
	
	public void writeScore(String score, String name);
}
