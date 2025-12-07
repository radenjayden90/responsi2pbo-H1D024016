public class PaymentTest {

    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===\n");

        // 1. Buat objek EWalletPayment
        EWalletPayment payment = new EWalletPayment("OVO", 50000.0, 150000.0);

        // 2. Menampilkan data sebelum transaksi
        System.out.println("Saldo awal: Rp " + (int)payment.getBalance());
        System.out.println("Detail pembayaran:");
        System.out.println(payment.getPaymentDetails());

        // 3. Memproses pembayaran
        System.out.println("\nMemproses pembayaran sebesar Rp " +
                (int)payment.getNominalPembayaran() + "...");
        String hasil = payment.processPayment();
        System.out.println(hasil);

        // 4. Menampilkan data setelah transaksi
        System.out.println("\n=== SETELAH TRANSAKSI ===");
        System.out.println("Sisa saldo: Rp " + (int)payment.getBalance());
        System.out.println("Detail Transaksi: Pembayaran dilakukan melalui " +
                payment.getNamaLayanan());

        // 5. Uji pembayaran dengan saldo tidak cukup
        System.out.println("\n=== UJI PEMBAYARAN DENGAN SALDO TIDAK CUKUP ===");
        EWalletPayment payment2 = new EWalletPayment("GoPay", 100000.0, 50000.0);
        System.out.println("Saldo: Rp " + (int)payment2.getBalance());
        System.out.println("Nominal bayar: Rp " + (int)payment2.getNominalPembayaran());
        System.out.println(payment2.processPayment());
    }
}