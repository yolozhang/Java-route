package PK;

import java.math.BigInteger;
import java.util.Scanner;

public class PK1003 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			
		BigInteger a=sc.nextBigInteger();
		BigInteger b=sc.nextBigInteger();
		BigInteger c=a.add(b);
		System.out.println(c);
		}
	}
}
