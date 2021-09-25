package mcd;

public class Mcd {
    
    static int mcd (int num1, int num2){
        
 /*       if ( num1 ==0 || num2==0){
            return 0;
    }
        if (num1 == num2 ){
            return num1;
    }
        if (num1 > num2){
            return mcd (num1-num2,num2);
    }else{
            return mcd (num1, num2-num1)
        }
    */
     
    if (num1==0)
        return num2;
        return mcd(num2%num1, num1);
    }
}
