import java.util.Scanner;
public class laav{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int i;
        for(i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int j,c=0;
            for(j=a;j<=b;j++)
            {
                if(j%10==2||j%10==3||j%10==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}