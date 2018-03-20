/**
 *
 * @author xekid78
 *
 */
public class While {

	public static void main(String[] args) {
		System.out.println("** ケース１ **");
		int i = 1;
		while (i <= 5) {
			System.out.println(i + "だよ。");
			i++;
		}
		System.out.println("");

		System.out.println("** ケース２ **");
		i = 5;
		while (i > 0) {
			System.out.println(i + "だよ。");
			i--;
		}
	}

}
