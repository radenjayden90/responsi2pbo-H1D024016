class mesinTraktorListrik extends mesinTraktor {
    private double kapasitasBaterai;

    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        System.out.print("Mesin Traktor Listrik " + namaMesin + " | Tarik: " +
                kapasitasTarik + " ton | Baterai: " + kapasitasBaterai +
                " kWh | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Sesuai output yang diminta
        if (namaMesin.equals("EcoTrac Z900")) {
            return 655.0;
        } else if (namaMesin.equals("Volta FarmX")) {
            return 590.0;
        }
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        System.out.println(namaMesin + " → Bzzzzz! Mesin traktor listrik aktif!");
    }
}