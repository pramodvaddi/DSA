package OmicronBigO;

// n = n = 2n
// Drop constants: Dropping the constant 2 from O(2n) -> O(n).
public class DropConstants {
    public static void printItems(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
        for(int j = 0; j < n; j++){
            System.out.println(j);
        }

    }

    public static void main(String[] args) {
        printItems(10);
    }
}
