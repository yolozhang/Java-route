package PK;

import java.util.Scanner;
import java.math.*;

//Grading
public class PK1002 {
	public static void main(String[] agg) {
		// int P,T,G1,G2,G3,Gj;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int P = sc.nextInt();
		int T = sc.nextInt();
		int G1 = sc.nextInt();
		int G2 = sc.nextInt();
		int G3 = sc.nextInt();
		int Gj = sc.nextInt();
		double grade;
		if (Math.abs(G1 - G2) <= T) {
			grade = (double)(G1 + G2) / 2;         //20 2 13 15 x x : 14
			//System.out.println(grade);
		} else{
			//if (Math.abs(G2 - G1) > T) {
			if (Math.abs(G3 - G1) <= T && Math.abs(G2 - G3) <= T) {
				grade =  (double)Math.max(Math.max(G1, G2), G3);    //20 2 12 16 14 x :16
			} else{
				if (Math.abs(G3 - G1) > T && Math.abs(G2 - G3) > T) {
				grade =  (double)Gj;     //20 2 12 16 9 17 :17
			} else{
				if (Math.abs(G3 - G2) > Math.abs(G1 - G3)) {
				grade =  (double)(G1 + G3) / 2;     //20 2 12 16 10 x :11
			} else
				grade = (double) (G2 + G3) / 2;    //20 2 12 16 17 x:16.5
			//System.out.println(grade);
			}
			}
		//}
	}
		System.out.println(grade);
		}
	}
}
