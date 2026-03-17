package workshop_2;
public class Question_12 {
    public static void main(String[] args) {
        
        int x = 10;  // Initialize variable
        
        // Loop runs while x is less than 20
        while (x < 20) {
            
            // Break the loop when x becomes 15
            if (x == 15) {
                break;
            }
            
            // Print the value of x
            System.out.println(x);
            
            // Increment x by 1
            x++;
        }
    }
}
