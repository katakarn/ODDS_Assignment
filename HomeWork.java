import java.util.Scanner;
public class Main {
  
  static void funA(int n, boolean x){
    String result = "";
    if(x){
      result += "Even" + Integer.toString(n); 
    }else{
      result += "Odd" + Integer.toString(n);
    }
    System.out.println("A : " + result);
    funB(result,x);
  }
  
  static void funB(String res, boolean x){
    String result = res;
    System.out.println("B : " + result);
    funC(result);
  }
  
  static void funC(String res){
    String result = res;
    result += "abcd";
    System.out.println("B : " + result);
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    while(true){
      System.out.print("What your nuber? : ");
      int input = in.nextInt();
      boolean x;
      if(input % 2 == 0){
        x = true;
      }else{
        x = false;
      }
      if(input < 0){
        break;
      } else{
        System.out.println(input);
        funA(input,x);
      }
    }
  }
}