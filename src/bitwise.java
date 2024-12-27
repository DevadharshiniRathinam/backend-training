import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int rightbit=n>>2;
        int leftbit=n<<2;
        System.out.println(rightbit +"and "+ leftbit);
        System.out.println("Xor value "+(rightbit^leftbit));
    }
}
