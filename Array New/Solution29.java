class Solution29 {
    public static int divide(int dividend, int divisor) {
    int res = dividend % divisor;    
    if(res>Math.pow(2, 31)-1){
            return (int) Math.pow(2, 31)-1;
        }
       return (dividend/divisor);
    }
    public static void main(String[] args) {
        int div = -2147483648;
        int divisor =-1;
        long res = divide(div, divisor);
        System.out.println(res);
    }
}
