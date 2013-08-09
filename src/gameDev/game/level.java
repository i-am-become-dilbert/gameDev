package gameDev.game;

import java.util.ArrayList;
import java.util.List;

public class level {
	
	public List<wall> walls = new ArrayList<wall>();
	public int width,height;
	
	public level( int levelNum ){
		buildLevel(0);
	}
	
	private void buildLevel( int levelNum ){
		
		width = 500; height = 500;
		walls.add(new wall(0,0,width,0,  0));
		walls.add(new wall(0,0,0,height,  0));
		walls.add(new wall(width,0,width,height,  0));
		walls.add(new wall(0,height,width,height,  0));
		
	}
}