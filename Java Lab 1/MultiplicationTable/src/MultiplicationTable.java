public class MultiplicationTable {
    public static void main(String[] args) throws Exception {
        int num = 9;
        for(int i = 1; i <= 10; ++i){
          System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
