package PK;
import java.util.*;
import java.io.*;

public class PK1008 {

	static int arr[][];
	static int cost[][];
	static int dist[];
	static int money[];
	static boolean isok[];
	static int m,n;
	static final int MAX=Integer.MAX_VALUE;
	public static void main(String[] args){
		Scanner sc=new Scanner(new BufferedInputStream(System.in));
		while(sc.hasNext()){
			n=sc.nextInt();
			m=sc.nextInt();
			if(n==0&&m==0)
				break;
			arr=new int[n][n];
			cost=new int[n][n];
			dist=new int[n];
			money=new int[n];
			isok=new boolean[n];
			
			for(int[] a:arr)
				Arrays.fill(a,MAX);
			for(int[] a:cost)
				Arrays.fill(a, MAX);
			for(int i=0;i<m;i++){
				int a=sc.nextInt()-1;
				int b=sc.nextInt()-1;
				int c=sc.nextInt();
				int d=sc.nextInt();
				if(c<arr[a][b]){
					arr[a][b]=c;
					arr[b][a]=c;
					cost[a][b]=d;
					cost[b][a]=d;
				}
				if(c==arr[a][b]&&d<cost[a][b]){
					 cost[a][b]=d;
					 cost[b][a]=d;
				}
			}
				int start =sc.nextInt()-1;
				int end=sc.nextInt()-1;
				if(start==end)
					System.out.println("0 0");
				dij(start,end);
				System.out.println(dist[end]+""+money[end]);
						
		}	
		sc.close();
	}
	static void dij(int start,int end){
		for(int i=0;i<n;i++){
			dist[i]=arr[start][i];
			money[i]=cost[start][i];
		}
		int index=start;
		for(int i=0;i<n;i++){
			if(i==start)
				continue;
			int min=MAX;
			for(int j=0;j<n;j++)
				if(!isok[j]&&dist[j]<min)
				{
					min=dist[j];
					index=j;
				}
			isok[index]=true;
			
			for(int k=0;k<n;k++){
				if(k==start)
					continue;
				if(!isok[k]&&arr[index][k]!=MAX){
					int temp=arr[index][k]+dist[index];
					int temps=cost[index][k]+money[index];
					if(temp<dist[k]){
						dist[k]=temp;
						money[k]=temps;
					}else if(temp==dist[k]&&(money[k]>temps)){
						money[k]=temps;
					}
				}
				
			}

		}		
	}

}
