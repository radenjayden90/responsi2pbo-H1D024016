public class UjiGalaksi {
    public static void main(String[] args) {
        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===\n");

        // PEMBUATAN OBJEK
        System.out.println("--- PESAWAT TEMPUR ---");
        PesawatTempur pesawat = new PesawatTempur("Astra-Fury", 2, 8);

        // Aktifkan mesin pesawat
        pesawat.aktifkanMesin();

        // Pesawat menjelajah 10 km
        pesawat.jelajah(10);

        // Pesawat mencoba menjelajah 30 km lagi
        pesawat.jelajah(30);

        // Pesawat menembak 3 rudal
        pesawat.tembakRudal(3);

        // Tampilkan status pesawat
        pesawat.tampilStatus();

        System.out.println("\n--- KAPAL EKSPLORASI ---");
        KapalEksplorasi kapal = new KapalEksplorasi("Voyager X", 10, 4);

        // Aktifkan mesin kapal eksplorasi
        kapal.aktifkanMesin();

        // Kapal menjelajah 15 km
        kapal.jelajah(15);

        // Kapal melakukan scanPlanet("Kepler-442b")
        kapal.scanPlanet("Kepler-442b");

        // Tampilkan status kapal
        kapal.tampilStatus();

        // DEMONSTRASI POLIMORFISME
        System.out.println("\n=== DEMONSTRASI POLIMORFISME ===");

        KendaraanGalaksi[] armada = new KendaraanGalaksi[2];
        armada[0] = pesawat;
        armada[1] = kapal;

        for (KendaraanGalaksi kendaraan : armada) {
            kendaraan.tampilStatus();
            kendaraan.aktifkanMesin();
            System.out.println();
        }
    }
}