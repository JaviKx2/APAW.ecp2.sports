package apaw.p2.sport;

import apaw.p2.sport.daos.DaoFactory;
import apaw.p2.sport.daos.memory.DaoFactoryMemory;

public class SportsApp {
	
	
	
	public SportsApp(){
		
	}
	
	
	public void simulate(){
		
	}
		
	public static void main(String[] args) {
		new SportsApp().simulate();		
		DaoFactory.setFactory(new DaoFactoryMemory());
	}
}
