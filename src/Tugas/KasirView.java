package Tugas;
public class KasirView {
    public void tampilkanInfoBarang(String nama, int harga, int stok) {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Stok Barang: " + stok);
    }

    public void tampilkanPembayaran(int totalHarga) {
        System.out.println("Jumlah Bayar: " + totalHarga);
    }
}
