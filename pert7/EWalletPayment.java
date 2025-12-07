public class EWalletPayment implements PaymentMethod {

    // Atribut yang diperlukan
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldoPengguna;
    private static final double BIAYA_TRANSAKSI = 2000.0;

    // Constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldoPengguna) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldoPengguna = saldoPengguna;
    }

    // Implementasi method processPayment()
    @Override
    public String processPayment() {
        double total = nominalPembayaran + BIAYA_TRANSAKSI;
        if (saldoPengguna >= total) {
            saldoPengguna -= total;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    // Implementasi method getPaymentDetails()
    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan +
                "\nNominal: Rp " + nominalPembayaran +
                "\nBiaya transaksi: Rp " + BIAYA_TRANSAKSI;
    }

    // Implementasi method getTransactionFee()
    @Override
    public double getTransactionFee() {
        return BIAYA_TRANSAKSI;
    }

    // Implementasi method getBalance()
    @Override
    public double getBalance() {
        return saldoPengguna;
    }

    // Getter untuk atribut lainnya (optional)
    public String getNamaLayanan() {
        return namaLayanan;
    }

    public double getNominalPembayaran() {
        return nominalPembayaran;
    }
}