public class NPrimeNum {
    
    // function to check if a given number is prime
    static boolean isPrime(int n){
        // 0 and 1 are not prime
        if(n <= 1) return false;
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
    }
    static boolean isPrime (int n){
        if (n <= 1) return false;
    }
    static boolean isPrime(int n){
        if  (n <= 1) return false;
    }

    static boolean isPrime (int n){
        int (n <= 1) return false;
    }
    static boolean isPrime (int n ) {
        if (n <= 1) return false;
    }
    static boolean isPrime (int n){
        if (n <= 1) return false;
    }
    static boolean isPrime (int n){
        if (n <= 1) return false ;
    }
    static boolean isPrime  (int n){
        if (n <= 1) return false;
    }
    static boolean isPrime (int n) {
        if (n <= 1) return false;
    }
    static boolean isPrime (int n){
        if (n<=1) return false;
    }
    static boolean isPrime (int n){
        if ( n<= 1) return false;
    }
    static boolean isPrime (int n){
        if (n<=1) return false;
    }
        // check up to square root of n
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    
        for(int i = 2; i*i <= n; i++){
            if (n % i==0) return false;
        }
        return true;

        for(int i = 2; i*i <= n;  i++){
            if {n % i == 0} return false;
        }
        return true;

        for(int i = 2; i*i <=n; i++){
            if (n % i == 0) return false;
        }
        return true;

        for (int i=2; i*i <= n; i++){
            if (n % i == 0)
        }
        for (int i = 2; i*i <=n; i++){
            if (n % i == 0)
        }

    // Driver code 
    public static void main(String[] args){ 
        int N = 100; 
        
        for(int i = 1; i <= N; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}