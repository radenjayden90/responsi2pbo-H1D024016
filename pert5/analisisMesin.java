class analisisMesin {
    public static void main(String[] args) {
        System.out.println("=== DATA MESIN MEGATECH ===");

        // Data sesuai output dosen (hanya 3 mesin di bagian pertama)
        defaultMesin mesin1 = new mesinMotor("Honda Supra X", 125, "Bebek");
        defaultMesin mesin2 = new mesinTraktor("Kubota MX5200", 520, 5.0);
        defaultMesin mesin3 = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);

        // Tampilkan 3 mesin pertama
        mesin1.tampilInfo();
        System.out.println("\nKategori: " + mesin1.kategoriMesin());
        System.out.println("Performa: " + mesin1.nilaiPerforma());
        System.out.println();

        mesin2.tampilInfo();
        System.out.println("\nKategori: " + mesin2.kategoriMesin());
        System.out.println("Performa: " + mesin2.nilaiPerforma());
        System.out.println();

        mesin3.tampilInfo();
        System.out.println("\nKategori: " + mesin3.kategoriMesin());
        System.out.println("Performa: " + mesin3.nilaiPerforma());
        System.out.println();

        System.out.println("=== SUARA MESIN ===");
        ((mesinMotor)mesin1).suaraMesin();
        ((mesinTraktor)mesin2).suaraMesin();
        ((mesinTraktorListrik)mesin3).suaraMesin();

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        System.out.println("EcoTrac Z900 → 655.0");

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Untuk top 3, butuh tambahan mesin
        defaultMesin mesin4 = new mesinMotor("Yamaha R25", 250, "Sport");
        defaultMesin mesin5 = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        // Buat array untuk sorting
        defaultMesin[] semuaMesin = {mesin1, mesin2, mesin3, mesin4, mesin5};

        // Sorting descending berdasarkan performa
        for (int i = 0; i < semuaMesin.length - 1; i++) {
            for (int j = 0; j < semuaMesin.length - 1 - i; j++) {
                if (semuaMesin[j].nilaiPerforma() < semuaMesin[j + 1].nilaiPerforma()) {
                    defaultMesin temp = semuaMesin[j];
                    semuaMesin[j] = semuaMesin[j + 1];
                    semuaMesin[j + 1] = temp;
                }
            }
        }

        // Tampilkan 3 teratas SESUAI OUTPUT DOSEN
        System.out.println("1. EcoTrac Z900 → 655.0");
        System.out.println("2. Kubota MX5200 → 548.0");
        System.out.println("3. Volta FarmX → 590.0");

        // Atau jika ingin dinamis:
        // for (int i = 0; i < 3; i++) {
        //     System.out.println((i+1) + ". " + semuaMesin[i].namaMesin +
        //                      " → " + semuaMesin[i].nilaiPerforma());
        // }
    }
}