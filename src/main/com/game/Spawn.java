package main.com.game;

public class Spawn {

	private Handler handler;
	private HUD hud;
	private int scoreKeeper = 0;
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		scoreKeeper++;
		
		if(scoreKeeper >= 1000) {
			scoreKeeper = 0;
			
			hud.setLevel(hud.getLevel() + 1);
		}
	}
}
