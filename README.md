# pengondisian
4sepx16

Penjelasan dan fungsi

Git Init: perintah untuk menginisialisasi repositori Git lokal baru dalam direktori proyek.
FUNGSI: - memulai proyek
        - membuat folder tersembunyi
        - mengubah nama cabang utama
        - mengaktifkan kontrol versi
        - menginisialisasi ulang

Git Status: perintah untuk menampilkan informasi mendetail mengenai kondisi direktori kerja (working tree) dan staging area.
FUNGSI: - Mengecek perubahan
        - Memantau Staging Area
        - Melihat File Baru
        - Mengetahui Branch Aktif

Git Commit: perintah untuk menyimpan perubahan (snapshot) file yang telah masuk staging area ke dalam repositori lokal, menciptakan titik revisi (checkpoint) permanen dalam sejarah proyek.
FUNGSI: - Menyimpan Versi
        - Melacak Riwayat (History)
        - Kolaborasi
        - Pencadangan (Backup)

Git Push origin main: perintah Git untuk mengirimkan komit (commit) lokal dari cabang main ke repositori jarak jauh (remote) bernama origin.
Penjelasan perintah:
PUSH :Perintah untuk mengunggah konten lokal ke repositori jarak jauh.
ORIGIN :Nama default untuk repositori jarak jauh (remote) utama.
MAIN :Nama cabang (branch) lokal yang akan diunggah ke main di remote.
FUNGSI: - Mengunggah Perubahan
        - Update Remote Branch
        - Kolaborasi

Git Add: perintah untuk memasukkan perubahan file dari direktori kerja (working directory) ke staging area (indeks).
FUNGSI: - Staging changes
        - Seleksi file
        - Mempersiapkan commit

Perintah yang sering di gunakan dalam penggunaan command line

1. PWD
2. LS
3. CD
4. TOUCH
5. CHMOD
6. CD ..
7. Perintah untuk menghapus apa? rm "nama file"
8. Perintah mengedit file
9. 
10. 

cheat sheet git

1. Reposting: Wadah atau folder proyek tempat Git menyimpan seluruh riwayat perubahan file. Ada dua jenis: local (di komputer kamu) dan remote (di server seperti GitHub).
FUNGSI: Menyimpan seluruh data, file, dan sejarah perkembangan proyek secara terorganisir.

2. commit: Semacam "save point" atau foto dari perubahan yang kamu lakukan pada saat tertentu. Setiap commit memiliki pesan yang menjelaskan apa yang diubah.
FUNGSI: Mengunci perubahan ke dalam riwayat proyek sehingga kamu bisa melacak siapa yang mengubah apa dan kapan.

3. hash: Deretan unik angka dan huruf (contoh: 4a8f1b...) yang dihasilkan secara otomatis untuk setiap commit.
FUNGSI: Sebagai ID unik untuk membedakan satu commit dengan commit lainnya, memastikan integritas data agar tidak bisa dimanipulasi tanpa ketahuan.

4. checkout: Proses berpindah antar versi atau antar branch (cabang).
FUNGSI: Digunakan untuk "berpindah waktu" ke commit lama atau berpindah ke cabang pengerjaan lain untuk melihat kondisi kode di sana.

5. branch: Saluran atau jalur kerja yang terpisah dari jalur utama (main/master).
FUNGSI: Memungkinkan kamu mencoba fitur baru atau memperbaiki bug tanpa merusak kode utama yang sudah stabil.

6. merge: Proses menggabungkan dua branch menjadi satu.
FUNGSI: Menyatukan kembali hasil pekerjaan dari cabang fitur ke cabang utama setelah fitur tersebut selesai dan dites.

7. remote: Versi proyek yang disimpan di server internet atau jaringan lain (seperti GitHub, GitLab, atau Bitbucket).
FUNGSI: Memungkinkan kolaborasi antar tim karena semua orang bisa mengakses sumber kode yang sama dari mana saja.

8. clone: Proses menyalin repository dari remote (server) ke komputer lokal kamu untuk pertama kalinya.
FUNGSI: Mendapatkan seluruh isi proyek beserta sejarahnya agar kamu bisa mulai bekerja di komputer sendiri.

9. pull: Mengambil perubahan terbaru dari remote repository dan langsung menggabungkannya (merge) ke kode lokal kamu.
FUNGSI: Memastikan kode di komputer kamu tetap up-to-date dengan perubahan yang dibuat oleh rekan tim lain.

10. push: Mengirimkan commit yang sudah kamu buat di komputer lokal ke remote repository.
FUNGSI: Berbagi hasil kerja kamu ke server agar bisa dilihat dan digunakan oleh orang lain dalam tim.