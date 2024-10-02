import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorsBruteForce {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(reader.readLine());
            int count = 0;
            for(int i=1;i<=N;i++)
            {
                if(N%i==0)
                {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println(count);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
