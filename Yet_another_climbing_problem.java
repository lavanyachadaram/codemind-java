import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
int t;
t=sc.nextInt();
for(int i=1;i<=t;i++) {
    int x=sc.nextInt();
int y=sc.nextInt();
System.out.println((x/y)+(x%y));
}               
    
}
}