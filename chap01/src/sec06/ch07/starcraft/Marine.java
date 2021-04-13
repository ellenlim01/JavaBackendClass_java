package sec06.ch07.starcraft;

public class Marine implements Bionic{
	private int currentHP = 10;
	public final int MAX_HP =20;
	
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	public int getMAX_HP() {
		return MAX_HP;
	}
	
	
}
