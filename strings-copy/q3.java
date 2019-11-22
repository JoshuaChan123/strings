import java.util.Scanner;
class q3{
    public static void main ( String args[]) {
        int num=0;
        Scanner sc=new Scanner(System.in);

        String str="";
        num=sc.nextInt();

        while(num>0){
            if(num%2==0){
             str+=0;
             num=(int)(num/2);
            } else if(num%2==1){
                str+=1;
                num=(int)(num/2);
            }
        }
        System.out.println(str);
    }
}