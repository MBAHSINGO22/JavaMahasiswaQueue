package PERTEMUAN8;

public class Main {
    public static void main(String[] args) {
        // Membuat Queue dengan kapasitas 5.
        Queue staticQueue = new Queue(6);

        // Menambahkan beberapa objek Mahasiswa ke antrian menggunakan metode enqueue.
        staticQueue.enqueue(new Mahasiswa("Eugenius Kriswimar Adi Cahya", "235314099", "Teknik Informatika", "Klaten"));
        staticQueue.enqueue(new Mahasiswa("Nicho Herjuna", "235314098", "Psikologi", "Gunung Kidul"));
        staticQueue.enqueue(new Mahasiswa("Fransisco Chris Nugraha", "235314097", "Farmasi", "Gunung Kidul"));
        staticQueue.enqueue(new Mahasiswa("Coki Pardede", "235314096", "Teknik Mesin", "Banyuwangi"));
        staticQueue.enqueue(new Mahasiswa("Galih Pradana", "235314095", "Teknik Elektro", "Ambon"));

        // Menghapus tiga elemen dari awal antrian menggunakan metode dequeue.
        staticQueue.dequeue();
        staticQueue.dequeue();
        staticQueue.dequeue();

        // Menampilkan elemen-elemen yang tersisa dalam antrian menggunakan metode display.
        staticQueue.display();
    }
}
