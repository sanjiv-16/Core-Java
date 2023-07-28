import java.util.*;
import java.util.LinkedHashSet;
public class increment {
	public static void main(String[] args) {
		int[][] arr= {
				{3,3,3,3},
				{1,2,3,4},
				{3,2,2,3}		
		};
		
	LinkedHashSet ls=new LinkedHashSet();
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(ls.add((arr[i][j]))==false){
					int c=0;
					while(ls.add((arr[i][j])+ ++c)!=true) {
					}
				}
			}
			System.out.println(ls);
			ls.clear();
		}
	}
}
