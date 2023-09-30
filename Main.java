import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variabel
        int n;

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("1). Input : ");
        System.out.print("Masukkan jumlah mahasiswa: ");
        n = scanner.nextInt();

        double[] nilai = new double[n];
        double total = 0;

        // Array satu dimensi
        System.out.println("\n2). Array satu dimensi : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextDouble();
            total += nilai[i];
        }

        // Perhitungan rata-rata
        double rata_rata = total / n;

        // Output
        System.out.println("\n3). Output : ");
        System.out.println("Rata-rata nilai mahasiswa: " + rata_rata);

        // Array multidimensi
        int[][] matriks = {{1, 2}, {3, 4}};

        System.out.println("\n4). Array multidimensi dengan matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        // Perulangan while
        System.out.println("\n5). Perulangan while : ");
        int counter = 0;
        while (counter < 5) {
            System.out.println("Ini adalah perulangan while ke-" + (counter + 1));
            counter++;
        }

        // Perulangan do while
        System.out.println("\n6). Perulangan do while : ");
        int counter2 = 0;
        do {
            System.out.println("Ini adalah perulangan do while ke-" + (counter2 + 1));
            counter2++;
        } while (counter2 < 5);

        // Percabangan if
        System.out.println("\n7). Percabangan if : ");
        int x = 10;
        if (x > 5) {
            System.out.println("x lebih besar dari 5");
        } else {
            System.out.println("x kurang dari atau sama dengan 5");
        }
    }
}
