import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques1 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an Integer:");
        int x = Integer.parseInt(stdin.readLine());
        division d = new division();
        System.out.println("\n Given Number divided consecutively by 3,2,1,0 ");
        d.div(x);
    }
}

class division
{
    public void div(int a)
    {
        int y, count =0;
        try
        {
            for (int i =3;i>=0;i--)
            {
                count ++;
                y =a/i;
                System.out.println(y);
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by 0 not possible at index " + count);
        }
    }
}