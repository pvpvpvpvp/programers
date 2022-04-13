package programers;

public class pro60057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단어를 시작부터 n 개 단위로 중복 된걸 나눈다.!
		// n(1~500) 단위로 자르고 가장 적은 값이 나온 값을 결과에 리턴한다.
		
		// 1, 자르는 식을 만들고 
		// 2, 반복하면서 값을 저장하고
		// 3, 비교 후 출력! (저장과 동시에 비교 하기!)
		
		// 1, 자르기
		
		String s = "#aaaaaazzzzzz";
		String word = "";
		int n = 2;
		int same = 0;
		word="#"+s.charAt(1)+s.charAt(2);
		for(int i=0;i<s.length();i++) {	
			if(s.contains(word)) {
				s=s.replace("#"+s.charAt(1)+s.charAt(2), "#");
				same++;
			}else {
				same=1;
				word="#"+s.charAt(1)+s.charAt(2);
				System.out.println("same reset");
			}
			System.out.println(word+"의 중복횟수 :" +same);
		}
		System.out.println(s);	
	}
}
