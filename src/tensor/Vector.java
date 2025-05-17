package tensor;

import java.util.List;

public interface Vector {
    List<Scalar> getVector();

    Scalar viewElement(int ind);

    int viewSize();

    String toString();
}
