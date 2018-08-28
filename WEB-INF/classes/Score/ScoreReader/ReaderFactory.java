package Score.ScoreReader;

import java.util.HashMap;

public abstract class ReaderFactory{
	private static HashMap readers;
	static{
		readers = new HashMap();
		readers.put("70", new FastModeScoreReader());
		readers.put("120", new NormalModeScoreReader());
	}
	public static ScoreReader getReader(String key){
		return (ScoreReader)readers.get(key);
	}
}