package hello;

public class EX02 {

	public static void main(String[] args) {
		//Loop
		for(int i=1; i<3; i++) {
			
		}

	}
	
	//루프가 돌때 
	
	public Integer tempFor() {
		Loop:
			for(int i=0; i<3;i++) {
				System.out.println("Loop 안에 i"  + i);
				Sub: for (int j = 0; j<=5; j++) {
					System.out.println("Sub 안에 j" + j);
					if(j == 3) {
						System.out.println("Sub j ==3" + j);
						break Loop;
					}
				}
			}
		return null;
	}
}