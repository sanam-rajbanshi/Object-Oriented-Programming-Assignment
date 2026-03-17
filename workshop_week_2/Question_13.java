package workshop_2;
public class Question_13 {
    public static void main(String[] args) {
        
        int x = 10;  // Initialize variable
        
        // Loop runs while x is less than 20
        while (x < 20) {
            
            x++;  // Increment first
            
            // Skip when x becomes 15
            if (x == 15) {
                continue;
            }
            
            // Print value of x
            System.out.println(x);
        }
    }
}
