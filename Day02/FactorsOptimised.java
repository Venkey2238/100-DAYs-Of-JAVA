//Let thier are two number i, j where i * j == N
//we can say that i and j are factors of N
//we can also say j = N/i
//If we write the factors from top to bottom for j and bottom to top for N/i
//we can see the factors collide at some point and repeat so consider i,j are equal
//then we can write j = N/i as i = N/i and convert it as i*i = N
//here is the example N = 6
//  i   n/i
//  1   6
//  2   3 ----> at this point the factor will trace back so if i<n/i factors are 2 count += 2 if i==n/i like if we have 6 * 6 = 36 here both are same factors so factor is 1 count++
//  3   2
//  6   1






import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorsOptimised {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(reader.readLine());
            int count = 0;
            for(int i=1;i*i<=N;i++)
            {
                if(N%i==0)
                {
                    if(i<N/i)
                    {
                        count+=2;
                    }
                    if(i==N/i)
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
