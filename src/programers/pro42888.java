package programers;

import java.util.*;

public class pro42888 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] record = {"Enter uid1234 Prodo", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Prodo", "Leave uid4567", "Enter uid4567 Prodo", "Change uid4567 Prodo", "Enter uid12341 Prodo"};
		String[] answer;
		
		int count = 0;
		Map<String, String> uidAndName = new HashMap<String,String>();
		List<String> action = new ArrayList<>();
		for(String re:record) {
			System.out.println(re);
			String[] sp = new String[3];
 			sp=re.split(" ");
 			try {
 				uidAndName.put(sp[1],sp[2]);
 			}catch (Exception e) {
 				e.printStackTrace();
 				System.err.println(sp[1]+" "+uidAndName.get(sp[1])+" : "+re);
			}
 			if(sp[0].equals("Change")) {
 				count++;
 			}
 			action.add(sp[0]+" "+sp[1]);
		}
		System.out.println(uidAndName);
		answer = new String[record.length-count];
	
//			System.out.println(answer.length);
//			System.out.println(count);
		for(int i=0,n=0; i<answer.length ;n++,i++) {
			String[] sp = new String[3];
			sp=action.get(n).split(" ");
			if (sp[0].equals("Change")) {
				n++;
				sp=action.get(n).split(" ");
 			}
			if (sp[0].equals("Enter")) {
				answer[i]=uidAndName.get(sp[1])+"님이 들어왔습니다.";
			}
			if (sp[0].equals("Leave")) {		
				answer[i]=uidAndName.get(sp[1])+"님이 나갔습니다.";
			}
			
			System.out.println(answer[i]);
		}
	}
}
