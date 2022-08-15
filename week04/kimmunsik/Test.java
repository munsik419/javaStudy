package kimmunsik;

import java.io.IOException;


//public class test {
//    public static void main(String[] args) throws IOException {
//        byte [] a= {'k', 'i', 'm'};
//        System.out.write(a);
//    }
//}
public class Test {
    public static void main(String args[]){
        int TotalSum=0;
        int A[]={1,2,3,4,5};
        int n= A.length;
        for (int i=0; i<n;i++){
            TotalSum=TotalSum+A[i];
        }
        System.out.println("The average="+ (float)(TotalSum/n));
    }
}
