package PERTEMUAN8;

// Kelas Queue digunakan untuk merepresentasikan struktur data antrian (queue) yang menggunakan array.
public class Queue {
    // Atribut untuk menyimpan elemen-elemen dalam antrian.
    private Mahasiswa[] queue; // Array untuk menyimpan objek Mahasiswa.
    private int front; // Indeks depan antrian.
    private int rear; // Indeks belakang antrian.
    private int size; // Ukuran antrian saat ini.

    // Konstruktor Queue digunakan untuk membuat antrian dengan ukuran tertentu.
    public Queue(int ukuran) {
        // Inisialisasi array queue dengan ukuran yang ditentukan.
        queue = new Mahasiswa[ukuran];
        // Inisialisasi front dan rear ke -1, menandakan antrian kosong.
        front = -1;
        rear = -1;
        // Inisialisasi ukuran antrian ke 0.
        size = 0;
    }

    // Metode isEmpty digunakan untuk memeriksa apakah antrian kosong.
    public boolean isEmpty() {
        // Jika front sama dengan -1, berarti antrian kosong.
        return front == -1;
    }

    // Metode isFull digunakan untuk memeriksa apakah antrian penuh.
    public boolean isFull() {
        // Jika ukuran antrian sama dengan panjang array, berarti antrian penuh.
        return size == queue.length;
    }

    // Metode enqueue digunakan untuk menambahkan elemen ke akhir antrian.
    public void enqueue(Mahasiswa mahasiswa) {
        // Jika antrian penuh, cetak pesan dan kembali.
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        // Jika antrian kosong, atur front ke 0.
        if (isEmpty()) {
            front = 0;
        }
        // Atur rear ke posisi berikutnya.
        rear = (rear + 1) % queue.length;
        // Tambahkan mahasiswa ke posisi rear.
        queue[rear] = mahasiswa;
        // Tambahkan ukuran antrian.
        size++;
    }

    // Metode dequeue digunakan untuk menghapus elemen dari awal antrian.
    public Mahasiswa dequeue() {
        // Jika antrian kosong, cetak pesan dan kembali dengan null.
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        // Simpan mahasiswa yang akan dihapus.
        Mahasiswa removedMahasiswa = queue[front];
        // Jika front sama dengan rear, reset front dan rear ke -1.
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Atur front ke posisi berikutnya dalam siklus array.
            front = (front + 1) % queue.length;
        }
        // Kurangi ukuran antrian.
        size--;
        // Kembalikan mahasiswa yang dihapus.
        return removedMahasiswa;
    }

    // Metode display digunakan untuk menampilkan elemen-elemen dalam antrian.
    public void display() {
        // Jika antrian kosong, cetak pesan dan kembali.
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        // Iterasi dari front ke rear, menampilkan setiap elemen.
        for (int i = front; i!= rear; i = (i + 1) % queue.length) {
            System.out.println(queue[i]);
        }
        // Tampilkan elemen terakhir (rear).
        System.out.println(queue[rear]);
    }
}
