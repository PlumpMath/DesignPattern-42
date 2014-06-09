package test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NumberFormatException{

		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		BigInteger sum = new BigInteger("0");
		
		sum.add(one);
		sum.add(two);
		sum.add(three);
		
		System.out.println(sum.toString());
	}

}
