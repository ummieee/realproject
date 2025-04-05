import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*; 
public class Main {
public static void main(String[] args) {
     int[] a = {1, 3, 5};
    int[] b ={2, 4, 6};
    int len = a.length + b.length;
     int[] res = new int[len];
     //[1, 3, 5, 2, 4, 6]
     System.arraycopy(a,0,res,0,a.length);
     System.arraycopy(b,0,res,a.length,b.length);
     System.out.println(Arrays.toString(res));
    int temp;
     for(int i =0 ; i<res.length ;i++){
        for(int j=i+1; j<res.length;j++){
            if(res[i]>res[j]){
                temp = res[i];
                res[i] = res[j];
                res[j] =temp;
            }
        }
     }
     System.out.println(Arrays.toString(res));
}   
}
