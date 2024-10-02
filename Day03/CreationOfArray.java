import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CreationOfArray {
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
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println(Arrays.toString(arr));
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
