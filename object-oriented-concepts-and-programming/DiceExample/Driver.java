package week5Exercise;

public class Driver {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice(5);
		System.out.println(dice1.getFaceUp());
		System.out.println(dice2.getFaceUp());
		System.out.println(dice1.tossDice());
		System.out.println(dice2.tossDice());

	}

}
