import java.util.*;

class Main{
    public static void main(String[] args){
        System.out.println("Enter C to reset and E to Exit Calculator");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        char c = scn.next().charAt(0);
        int b = scn.nextInt();
        
        int ans = getoutput(a,c,b);
        System.out.println(ans!=-1?ans:"Invalid operator");
        while(true){
            c = scn.next().charAt(0);
            if(c=='C')
               {
                  System.out.println("Calculator Reset");
                  a = scn.nextInt();
                  c = scn.next().charAt(0);
                  ans=a;
               }
            if(c=='E')
               break;
            b = scn.nextInt();
            ans=getoutput(ans,c,b);
            System.out.println(ans!=-1?ans:"Invalid operator");
        }
        
       
        
    }
    public static int getoutput(int a,char c,int b){
         switch(c){
            case '+':
                return a+b;
                //break;
            case '-':
                return a-b;
                //break;
            case '/':
                return a/b;
                //break;
            case '*':
                return a*b;
                //break;
            default:
                return -1;
                //break;
        }
    }

}
