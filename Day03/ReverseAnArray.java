import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseAnArray {
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
            int[] revarr = new int[n];
            for(int i=0;i<n;i++)
            {
                revarr[i] = arr[n-i-1];
            }
            System.out.println(Arrays.toString(revarr));

        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
