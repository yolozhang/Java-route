package PK;

/*Graduate Admission*/

import java.io.*;
import java.util.*;

public class PK1005 {
	static Student student[]=null;
	static School school[]=null;
	static int quota[]=null;
	public static void main(String[] args){
		int stuNum,schNum,choices;
		Scanner sc=new Scanner(new BufferedInputStream(System.in));
		while(sc.hasNext()){
			stuNum=sc.nextInt();//N
			schNum=sc.nextInt();//M
			choices=sc.nextInt();//K
			student=new Student[stuNum];
			school=new School[schNum];
			for(int i=0;i<school.length;i++){
				school [i]=new School();
				}
			quota=new int[schNum];//招生名额
			for(int i=0;i<schNum;i++){
				quota[i]=sc.nextInt();
			}
			for(int i=0;i<stuNum;i++){
				student[i]=new Student();
				student[i].GE=sc.nextInt();
				student[i].GI=sc.nextInt();
				student[i].index=i;////?????
				student[i].perfers=new int[choices];
				for(int j=0;j<choices;j++)
					student[i].perfers[j]=sc.nextInt();
			}
			Arrays.sort(student);
			for(int i=0;i<student.length;i++){
				for(int j=0;j<choices;j++){
					ArrayList<Student>  list=school[student[i].perfers[j]].student;
					if(list.size()<quota[student[i].perfers[j]]){//若动态数组内元素数小于学生i选择的j学校的志愿限额
						list.add(student[i]);
						break;
					}else if(list.size()>=quota[student[i].perfers[j]]){
						if(student[i].compareTo(list.get(list.size()-1))==0){//若学生与数组最后一个元素一样，则也加入数组
							list.add(student[i]);
							break;
						}
					}
				}
			}
				for(int i=0;i<school.length;i++){//////将学生id按学校排序输出
					int arr[]=new int[school[i].student.size()];
					for(int j=0;j<school[i].student.size();j++){
						arr[j]=school[i].student.get(j).index;
						System.out.println("--"+arr[j]);///
					}
					Arrays.sort(arr);
					for(int j=0;j<arr.length;j++){
						if(j!=arr.length-1)
							System.out.print(arr[j]+" ");
						else
							System.out.print(arr[j]);
					}
					System.out.println();	
				}
				
		}
	
	}
}
	class School{
		ArrayList<Student>  student=new ArrayList<Student>();
	}
	
	class Student implements Comparable<Student>{
		public int index;
		int GE,GI;
		int perfers[];
		public int compareTo(Student s){
			double s1=((this.GE+this.GI)/2.0);//this是当前元素
			double s2=((s.GE+s.GI)/2.0);//s是新元素
			if(s1==s2){
				return s.GE-this.GE;
			}else if(s1>s2){
				return -1;
			}else  return 1;
		}
	}
	

