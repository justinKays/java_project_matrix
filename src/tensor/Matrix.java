package tensor;

import java.util.List;

public interface Matrix {
    List<Vector> getMatrix();

    Scalar viewElement(int indR, int indC);

    int[] viewSize();


}
