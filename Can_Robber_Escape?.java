import java.util.Scanner;
public class RoadChase {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
int N = scanner.nextInt();
int[] A = new int[N];
for (int i = 0; i < N; i++) {
    A[i] = scanner.nextInt();
}
int oddJunctions = 0;
for (int roads : A) {
    if (roads % 2 == 1) {
    oddJunctions++;
}
}
if (oddJunctions > 2) {
    System.out.println("NO");
} else {
    System.out.println("YES");
}
scanner.close();
}
    
}