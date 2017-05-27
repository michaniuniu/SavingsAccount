
public class Zad6 {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount();
		System.out.println("Stan konta wynosi: " + account.getSavingsAccount());
		System.out.println("Dodamy 50 pieniazkow do konta");
		account.inBalance(50);
		System.out.println("Stan konta wynosi: " + account.getSavingsAccount());
		System.out.println("Wydamy 30 pieniazkow do konta");
		account.outBalance(30);
		System.out.println("Stan konta wynosi: " + account.getSavingsAccount());
		System.out.println("Aktualne oprocentowanie wynosi: " + account.getAnnuallInterestRate());
		System.out.println("Zmienimy oprocentowanie na 1,2%");
		account.modifyInterestRate((float)1.2);
		System.out.println("Aktualne oprocentowanie wynosi: " + account.getAnnuallInterestRate() + "%");
		System.out.println("Stan konta przed oprocentowaniem wynosi: " + account.getSavingsAccount());
		account.calculateMonthlyInterest();
		System.out.println("Stan konta po obliczeniu oprocentowania wynosi: " + account.getSavingsAccount());
		
	}

}
