package model;

/**
 *
 * @author
 */
public class G implements H {
    public G(J j) {
        System.out.println("G::G(" + j + ")");
    }

    @Override
    public String toString() {
        return "G{" + '}';
    }
}
