package PK;

import java.io.*;
import java.util.*;

/*@Author:TFSFG
  @Time:20161115*/

public class PK1010 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String ss[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<10;i++){
			hm.put(ss[i], i);////将英文和数字一一对应
		}
		while(!(str=br.readLine()).startsWith("zero + zero ")){
			Scanner sc=new Scanner(str);
			 Stack<String> st=new Stack<String>();
			 while(sc.hasNext()){
				 st.push(sc.next());
			 }
		//	 st.pop();////this is my success
			 String num2str;
			 int num1=0,num2=0;
			 for(int i=0;!(num2str=st.pop()).equals("+");i++){
				 int temp=hm.get(num2str);
				 for(int j=0;j<i;j++)
					 temp*=10;
				 num2+=temp; 
				// System.out.println(num2);
			 }
			 for(int i=0;!st.isEmpty();i++){
				 int temp=hm.get(st.pop());
				 for(int j=0;j<i;j++)
					 temp*=10;
				 num1+=temp;
				 //System.out.println(num1+" ");
			 }
			 System.out.println(num1+" "+num2);
			 
			 System.out.println(num1+"+"+num2+"="+(num1+num2));
			 
			sc.close();
		}
		
	}

}
