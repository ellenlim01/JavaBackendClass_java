package sec06.ch07.starcraft;

public class StarcraftMain {

	public static void main(String[] args) {
		Medic medic1 = new Medic();
		Medic medic2 = new Medic();
		Marine marine = new Marine();
		Tank tank = new Tank();
		
		System.out.println("medic1 - hp : " + medic1.getCurrentHP());
		System.out.println("medic2 - hp : " + medic2.getCurrentHP());
		System.out.println("marine - hp : " + marine.getCurrentHP());
		
		medic1.heal(medic1);
		medic1.heal(medic2);
		medic1.heal(marine);
		medic1.heal(tank);
		
		System.out.println("medic1 - hp : " + medic1.getCurrentHP());
		System.out.println("medic2 - hp : " + medic2.getCurrentHP());
		System.out.println("marine - hp : " + marine.getCurrentHP());
	}

}
