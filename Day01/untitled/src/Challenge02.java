public class Challenge02 {
    public static void main(String[] args)
    {
        byte a = 100;
        short b = 2300;
        int c = 4_00_000;
        long d = (long) (50_000 + 10*(a+b+c));
        System.out.println(d);
    }
}