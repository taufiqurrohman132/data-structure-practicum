public class BubleShort {
    public void bubbleSort(float A[]){
        for (int i = 0; i < A.length; i++){
            for (int j = A.length-2; j >= i; j--){
                if (A[j] > A[i+1]){
                    swap(A, j, j+1);
                }
            }
        }
    }
    public void swap(float B[], int x, int y){
        float temp;
        temp = B[x];
        B[x] = B[y];
        B[y] = temp;
    }
}
