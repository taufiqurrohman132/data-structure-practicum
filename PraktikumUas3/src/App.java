public class App {
    public static void main(String[] args) {
        Stack stack = new Stack(8);
        Queue queue = new Queue(8);

        // data di masukkan kedalam stack
        char[] item = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        for (char j : item) {
            stack.push(j);
        }

        // pop 4 elemen dari stack ke queue
        for (int i = 0; i < 4; i++) {
            queue.masuk(stack.pop());
        }

        // remove 1 elemen dari queue ke stack
        stack.push(queue.keluar());

        // output isi stack terakhir
        stack.item();

        // output front dan rear dari queue
        System.out.println(
                "Front queue : " + (queue.isEmpty() ? "Kosong" : queue.peekDepan())
        );
        System.out.println(
                "Rear queue : " + (queue.isEmpty() ? "Kosong" : queue.rear())
        );


    }
}