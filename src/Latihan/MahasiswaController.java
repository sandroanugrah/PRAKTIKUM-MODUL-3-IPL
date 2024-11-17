package Latihan;

public class MahasiswaController {
    private Mahasiswa model;
    private MahasiswaView view;

    public MahasiswaController(Mahasiswa model, MahasiswaView view) {
        this.model = model;
        this.view = view;
    }
    public void setNamaMahasiswa(String nama) {
        model.setNama(nama);
    }
    public String getNamaMahasiswa() {
        return model.getNama();
    }
    public void setNomorIndukMahasiswa(String nomorInduk) {
        model.setNomorInduk(nomorInduk);
    }
    public String getNomorIndukMahasiswa() {
        return model.getNomorInduk();
    }
    public void perbaruiTampilan() {
        view.cetakDetailMahasiswa(model.getNama(), model.getNomorInduk());
    }
}
