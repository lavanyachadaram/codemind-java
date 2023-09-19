import java.util.Scanner;
public class Monoply{
    public static  void main(String[] args){
    Scanner bv = new Scanner(System.in);
int t  = bv.nextInt();
for(int i=1;i<=t;i++){
    int a = bv.nextInt();
int b = bv.nextInt();
int c = bv.nextInt();
if(a>b+c || b>c+a || c>a+b){
    System.out.println("YES");
}
else{
    System.out.println("NO");
}
}

}
}