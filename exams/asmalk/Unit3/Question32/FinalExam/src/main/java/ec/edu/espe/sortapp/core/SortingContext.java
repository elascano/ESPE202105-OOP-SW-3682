package ec.edu.espe.sortapp.core;

/**
 *
 * @author
 */
public class SortingContext {
    public static enum SortAlgorithm {
        BubbleSortAlgorithm,
        QuickSortALgorithm,
        InsertionSortAlgorithm
    }
    
    public int[] sort(int data[]) {
        return defineSortStrategy(data.length).sort(data);
    }
    
    public SortingStrategy defineSortStrategy(int size) {
        SortingStrategy strategy;
        SortAlgorithm algorithm = getSortAlgorithm(size);
        
        if (algorithm == SortAlgorithm.BubbleSortAlgorithm) {
            strategy = new BubbleSort();
        } else if (algorithm == SortAlgorithm.InsertionSortAlgorithm) {
            strategy = new InsertionSort();
        } else {
            strategy = new QuickSort();
        }
        
        return strategy;
    }
    
    public SortAlgorithm getSortAlgorithm(int size) {
        if (size > 0 && size < 4) {
            return SortAlgorithm.BubbleSortAlgorithm;
        } else if (size >= 4 && size < 8) {
            return SortAlgorithm.InsertionSortAlgorithm;
        } else {
            return SortAlgorithm.QuickSortALgorithm;
        }
    }
}
