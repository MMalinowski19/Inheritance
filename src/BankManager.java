public class BankManager {
    public static void main(String[] args) {
    CertificateOfDeposit kontoCD = new CertificateOfDeposit();
    kontoCD.balance = 32;
    kontoCD.account = "Moje konto CD";
    kontoCD.expirity = 20220212;
    CheckingAccount kontoCA = new CheckingAccount();
    kontoCA.limit = 20000;
    kontoCA.account = "Moje konto CA";
    kontoCA.balance = 123;
    SavingsAccount kontoSA = new SavingsAccount();
    kontoSA.account = "Moje konto SA";
    kontoSA.balance = 12314;
    kontoSA.transfers = 1231234;


    }
}
