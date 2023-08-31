import java.util.Scanner;
public class laav{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        for(int i=1;i<n;i++)
        {
            a=(int)((n*(n+1))/2);
        }
        System.out.println(a);
    }
}