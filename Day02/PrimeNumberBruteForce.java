import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberBruteForce {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int P = Integer.parseInt(reader.readLine());
            int count = 0;
            for(int i=1;i<=P;i++)
            {
                if(P%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("It's a prime number");
            }
            else
            {
                System.out.println("it's not a prime number");
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
