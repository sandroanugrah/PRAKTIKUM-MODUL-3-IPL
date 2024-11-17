package Latihan;

public class DemoPolaMVC {
    public static void main(String[] args) {
        Mahasiswa model = ambilMahasiswaDariDatabase();
        MahasiswaView view = new MahasiswaView();
        MahasiswaController controller = new MahasiswaController(model, view);

        controller.perbaruiTampilan();
        controller.setNamaMahasiswa("John");
        controller.perbaruiTampilan();
    }

    private static Mahasiswa ambilMahasiswaDariDatabase() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Robert");
        mahasiswa.setNomorInduk("10");
        return mahasiswa;
    }
}

