public class Sqrt {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
 
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;  
            } else {
                end = mid - 1;    
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Sqrt solution = new Sqrt();

        
        int x1 = 4;
        System.out.println("Sqrt of " + x1 + ": " + solution.mySqrt(x1));  

        
        int x2 = 8;
        System.out.println("Sqrt of " + x2 + ": " + solution.mySqrt(x2));  

   
        int x3 = 2147395599;
        System.out.println("Sqrt of " + x3 + ": " + solution.mySqrt(x3));  
    }
}