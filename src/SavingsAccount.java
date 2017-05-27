
public class SavingsAccount {
		
		private float savingsBalance;
		private static float annuallInterestRate = 0;
		
		public SavingsAccount(){
			savingsBalance = 0;
		}
		
		public float getSavingsAccount(){
			return savingsBalance;
		}
		public void inBalance(float transact){
			savingsBalance = savingsBalance + transact;
		}
		
		public void outBalance(float transact){
			savingsBalance = savingsBalance - transact;
		}
		
		public void modifyInterestRate(float newValue){
			annuallInterestRate = newValue;
		}
		
		public float getAnnuallInterestRate(){
			return  annuallInterestRate;
		}
		
		public void calculateMonthlyInterest(){
			savingsBalance = (savingsBalance + (((annuallInterestRate/100) * savingsBalance) / 12));
		}
		
		
}
