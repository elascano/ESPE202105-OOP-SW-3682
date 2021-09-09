package ec.edu.espe.sortapp.model;

/**
 *
 * @author Andres Jonathan J.
 */
public class SortedEntry {
    private int[] input;
    private int[] output;
    private String algorithm;

    public int[] getInput() {
        return input;
    }

    public void setInput(int[] input) {
        this.input = input;
    }

    public int[] getOutput() {
        return output;
    }

    public void setOutput(int[] output) {
        this.output = output;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
