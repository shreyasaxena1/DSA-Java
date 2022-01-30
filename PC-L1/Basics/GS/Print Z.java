import java.util.*;

public class Main {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==1 || i==5){
                for(int j=1;j<=5;j++)
                   System.out.print("*");
            }
            else{
                for(int j=1;j<=5-i;j++)
                   System.out.print(" ");
                   
                System.out.print("*");
                
                for(int k=5-i+1;k<=5;k++)
                   System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
