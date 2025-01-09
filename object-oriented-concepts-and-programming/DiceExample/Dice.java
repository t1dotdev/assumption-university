package week5Exercise;

public class Dice {
	private int faceUP;
	Dice(){
		faceUP = 1;
	}
	Dice(int pips){
		faceUP = pips;
	}
	public int tossDice(){
		 faceUP = ((int)(Math.random()*10))%6 + 1; 
		 return faceUP;
	}
	public int getFaceUp(){
		return faceUP;
	}

}
