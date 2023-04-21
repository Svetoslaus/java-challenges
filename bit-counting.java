public class BitCounting {

  
   public static void main(String args[])
    {
        int i = 9;
        System.out.println(countBits(i));
    }

  static int countBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }  
}
