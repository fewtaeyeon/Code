
public class ma {
	public static void main(String[] args) {
		int x = 6;
		int y = 12;
		int z = 8;
		int r = 0, p = 0;
   
		if (x <= 0 || y <= 0 || z <= 0) {
			System.out.print("Error");
		}
		else{
			while (x % y != 0) {
				r = x % y;
				x = y;
				y = r;
			}

			while (z % y != 0) {
				p = z % y;
				z = y;
				y = p;
			}
			System.out.println(y);
		} 
	}
}