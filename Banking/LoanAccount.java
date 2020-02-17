public class LoanAccount extends Account implements ILoan{
	private String name;
	private String ac_no;
	LoanAccount(Account a){
		this.name=a.getName();
		this.ac_no=a.getAcNo();
	}
	@Override
	public void showLoanDetails() {
		System.out.println("Loan A/c Details:");
		System.out.println("Name: " + name);
		System.out.println("A/c No: " + ac_no);
	}
}