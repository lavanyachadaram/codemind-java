import java.util.Scanner;
public class Factor{
    public static void main(String[] args){
    Scanner bv = new Scanner(System.in);
int t = bv.nextInt();
for(int i=1;i<=t;i++){
    int a = bv.nextInt();
int b = bv.nextInt();
if((b-a)<a && (a!=b)){
    System.out.println("NO");
}
else{
    System.out.println("YES");
}
}
}
}