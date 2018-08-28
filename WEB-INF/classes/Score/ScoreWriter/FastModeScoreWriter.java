package Score.ScoreWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FastModeScoreWriter implements ScoreWriter{
	public void writeScore(String score, String name){
		try{
			Calendar cal=Calendar.getInstance();
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy/M/d(E) k:m:s");
			
			String now=formatter.format(cal.getTime());

			File file=new File(FAST_MODE_SCORE_PATH);
			
			BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true),"Shift-JIS"));
			
			buff.write(name+","+score+","+now);
			buff.newLine();
			buff.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}