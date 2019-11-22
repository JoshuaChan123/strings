
import java.util.Scanner;
class q2{
    public static void main ( String args[]) {
        Scanner sc=new Scanner(System.in);

       String str="";
       str=sc.next();
       String ans="";

       for(int i=str.length()-1; i>=0; i--){
           ans+=str.substring(i,i+1);


        }

        System.out.println(ans);
        if(ans.substring(0).equals(str.substring(0)))
        System.out.println("true");
        else 
        System.out.println("false");



    }
}