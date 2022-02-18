import java.util.Scanner;
public class HomeWork {
  
  static void funA(int n){
    String result = "";
    String number = Integer.toString(n);
    for (int i = 0; i < number.length(); i++){
      if(number.charAt(i) % 2 == 0){
        result += "Even" + number.charAt(i); 
      }else{
        result += "Odd" + number.charAt(i);
      }
    }
    System.out.println("A : " + result);
    funB(result);
  }
  
  static void funB(String res){
    String result = res;
    result = result.replaceAll("Odd","DDO");
    result = result.replaceAll("Even","NEVE");
    System.out.println("B : " + result);
    funC(result);
  }
  
  static void funC(String res){
    String result = res;
    result = result.replaceAll("DDO", "686879");
    result = result.replaceAll("NEVE", "78698669");
    System.out.println("C : " + result);
    funD(result);
  }
  
  static void funD(String res){
    String result = res;
    result = result.replaceAll("686879", "DDO");
    result = result.replaceAll("78698669", "NEVE");
    System.out.println("D : " + result);
    funE(result);
  }
  
  static void funE(String res){
    String result = res;
    result = result.replaceAll("DDO", "Odd");
    result = result.replaceAll("NEVE", "Even");
    System.out.println("E : " + result);
    funF(result);
  }
  
  static void funF(String res){
    String result = res;
    result = result.replaceAll("Odd", "");
    result = result.replaceAll("Even", "");
    System.out.println("F : " + result);
    System.out.println("Thx u For Using");
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    while(true){
      System.out.print("What your number? : ");
      int input = in.nextInt();
      if(input > 0){
        System.out.println(input);
        funA(input);
      }
    }
  }
}
