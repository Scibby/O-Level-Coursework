package scib.game.game.objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.LinkedList;

import scib.game.framework.GameObject;
import scib.game.framework.Handler;
import scib.game.framework.ImageLoader;
import scib.game.framework.ObjectId;

public class Block extends GameObject {
	
	ImageLoader loader = new ImageLoader();
	
	public Block(float x, float y, float width, float height, ObjectId id, Handler handler) {
		super(x, y, width, height, id, handler);
	}

	public void tick(LinkedList<GameObject> object){
		//loader.loadImage("/res/Player.png");
	}

	public void render(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		g.setColor(Color.WHITE);
		g.drawRect((int) x, (int) y, (int) width, (int) height);
		
		g2d.setColor(Color.GREEN);
		g2d.draw(getBoundsTop());
		g2d.draw(getBoundsBottom());
		g2d.draw(getBoundsLeft());
		g2d.draw(getBoundsRight());
	}


	public Rectangle getBounds() {
		return new Rectangle((int) x, (int) y, (int) width, (int) height);
	}
	
	public Rectangle getBoundsTop() {
		return new Rectangle((int) ((int) x + width / 4), (int) y, (int) width / 2, (int) (height / 2));
	}
	public Rectangle getBoundsBottom() {
		return new Rectangle((int) ((int) x + width / 4), (int) ((int) y + (height / 2)), (int) width / 2, (int) (height / 2));
	}
	public Rectangle getBoundsLeft() {
		return new Rectangle((int) x, (int) ((int) y + height / 16), (int) width / 4, (int) ((int) height - ((height / 16) * 2)));
	}
	public Rectangle getBoundsRight() {
		return new Rectangle((int) ((int) x + ((width / 4) * 3)), (int) ((int) y + height / 16), (int) width / 4, (int) ((int) height - (height / 16) * 2));
	}

	

}
