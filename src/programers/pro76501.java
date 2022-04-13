package programers;

public class pro76501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] absolutes = {1,2,3};
		boolean[] signs = {true,false,true};
		int answer = 0;
		for(int i=0;i<absolutes.length;i++){
			if(signs[i]) {
				answer+=absolutes[i];
			}else {
				answer-=absolutes[i];
			}
		}
	}

}
