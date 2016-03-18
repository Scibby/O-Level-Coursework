package scib.game.framework;

import java.util.LinkedList;

public abstract class GameObject {

	protected float x, y;
	protected ObjectId id;
	protected float velX, velY;
	
	public GameObject(float x, float y, ObjectId id){
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick(LinkedList<GameObject> object);
	public abstract void render();
	
	public abstract float getX();
	public abstract float getY();
	public abstract void setX(float x);
	public abstract void setY(float y);
	
	public abstract float getVelX();
	public abstract float getVelY();
	public abstract void setVelX(float velX);
	public abstract void setVelY(float velY);
	
	public abstract ObjectId getId();
	
}
