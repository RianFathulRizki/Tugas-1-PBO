#include <iostream>
using namespace std;

int main() {
    // Variabel
    int n;
    
    // Input
    cout<<"\n1). Input : "<<endl;
    cout << "Masukkan jumlah mahasiswa: ";
    cin >> n;

    double nilai[n];
    double total = 0;

    // Array satu dimensi
    cout<<"\n2).Array satu dimensi : "<<endl;
    for (int i = 0; i < n; i++) {
        cout << "Masukkan nilai mahasiswa ke-" << (i + 1) << ": ";
        cin >> nilai[i];
        total += nilai[i];
    }

    // Perhitungan rata-rata
    double rata_rata = total / n;

    // Output
    cout<<"\n3). Output"<<endl;
    cout << "Rata-rata nilai mahasiswa: " << rata_rata << endl;

    // Array multidimensi
    int matriks[2][2] = {{1, 2}, {3, 4}};
	
    cout << "\n4). Array multidimensi dengan matrix : ";

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cout << matriks[i][j] << " ";
        }
        cout << endl;
    }

    // Perulangan while
    cout<<"\n5). Perulangan while : "<<endl;
    int counter = 0;
    while (counter < 5) {
        cout << "Ini adalah perulangan while ke-" << (counter + 1) << endl;
        counter++;
    }

    // Perulangan do while
    cout<<"\n6). Perulangan do while : "<<endl;
    int counter2 = 0;
    do {
        cout << "Ini adalah perulangan do while ke-" << (counter2 + 1) << endl;
        counter2++;
    } while (counter2 < 5);

    // Percabangan if
    cout<<"\n7). Percabangan if : "<<endl;
    int x = 10;
    if (x > 5) {
        cout << "x lebih besar dari 5" << endl;
    } else {
        cout << "x kurang dari atau sama dengan 5" << endl;
    }

    return 0;
}
