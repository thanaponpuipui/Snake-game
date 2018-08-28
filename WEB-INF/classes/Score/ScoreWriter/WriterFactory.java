package Score.ScoreWriter;

import java.util.HashMap;

public abstract class WriterFactory{
	private static HashMap writers;
	static{
		writers = new HashMap();
		writers.put("70", new FastModeScoreWriter());
		writers.put("120", new NormalModeScoreWriter());
	}
	public static ScoreWriter getWriter(String key){
		return (ScoreWriter)writers.get(key);
	}
}