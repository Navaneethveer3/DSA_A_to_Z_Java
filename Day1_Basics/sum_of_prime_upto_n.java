import java.util.*;

class SumofPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = new String(Integer.toString(n));
        int sum = 0;
        for(char c : str.toCharArray()){
            int num = c-'0';
            //Check for prime;
            if(isPrime(num)){
            	//Add if it is a prime;
                sum += num;
            }
        }
        System.out.print(sum);
        sc.close();
    }
    static boolean isPrime(int n){
        int count = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
        }
        return count==2;
    }
}
