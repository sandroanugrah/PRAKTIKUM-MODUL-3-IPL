package Tugas;
public class Kasir {
    public static void main(String[] args) {
        Barang model = ambilBarangDariDatabase();
        KasirView view = new KasirView();
        KasirController controller = new KasirController(model, view);

        controller.tampilkanInfoBarang();
        controller.prosesPembelian();
    }

    private static Barang ambilBarangDariDatabase() {
        Barang barang = new Barang();
        barang.setNama("GeForce GTX 1060Ti");
        barang.setHarga(3000);
        barang.setStok(10);
        return barang;
    }
}
