package algorithm;
/**
 * 约瑟夫环问题
 * @author Rodriguez-xin
 *
 */
public class JosephRing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean people[] = new boolean[30];

		for (int i = 0; i < people.length; i++) {
			people[i] = true;
		}

		int count = 0;
		int num = 1;

		while (count < 15) {

			for (int i = 0; i < people.length; i++) {
				if(num==9){
					people[i]=false;
					count++;
					num=0;
				}
				num++;
			}
		}
		
		for(int i=0;i<people.length;i++){
			System.out.println(i+1+":"+people[i]);
		}
	}

}
