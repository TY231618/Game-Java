package main.com.game;

import java.util.Random;

public class Spawn {

	private Handler handler;
	private HUD hud;
	private int scoreKeeper = 0;
	private Random rand = new Random();
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		scoreKeeper++;
		
		if(scoreKeeper >= 1000) {
			scoreKeeper = 0;
			
			hud.setLevel(hud.getLevel() + 1);
			
			if(hud.getLevel() == 2) {
				handler.addObject(new BasicEnemy(rand.nextInt(Game.WIDTH), rand.nextInt(Game.HEIGHT), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 3) {
				handler.addObject(new FastEnemy(rand.nextInt(Game.WIDTH), rand.nextInt(Game.HEIGHT), ID.FastEnemy, handler));
			}
		}
		
		
	}
}
