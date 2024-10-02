import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateArrayKtimesOptimised {
    public static void reverse(int[] arr, int a, int b)
    {
        while(a<b)
        {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
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
            if(k>n-1)
            {
                k = k%n;
            }
            if(k<0)
            {
                 k = k + n;
            }
            reverse(arr, 0,n-1);
            reverse(arr,0,k-1);
            reverse(arr, k,n-1);
            System.out.println(Arrays.toString(arr));

        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
