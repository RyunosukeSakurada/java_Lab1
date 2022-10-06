public class ConvertCurrency {
    public static void main(String[] args) throws Exception {
        int totalCoins = 324;
        int dollars =  totalCoins/100;
        int cents = totalCoins - (dollars*100);
        System.out.println("The value is " + dollars + " dollars and " + cents + "cents");
    }
}

