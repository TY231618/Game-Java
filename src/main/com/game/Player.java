package main.com.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject{

	Random rand = new Random();
	Handler handler;
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		
	}

	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x,  0,  Game.WIDTH - 32);
		y = Game.clamp(y,  0,  Game.HEIGHT - 56);
		
		collision();
		
		handler.addObject(new Trail(x, y, ID.Trail, Color.white, 32, 32, 0.1f, handler));


	}
	
	private void collision() {
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getID() == ID.BasicEnemy) { // tempObject is now basic enemy
				if(getBounds().intersects(tempObject.getBounds())) {
					//collision code
					HUD.HEALTH -= 2;
				}
				
			}
		}
	}

	public void render(Graphics g) {
//      when 2 players
//		if(id == ID.Player) g.setColor(Color.white);
//		else if(id == ID.Player2) g.setColor(Color.green);		
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
//		g.fillOval(x, y, 32, 32);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}
}
