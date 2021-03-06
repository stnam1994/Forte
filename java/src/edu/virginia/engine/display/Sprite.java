package edu.virginia.engine.display;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import edu.virginia.engine.events.Event;
import edu.virginia.engine.events.IEventListener;
import edu.virginia.lab1test.CoinPickedUp;

/**
 * Nothing in this class (yet) because there is nothing specific to a Sprite yet that a DisplayObject
 * doesn't already do. Leaving it here for convenience later. you will see!
 * */
public class Sprite extends DisplayObject {

	public Sprite(String id) {
		super(id);
	}

	public Sprite(String id, String imageFileName) {
		super(id, imageFileName);
		this.imageName = imageFileName;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	private String imageName;
	private int start = 0;
	private int finish = 0;
	private BufferedImage prev;
	private boolean prevChange = true;

	public int[] getxArray() {
		return xArray;
	}

	public void setxArray(int[] xArray) {
		this.xArray = xArray;
	}

	public int[] getyArray() {
		return yArray;
	}

	public void setyArray(int[] yArray) {
		this.yArray = yArray;
	}

	private int[] xArray;
	private int[] yArray;
	private int currentIndex = 0;


	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}



	@Override
	public void update(ArrayList<String> pressedKeys) {
		super.update(pressedKeys);
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getFinish() {
		return finish;
	}

	public void setFinish(int finish) {
		this.finish = finish;
	}

	public BufferedImage getPrev() {
		return prev;
	}

	public void setPrev(BufferedImage prev) {
		this.prev = prev;
	}

	public boolean isPrevChange() {
		return prevChange;
	}

	public void setPrevChange(boolean prevChange) {
		this.prevChange = prevChange;
	}
}