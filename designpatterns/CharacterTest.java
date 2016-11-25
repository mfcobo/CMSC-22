import java.util.*;

public class CharacterTest{
	public static void main(String[] args){

		System.out.println("--Default Constructor--\n");

		Character king = new King();
		king.fight();
		Character queen = new Queen();
		queen.fight();
		Character knight = new Knight();
		knight.fight();
		Character troll = new Troll();
		troll.fight();

		System.out.println("\n--------Test 1-------\n");

		Character k1 = new King(new SwordBehavior());
		k1.fight();
		Character k2 = new King(new AxeBehavior());
		k2.fight();
		Character k3 = new King(new BowAndArrowBehavior());
		k3.fight();
		Character k4 = new King(new KnifeBehavior());
		k4.fight();

		System.out.println("\n--------Test 2-------\n");

		Character q1 = new Queen(new SwordBehavior());
		q1.fight();
		Character q2 = new Queen(new AxeBehavior());
		q2.fight();
		Character q3 = new Queen(new BowAndArrowBehavior());
		q3.fight();
		Character q4 = new Queen(new KnifeBehavior());
		q4.fight();

		System.out.println("\n--------Test 3-------\n");

		Character kt1 = new Knight(new SwordBehavior());
		kt1.fight();
		Character kt2 = new Knight(new AxeBehavior());
		kt2.fight();
		Character kt3 = new Knight(new BowAndArrowBehavior());
		kt3.fight();
		Character kt4 = new Knight(new KnifeBehavior());
		kt4.fight();

		System.out.println("\n--------Test 4-------\n");

		Character t1 = new Troll(new SwordBehavior());
		t1.fight();
		Character t2 = new Troll(new AxeBehavior());
		t2.fight();
		Character t3 = new Troll(new BowAndArrowBehavior());
		t3.fight();
		Character t4 = new Troll(new KnifeBehavior());
		t4.fight();
	}	
}