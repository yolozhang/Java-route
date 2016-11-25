package PK;

import java.io.*;
import java.util.*;

//*变量含义：z前有cnt1个o，z与j之间有cnt2个o，j后有cnt3个o*//
//*条件1：zoj，条件2：xzojx，条件3：azbjc-->azbojac；*//
//*条件3告诉我们中间每减少1个o，最后面减少a个o，最终条件3必然要转化到条件2，即（左边o个数=右边o个数，中间1个o）这样得递推关系：cnt3-(cnt2-1)*cnt1=cnt1;*//
//*即cnt3=cnt2*cnt1.*//

public class PK1006 {

	public static void main(String[] args){
		Scanner sc=new Scanner(new BufferedInputStream(System.in));
		String str=null;
		
		/*-------法1-------*/
		/*
		while(sc.hasNext()){
			str=sc.next();
			int i=0;
			int len=str.length();
			int s1=0,s2=0,z1=0,j1=0;
			for(i=0;i<len;i++){
				if(str.charAt(i)=='z') z1++;
				if(str.charAt(i)=='j') j1++;
			}
			if(!(z1==1&&j1==1)){
				System.out.println("wrong answer");
				continue;
			}
			for(i=0;i<len;i++){
				if(str.charAt(i)=='z')  s1=i;
				if(str.charAt(i)=='j')  s2=i-1-s1;
				break;
			}
			if(s1*s2==len-i-1&&s2!=0)     //////
				System.out.println("accept");
			else
				System.out.println("wrong");		
		}	*/
		/*---法2---*/
	//	int cnt1,cnt2,cnt3;
		int i,j,k;
		while(sc.hasNext()){
			str=sc.next();
			int len=str.length();
			int cnt1=0,cnt2=0,cnt3=0;
			for(i=0;i<len;i++){
				if(str.charAt(i)=='z') 
					cnt1=i;
			}
			for(i=0;i<len;i++){
			if(str.charAt(i)=='j'){/////////if 语句后有大括号, 则大括号里面所有的语句都会在if表达式为真时执行；如果没大括号，则if表达式为真时只会执行第一条语句. 
				cnt2=i-1-cnt1;
			//continue;
//			}
//			for(i=0;i<len;i++){
//			if(str.charAt(i)=='j')
				cnt3=len-i-1;}
			}
			//System.out.println(len+"    "+i);
			//System.out.println("cnt1="+cnt1+"  cnt2="+cnt2+"  cnt3="+cnt3);
			if(cnt3==cnt2*cnt1&&cnt2!=0)
				System.out.println("Accepted");
			else
				System.out.println("Wrong Anawer");
		}
	}   
	
}
