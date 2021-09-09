package ec.edu.espe.sortapp.core;

import java.util.Stack;

/**
 *
 * @author
 */
public class QuickSort implements SortingStrategy {
    @Override
    public int[] sort(int[] data) {
        int output[] = data.clone();
        Stack<Integer> stack = new Stack<>();
        
        stack.push(0);
        stack.push(output.length);

        while (!stack.isEmpty()) {
            int end = stack.pop();
            int start = stack.pop();
            if (end - start < 2) {
                continue;
            }
            int p = start + ((end - start) / 2);
            p = partition(output, p, start, end);

            stack.push(p + 1);
            stack.push(end);

            stack.push(start);
            stack.push(p);

        }
        
        return output;
    }
    
    private int partition(int data[], int position, int start, int end) { 
        int l = start;
        int h = end - 2;
        int piv = data[position];
        swap(data, position, end - 1);

        while (l < h) {
            if (data[l] < piv) {
                l++;
            } else if (data[h] >= piv) {
                h--;
            } else {
                swap(data, l, h);
            }
        }
        
        int idx = h;
        
        if (data[h] < piv) {
            idx++;
        }
        
        swap(data, end - 1, idx);
        
        return idx;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
