public class InsertionSort {
    public void insertionSort(float A[]){
        for (int i = 0; i < A.length; i++){
            float temp = A[i];
            int k = i;
            while ((k > 0) && (temp < (A[k-1]))){
                A[k] = A[k-1];
                k--;
            }
            A[k] = temp;
        }
    }
}
