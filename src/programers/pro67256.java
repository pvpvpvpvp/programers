package programers;

public class pro67256 {
	public static int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{42,0,35}};
	public static void main(String[] args) {
		// 왼손 오른손의 위치값을 알고 있어야 한다.
		String answer="";
		String hand ="r";
		char simpleHand;
		int[] number = {1,3,4,5,8,2,1,4,5,9,5};
		int[] L= {3,0};  // Y X
		int[] R= {3,2};
		simpleHand=hand.toUpperCase().charAt(0);
		for(int i=0; i<number.length;i++) {
//			System.out.println("연산 숫자 "+number[i]);
			if(number[i]==1|number[i]==4|number[i]==7)
			{
				answer+="L";
				L=serch(number[i]);	
//				System.out.println("왼손");
			}
			if(number[i]==3|number[i]==6|number[i]==9)
			{
				answer+="R";
				R=serch(number[i]);
//				System.out.println("오른손");
			}
			if(number[i]==2|number[i]==5|number[i]==8|number[i]==0)
			{
				if(score(L,number[i])==score(R,number[i])){
					if(simpleHand=='L')
					{
						answer+=simpleHand;
						L=serch(number[i]);		
					}
					else {
						answer+=simpleHand;
						R=serch(number[i]);		
					}							
//					System.out.println("왼손");
				}else
				if(score(L,number[i])>score(R,number[i])){
					answer+="R";
					R=serch(number[i]);	
//					System.out.println("오른손");
				}else
				if(score(L,number[i])<score(R,number[i])){
					answer+="L";
					L=serch(number[i]);
//					System.out.println("왼손");
				}
			}
		}
		System.out.println(answer);
	}
	public static int[] serch(int i) {
		int[] xy = new int[2];
		for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				if(keypad[y][x]==i)
				{
					xy[1]=x;
					xy[0]=y;
//					System.out.println(xy[0]+" "+xy[1]);
					return xy;
				}
			}
		}		
		return null;	
	}
	public static int score(int[] LR,int nextNumber) {	
		int s = 0;
		for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				if(keypad[y][x]==nextNumber)
				{
					
					s = Math.abs(LR[0]-y) + Math.abs(LR[1]-x);
//					System.out.println("이동 점수 "+s);
					return s;
				}
			}
		}			
		return 0;
	}
}


