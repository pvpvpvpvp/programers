package programers;

public class pro813001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		String a = "one2threesixsix";
		String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		// 탐색을 하되 서순 지켜야됨
		
		for(int i=0; i<10;i++){
			a=a.replace(number[i], ""+i);
		}
		answer = Integer.valueOf(a);
		
		
		System.out.println(answer);
	}

}
