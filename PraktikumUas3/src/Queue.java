public class Queue {
    private final int ukuran;
    public final char[] antrian;
    private int depan;
    private int belakang;
    private int jumlahItem;

    public Queue(int a){
        ukuran = a;
        antrian = new char[ukuran];
        depan = 0;
        belakang = -1;
        jumlahItem = 0;
    }

    // penambahan
    public void masuk(char j){
        if (depan == ukuran -1 ) belakang = -1;
        antrian[++belakang] = j;
        jumlahItem++;
    }

    // penghapusan
    public char keluar(){
        char temp = antrian[depan++];
        if (depan == ukuran) depan = 0;
        if (jumlahItem > 0) jumlahItem--;
        return temp;
    }

    public char peekDepan(){
        return antrian[depan];
    }

    public boolean isEmpty(){
        return jumlahItem == 0;
    }

    public boolean isFull(){
        return jumlahItem == ukuran;
    }

    public int size(){
        return jumlahItem;
    }

    public long akses(int indesk){
        return antrian[indesk];
    }

    public void item(){
        for (char l : antrian) {
            System.out.println("item " + l);
        }
    }

    public char rear(){
        return antrian[belakang];
    }
}
