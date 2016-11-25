package PK;
//A+B for matrices
import java.io.*;  
import java.util.*;  
   
public class PK1001{  
   
    public static void main(String[] args) throws Exception{  
    	Scanner sc=new Scanner(System.in);
    	while(sc.hasNext()){
    	int m=sc.nextInt();
    	if(m==0) break;
    	int n=sc.nextInt();
    	int A[][]=new int[m][n];
    	int B[][]=new int[m][n];
    	int C[][]=new int[m][n];
    	int row0=0,column0=0;
    	
    	for(int i=0;i<m;i++){
    		for(int j=0;j<n;j++){
    			A[i][j]=sc.nextInt();
    		}
    	}
    	for(int i=0;i<m;i++){
    		for(int j=0;j<n;j++){
    			B[i][j]=sc.nextInt();
    			C[i][j]=A[i][j]+B[i][j];
    		}
    	}
    	int count=0,flag;///flag标志,若元素全为0则置1，否则置0
    	for(int i=0;i<m;i++){
    		flag=0;
    		for(int j=0;j<n;j++){
    		if(C[i][j]!=0){flag=1; break;};
    	}
    		if(flag==0) count++;
    	}
    	for(int j=0;j<n;j++){
    		flag=0;
    		for(int i=0;i<m;i++){
    			if(C[i][j]!=0){flag=1; break;}
    		}
    		if(flag==0) count++;
    	}
    	System.out.println("0row:"+row0+"        0column:"+column0+"        0sum:"+count);
    }
    	sc.close();
    }  	
   
}	
    	
//        StreamTokenizer st = new StreamTokenizer(new BufferedReader(  
//                    new InputStreamReader(System.in)));  
//        while(st.nextToken() != StreamTokenizer.TT_EOF){  
//            int m = (int)st.nval;  
//            if(m == 0){  
//                break;  
//            }  
//            st.nextToken();  
//            int n = (int)st.nval;  
//            int matrix[][] = new int[m][n];  
//            for(int i = 0 ; i < m; i++){  
//                for(int j = 0; j < n; j++){  
//                    st.nextToken();  
//                    matrix[i][j] = (int)st.nval;  
//                }  
//            }  
//   
//            for(int i = 0 ; i < m; i++){  
//                for(int j = 0; j < n; j++){  
//                    st.nextToken();  
//                    matrix[i][j] += (int)st.nval;  
//                }  
//            }  
//            int zeroNum = 0;  
//            for (int i = 0; i < m; i++) {  
//                boolean isZero = true;  
//                for (int j = 0; j < n; j++) {  
//                    if (matrix[i][j] != 0) {  
//                        isZero = false;  
//                        break;  
//                    }  
//                }  
//                if (isZero) {  
//                    zeroNum++;  
//                }  
//            }  
//            for (int j = 0; j < n; j++) {  
//                boolean isZero = true;  
//                for (int i = 0; i < m; i++) {  
//                    if (matrix[i][j] != 0) {  
//                        isZero = false;  
//                        break;  
//                    }  
//                }  
//                if (isZero) {  
//                    zeroNum++;  
//                }  
//            }  
//            System.out.println(zeroNum);  
//        }  
//    }  
//}  