public class HW0710 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("輸入整數");
		int num = scan.nextInt();
		
		if( num % 2 == 0 ) {
			System.out.print("偶數");
		}else {
			System.out.print("奇數");	
		}
	}
}
