public class Bicycle {
	protected int cadence = 0;
	protected int speed = 0;
	protected int gear = 1;

	public void changeCadence(int newValue) {
		cadence = newValue;
	}

	public void changeGear(int newValue) {
		gear = newValue;
	}

	public void speedUp(int increment) {
		speed = speed + increment;
	}

	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
	}
}