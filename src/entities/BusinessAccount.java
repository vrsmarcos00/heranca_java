package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimmit) {
		super(number, holder, balance);
		this.loanLimit = loanLimmit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan (Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10;
		}
	}
	
	
	
	
	
}
