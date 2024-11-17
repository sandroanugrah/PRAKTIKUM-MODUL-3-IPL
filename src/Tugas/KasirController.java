package Tugas;
import java.util.Scanner;

public class KasirController {
    private Barang model;
    private KasirView view;

    public KasirController(Barang model, KasirView view) {
        this.model = model;
        this.view = view;
    }

    public void tampilkanInfoBarang() {
        view.tampilkanInfoBarang(model.getNama(), model.getHarga(), model.getStok());
    }

    public void prosesPembelian() {
        Scanner input = new Scanner(System.in);
        System.out.println("Transaksi Pembelian");
        System.out.print("Jumlah barang: ");
        int qty = input.nextInt();

        if (qty <= model.getStok()) {
            model.setStok(model.getStok() - qty);
            int totalHarga = qty * model.getHarga();
            view.tampilkanPembayaran(totalHarga);
            tampilkanInfoBarang();
        } else {
            System.out.println("Stok tidak cukup.");
        }
    }
}
