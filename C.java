import java.util.Scanner;
public class C {
    static int calculateSum(int n)
    {
        if (n <= 0)
            return 0;

        int fibo[]=new int[n+1];
        fibo[0] = 0; fibo[1] = 1;
        int sum = fibo[0] + fibo[1];
        for (int i=2; i<=n; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int i;
        String str;
        Scanner sc=new Scanner(System.in);
        str = sc.nextLine();
        int sum=calculateSum(str.length());

        int f1 = 0, f2 = 1;

        if (str.length() < 1)
            return;

        System.out.print(sum);
        for (i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+""+f2);
            int next = f1 + f2;
            f1 = f2;
            f2 = next;

        }
    }
}
