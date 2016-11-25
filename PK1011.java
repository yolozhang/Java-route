package PK;

import java.util.*;

public class PK1011 {
	public static int N = 100;
	
	public static void main(String[] args) {
		int maxsofar = 0, maxendh = 0;
		int begin = 0, end = 0, temp = 0;
		int x[] = new int[N];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int k = sc.nextInt();
			for (int i = 0; i < k; i++) {
				x[i] = sc.nextInt();
			//	System.out.print(x[i] + " ");
			}
			//System.out.println();
			for (int j = 0; j < k; j++) {
				if (x[j] < 0)
					count++;
				maxendh += x[j];
				if (maxendh <= 0) {
					maxendh = 0;///重新开始累加
					temp = j + 1;
				}
				if (maxendh > maxsofar) {//只有当和变大时才更新begin和end
					maxsofar = maxendh;
					begin = temp;
					end = j;
				}
				if (maxendh == 0 && maxsofar == 0 && x[j] == 0)
					end = begin = j;
			}
			
			if (count == k)
				System.out.println(x[0] + "　" + x[k - 1]);
			else
				System.out.println("maxsum= "+maxsofar + ": from " + x[begin] + " to " + x[end]);
		}
		sc.close();
	}  //7: 4 3 -2 -3 15 -17 16 no wrong with this sample
}
