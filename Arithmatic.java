import java.io.PrintWriter;
public class Arithmatic {
    public static void main(String args[]) {
        PrintWriter pw = new PrintWriter(System.out);
        int a = 4;
        int b = 5;
        pw.println("Sum is: "+(a+b));
        pw.println("Difference is: "+(a-b));
        pw.println("Multiplication is: "+(a*b));
        pw.println("Division is: "+(a/b));
        pw.close();
    }
}
