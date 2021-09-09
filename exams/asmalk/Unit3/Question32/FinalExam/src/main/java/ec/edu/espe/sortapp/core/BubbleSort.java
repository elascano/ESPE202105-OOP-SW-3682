package ec.edu.espe.sortapp.core;

/**
 *
 * @author
 */
public class BubbleSort implements SortingStrategy {
    @Override
    public int[] sort(int[] data) {
        int output[] = data.clone();
        
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length; j++) {
                int a = output[i];
                int b = output[j];
                
                if (a < b) {
                    output[i] = b;
                    output[j] = a;
                }
            }
        }
        
        return output;
    }
}
