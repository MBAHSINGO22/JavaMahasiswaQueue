package PERTEMUAN8;

// Kelas Mahasiswa digunakan untuk merepresentasikan objek mahasiswa.
public class Mahasiswa {
    // Atribut private untuk menyimpan informasi mahasiswa.
    private String nama; // Nama mahasiswa.
    private String nim; // Nomor Induk Mahasiswa (NIM).
    private String prodi; // Program Studi (Prodi) yang diambil oleh mahasiswa.
    private String alamat; // Alamat tempat tinggal mahasiswa.

    // Konstruktor Mahasiswa digunakan untuk membuat objek Mahasiswa baru dengan parameter nama, nim, prodi, dan alamat.
    public Mahasiswa(String nama, String nim, String prodi, String alamat) {
        // Menginisialisasi atribut objek Mahasiswa dengan nilai yang diberikan melalui parameter konstruktor.
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    // Getter untuk mendapatkan nilai atribut nama.
    public String getNama() {
        return nama;
    }

    // Setter untuk mengatur nilai atribut nama.
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mendapatkan nilai atribut nim.
    public String getNim() {
        return nim;
    }

    // Setter untuk mengatur nilai atribut nim.
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter untuk mendapatkan nilai atribut prodi.
    public String getProdi() {
        return prodi;
    }

    // Setter untuk mengatur nilai atribut prodi.
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Getter untuk mendapatkan nilai atribut alamat.
    public String getAlamat() {
        return alamat;
    }

    // Setter untuk mengatur nilai atribut alamat.
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Metode toString digunakan untuk mengembalikan representasi string dari objek Mahasiswa.
    public String toString() {
        // Membuat string yang mencakup semua atribut objek Mahasiswa.
        return "Mahasiswa(" +
                "Nama = " + nama +  
                ", NIM = " + nim + 
                ", Prodi = " + prodi +
                ", Alamat = " + alamat + 
                ')';
    }
}


























