package PK;

import java.util.*;
import java.io.*;

public class PK1012 {
	static int n, m;
	static int father[];
	static HashSet<Integer> hset;
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		while (sc.hasNextInt()) {
			n = sc.nextInt();
			if (n == 0)
				break;
			m = sc.nextInt();
			father = new int[n];
			for (int i = 0; i < n; i++)
				father[i] = i;
			for (int j = 0; j < m; j++) {
				int x = findF(sc.nextInt() - 1);
				int y = findF(sc.nextInt() - 1);
				System.out.println(x+","+y);
				if (x != y) 
					father[y] = father[x];//合并俩集合???? ,将能连通的村庄视为一个元素
			}
			hset = new HashSet<>();
			for (int i : father){
				System.out.println(father[i]);
				hset.add(findF(i));}
			System.out.println(hset.size() - 1);//////////

		}
		sc.close();
	}
	private static int findF(int a) {
		while (father[a] != a) 
			a = father[a];
			//father[a]=a;
		return father[a];
	}*/
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNextInt()){
		n=sc.nextInt();
		if(n==0)
			break;
		m=sc.nextInt()*2;
		int[] flag=new int[m];
		for(int i=0;i<m;i++){
		    flag[i]=sc.nextInt();
//		System.out.println(i+":"+flag[i]);
		}
		
	//	for (int i=0;i<m;i++){System.out.print(flag[i]+" ");}
	//	System.out.println();
	//	for(int j:flag){System.out.print(j+" ");}
		
		
		
		
		hset = new HashSet<>();
		for(int i:flag){
			System.out.print(i+" ");
			hset.add(i);
			}
		System.out.println();
		System.out.print("need at least ");
		System.out.print(n-hset.size()+" roads");//////////
	}
	}
}

