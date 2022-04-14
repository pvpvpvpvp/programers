package programers;

import java.util.ArrayList;
import java.util.List;

public class pro60057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단어를 시작부터 n 개 단위로 중복 된걸 나눈다.!
		// n(1~500) 단위로 자르고 가장 적은 값이 나온 값을 결과에 리턴한다.
		
		// 1, 자르는 식을 만들고 
		// 2, 반복하면서 값을 저장하고
		// 3, 비교 후 출력! (저장과 동시에 비교 하기!)
		
		// 1, 자르기
		List<Integer> cutarray = new ArrayList();
		String s = "a";
		for(int i=1; i<s.length();i++){
			cutarray.add(cutString(i, s));
		}
		cutarray.sort(null);
		System.out.println(cutarray);
	}
	
	public static int cutString(int n,String s) {
		String[] sSpilt = s.split("");
		int count = 1;
		int result = 0;
		List<String> data = new ArrayList<String>();
		
		for (int i = 0; i < sSpilt.length; i+=n) {
			String temp = "";
			for (int j = 0; j < n && i+j < sSpilt.length; j++){
				temp+=sSpilt[i+j];
				System.out.print(sSpilt[i+j]);
				if(j==n-1 || i+j+1== sSpilt.length) {
					data.add(temp);
				}
			}
			System.out.println();
		}
		System.out.println("준비된 배열 n="+n+" "+data);
		for(int i=0;i<data.size();i++) {
			if((i+1)<data.size()&&data.get(i).equals(data.get(i+1))) {
				count++;
				System.out.println("중복확인");
			}else if(count>1){
				result+=n+1;
				System.out.println("값을 기록 :"+result);
				if(count>9){
					result++;
					System.out.println("10번넘는 중복");
				}
				count=1;
			}else {
				if(data.get(i).length()!=n&&n!=1) {
					result+=(data.get(i).length()%n);
				}else {
					result+=n;
				}
				System.out.println("조건 미달성시 추가 "+result);
			}
		}
		System.out.println( n+" 결과: "+result);
		return result;
	}
}
