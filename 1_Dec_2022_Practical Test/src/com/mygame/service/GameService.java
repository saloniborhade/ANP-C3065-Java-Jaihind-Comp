
package com.mygame.service;
import com.mygame.dao.GameDao;

public class GameService {
	public String[] getcityNamesService()
	{
		GameDao g = new GameDao();
		String s[] = g.getcityName();
		
		return s;
	}

	public String[] GameService() {
		return null;
	}
}

