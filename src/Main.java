import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		int numOfInput,countJump=2,countSplash=3;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number:");
		numOfInput = scanner.nextInt();
		
		int[] listRound = new int[numOfInput];
		
		System.out.print("Input "+numOfInput+" number:");
		for(int i=0;i<numOfInput;i++){
			listRound[i] = scanner.nextInt();
		}
		
		for(int i=1;i<=numOfInput;i++){
			for(int j=1;j<=(2*i)+1;j++){
				int m=1;
				if(j==countJump){
					for(int n=i;n>0;n--){
						for(int k=0;k<numOfInput;k++){
							if(m==listRound[k]){
								System.out.println(i+" jump\n");
							}
						}
						m++;
					}
				}
				else if(j==countSplash){
					for(int n=i;n>0;n--){
						for(int k=0;k<numOfInput;k++){
							if(m==listRound[k]){
								System.out.println(i+" jump\n");
							}
						}
						m++;
					}
				}else if(j==1){
					for(int n=i;n>0;n--){
						for(int k=0;k<numOfInput;k++){
							if(m==listRound[k]){
								System.out.println(i+" jump\n");
							}
						}
						m++;
					}
				}
			}
		}
	}
}
