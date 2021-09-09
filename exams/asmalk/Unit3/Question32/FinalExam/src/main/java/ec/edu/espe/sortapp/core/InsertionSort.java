package ec.edu.espe.sortapp.core;

/**
 *
 * @author
 */
public class InsertionSort implements SortingStrategy {
    @Override
    public int[] sort(int[] data) {
        int output[] = data.clone();
        
        for (int i = 1; i < output.length; i++) { 
            int key = output[i]; 
            int j = i - 1;
            
            while (j >= 0 && output[j] > key) {
                output[j + 1] = output[j];
                j = j - 1;
            }
            
            output[j + 1] = key; 
        }
        
        return output;
    }
}
