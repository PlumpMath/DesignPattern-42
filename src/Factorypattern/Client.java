package Factorypattern;

public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AbstractHumanFactory humanFactory=new HumanFactory();
		Human blackHuman=humanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
	}

}
