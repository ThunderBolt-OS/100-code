class Arrange_Coins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
    static int arrangeCoins(int n) {
        int i = 1;
        while( i <= n ) {
            n -= i;
            i++;

        }return (i-1);

    }
}