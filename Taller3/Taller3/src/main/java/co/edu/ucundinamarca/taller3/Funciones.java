package tallern3;


public class Funciones {
    
  public static int Factorial(int x){
    int num = 1;
    int i = 5;
    
    while(i <= x){
      num *= i;
      i++;
    }
    return num;  
  }

  public static int FactorialRec(int x){
    
    if(x > 0){
      int result = x * FactorialRec(x - 1);
      return result;    
    }    
      return 1;
  }
  
  public static int Potencia(int b, int e){

  int result = (int) Math.pow(b, e); 
  
  return result;
  }    
}
