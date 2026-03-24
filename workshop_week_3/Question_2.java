package workshop;

public class Question_2 {
    public static void main(String[] args) {
        
        double[] numbers = {2.5, 4.0, 5.5, 6.2, 3.8};
        
        double sum = 0.0;
        
        for(int i = 0; i<numbers.length; i++) {
        	sum+=numbers[i];
        }
        
   
        
        double  average = sum/numbers.length;
        System.out.println(" Total sum " + sum);
        System.out.println("Average " + average);
        
       
    }

}
