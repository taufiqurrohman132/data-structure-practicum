import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        BubleShort bs = new BubleShort();
        float nilai [] = new float[5];
        System.out.println("Masukan 5 buat data nilai");
        for (int i = 0; i < 5; i++ ){

            System.out.print((i+1) + " : ");
            nilai[i] = masuk.nextFloat();
        }
        System.out.println("Data nilai yang dimasukan ");
        for (int i = 0; i < 5; i++)
            System.out.println(nilai[i]);
        System.out.println("Data hasil penggurutan ");
        bs.bubbleSort(nilai);
        for (int i = 0; i < 5; i++)
            System.out.println(nilai[i]);

        SelectionSort ss = new SelectionSort();
        int nilaiSelect[] = new int[5];
        System.out.println("Masukan 5 buat data nilai");


        for (int i = 0; i < 5; i++ ){
            System.out.print((i+1) + " : ");
            nilaiSelect[i] = masuk.nextInt();
        }
        System.out.println("Data nilai yang dimasukan ");
        for (int i = 0; i < 5; i++)
            System.out.println(nilai[i]);
        System.out.println("Data hasil penggurutan ");
        ss.selectionSort(nilaiSelect);
        for (int i = 0; i < 5; i++)
            System.out.println(nilaiSelect[i]);

        InsertionSort is = new InsertionSort();
        float nilaiInsert [] = new float[5];
        System.out.println("Masukan 5 buat data nilai");
        for (int i = 0; i < 5; i++ ){
            System.out.print((i+1) + " : ");
            nilaiInsert[i] = masuk.nextFloat();
        }
        System.out.println("Data nilai yang dimasukan ");
        for (int i = 0; i < 5; i++)
            System.out.println(nilaiInsert[i]);
        System.out.println("Data hasil penggurutan ");
        is.insertionSort(nilaiInsert);
        for (int i = 0; i < 5; i++)
            System.out.println(nilaiInsert[i]);
    }
}