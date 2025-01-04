public class Stack {
    private int ukuran;
    private char[] tumpukan;
    public int top;

    public Stack(int a){
        ukuran = a;
        tumpukan = new char[ukuran];
        top = -1;
    }

    public void push(char item){
        tumpukan[++top] = item;
    }

    public char pop(){
        if (top < 0) return ' ';
        return tumpukan[top--];
    }
    public void item(){
        int atas = top;

        System.out.print("isi elemen stack terkhir ");
        for (int i = 0; i <= atas; i++) {
            System.out.print(tumpukan[i]+" ");
        }
        System.out.println();
    }

    public char peak(){
        return tumpukan[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == ukuran-1;
    }
}
