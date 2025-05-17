package tensor;

import java.util.ArrayList;
import java.util.List;

public class MatrixImpl implements Matrix{
    private final List<Vector> matrix;

    //06
    MatrixImpl(int mm, int nn, double dd){
        this.matrix = new ArrayList<Vector>();

        for(int i=0;i<mm;i++){
            this.matrix.add(new VectorImpl(nn, dd));
        }
    }

    //07
    MatrixImpl(int mm, int nn, int ii, int jj){
        this.matrix = new ArrayList<Vector>();

        for(int i=0;i<mm;i++){
            this.matrix.add(new VectorImpl(nn, ii, jj));
        }
    }

    //08 csv ing
//    MatrixImpl(int mm, int nn, int ii, int jj){
//        this.matrix = new ArrayList<Vector>();
//
//        for(int i=0;i<mm;i++){
//            this.matrix.add(new VectorImpl(nn, ii, jj));
//        }
//    }

    //09 ing
//    MatrixImpl(double[][] arr){
//        this.matrix = new ArrayList<Vector>();
//
//        for(double[] row: arr){
//            Vector rowVector = new VectorImpl(row.length, dd);
//            for(double dd: row){
//            }
//        }
//    }

    @Override
    public List<Vector> getMatrix(){
        return this.matrix;
    }

    //12 지정?
    @Override
    public Scalar viewElement(int indR, int indC){
        return this.matrix.get(indR).viewElement(indC);
    }

    //13
    @Override
    public int[] viewSize(){
        int[] retArr = new int[2];
        retArr[0] = this.matrix.size();
        retArr[1] = this.matrix.get(0).viewSize();
        return retArr;
    }

    //14
    @Override
    public String toString(){
        return this.matrix.toString();
    }

}
