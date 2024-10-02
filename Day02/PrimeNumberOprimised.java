import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberOprimised {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int P = Integer.parseInt(reader.readLine());
            int count = 0;
            for(int i=1;i<=P/i;i++)
            {
                if(P%i==0)
                {
                    if(i<P/i)
                    {
                        count += 2;
                    }
                    if(i==P/i)
                    {
                        count++;
                    }
                }
            }
            if(count == 2)
            {
                System.out.println("It's a Prime number");
            }
            else
            {
                System.out.println("It's not a prime number");
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
