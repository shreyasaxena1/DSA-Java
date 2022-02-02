![image](https://user-images.githubusercontent.com/65759731/152084116-b529c127-1db6-4fb0-b5c6-6e256a9afc40.png)

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int answer=0,p=1;
       while(n>0){
           int a = n%b;
           n/=b;
           answer=answer + a*p;
           p=p*10;
           
       }
       return answer;
   }
  }
