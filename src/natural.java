import java.util.Scanner;
public class natural {
    public static void main(String[] args) {
        //print first 9 natural number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a natural number");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(""+i);
        }
    }
}
