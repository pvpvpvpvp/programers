package programers;

import java.util.ArrayList;
import java.util.List;

public class pro64061 {
	public static int[] length=new int[2]; // Y X
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		List<Integer> doll = new ArrayList<Integer>();
		int bucket = 0;
		length[1]=board[0].length;
		length[0]=board.length;
		
		// 보드판에서 바구니로 0을 제외한 값 이동
		// 이동시에는 무브에 따라 y축을따라 값 
		// 바구니에서 연이은 인형(숫자)가 있으면 지우면서 카운팅

		doll=serch(moves, board);
		System.out.println(doll);
		do
		{
			bucket=doll.size();
				for (int i = 0; i < doll.size(); i++) {
				
					if((i+1)<doll.size()&&doll.get(i)==doll.get(i+1))
					{
						doll.remove(i);
						doll.remove(i);		
						answer+=2;
					}
				}
				System.out.println(answer);
				System.out.println(doll);
			}while(bucket!=doll.size());
		}
	
	private static List<Integer> serch(int[] moves,int[][] board) {
		List<Integer> doll = new ArrayList<Integer>();
		for(int x:moves) {
			for(int y=0;y<board.length;y++){
				if(0!=board[y][x-1]){
					doll.add(board[y][x-1]);
					board[y][x-1]=0;
					y=board.length;		
				}
			}
		}	
		return doll;
	}
}
