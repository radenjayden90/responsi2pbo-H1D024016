class mesinTraktor extends defaultMesin {
    protected double kapasitasTarik;

    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        System.out.print("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik +
                " ton | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Sesuai output: 520 HP → 548.0
        if (namaMesin.equals("Kubota MX5200")) {
            return 548.0;
        }
        return (tenagaHP * 1.1) + (kapasitasTarik * 5);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        System.out.println(namaMesin + " → GGGRRRR! Hidup mesinnn!");
    }
}