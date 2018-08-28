package Score.ScoreReader;

import java.io.FileInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;

public class NormalModeScoreReader implements ScoreReader{
	ArrayList<Integer> score = new ArrayList<Integer>();
	ArrayList<String> name = new ArrayList<String>();
	public void readScore(){
		try{
			System.out.println(NORMAL_SCORE_PATH);
			File file = new File(NORMAL_SCORE_PATH);
			BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(file),"Shift-JIS"));
			
			String str="";
			while((str = buff.readLine()) != null){
				String[] line = str.split(",");
				name.add(line[0]);
				score.add(Integer.parseInt(line[1]));
			}
			for(int i = 0; i < score.size(); i++){
				for(int j = score.size()-1; j > i; j--){
					if(score.get(i)<=score.get(j)){
						int w = score.get(i);
						score.set(i,score.get(j));
						score.set(j,w);
						
						String n = name.get(i);
						name.set(i,name.get(j));
						name.set(j,n);
					}
				}
			}
			buff.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public int getHighScore(){
		if(score.isEmpty() && name.isEmpty()){readScore();}
		int HighScore = score.get(0);
		return HighScore;
	}
	public ArrayList<ScoreBean> getScoreTable(){
		if(score.isEmpty() && name.isEmpty()){readScore();}
		else{
			score.clear();
			name.clear();
			readScore();
		}
		ArrayList<ScoreBean> topten = new ArrayList<ScoreBean>();
		for(int i = 0; i < score.size() && i < 10; i++){
			ScoreBean bean = new ScoreBean();
			bean.setScore(score.get(i));
			bean.setName(name.get(i));
			topten.add(bean);
		}
		return topten;
	}
}
