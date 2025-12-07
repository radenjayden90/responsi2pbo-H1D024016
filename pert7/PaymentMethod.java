public interface PaymentMethod {

    // Method abstract untuk memproses pembayaran
    String processPayment();

    // Method abstract untuk mendapatkan detail pembayaran
    String getPaymentDetails();

    // Method abstract untuk mendapatkan biaya transaksi
    double getTransactionFee();

    // Method abstract untuk mendapatkan saldo
    double getBalance();
}