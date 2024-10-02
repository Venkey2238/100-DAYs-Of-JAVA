import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateArrayKtimes {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println(Arrays.toString(arr));
            int k = Integer.parseInt(reader.readLine());
            for(int i=1;i<=k;i++)
            {
                int temp = arr[n-1];
                for(int j=n-1;j>0;j--)
                {
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
