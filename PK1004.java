package PK;

/*median*/
import java.io.*;
import java.util.Scanner;

public class PK1004 {
	  static int arr1[],arr2[],arr[];
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
			while(sc.hasNextInt()){
				int n=sc.nextInt();
				arr1=new int[n];
				for(int i=0;i<n;i++){
					arr1[i]=sc.nextInt();
				}
				int m=sc.nextInt();
				arr2=new int[m];
				arr=new int[n+m];
				for(int i=0;i<m;i++){
					arr2[i]=sc.nextInt();
				}
				int i=0,j=0,k=0;
				while(i<n&&j<m){
					if(arr1[i]<arr2[j]){
						arr[k++]=arr1[i++];
				}else{
					arr[k++]=arr2[j++];
				}
				}	
				while(i<n){arr[k++]=arr1[i++];}
				while(j<m){arr[k++]=arr2[j++];}
				
				System.out.println("the median is:  "+arr[(arr.length-1)/2]);
				
			//先排序，在求中位数		
				
				
			}
	}
}
