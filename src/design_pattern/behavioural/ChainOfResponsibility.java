package design_pattern.behavioural;

public class ChainOfResponsibility {
	public static void main(String[] args) {
		
		ExpenseRequest request = new ExpenseRequest(8000);
		
		Approver manager= new Manager();
		Approver vp= new VP();
		Approver director= new Director();
		
		manager.setNext(vp);
		vp.setNext(director);
		
		manager.setApprover(request);
	
	}
}

class ExpenseRequest {
	int amount;
	
	ExpenseRequest(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
}

interface Approver {
	void setApprover(ExpenseRequest request);
	
	void setNext(Approver next);
}

class Manager implements Approver {
	Approver next;
	
	@Override
	public void setNext(Approver next) {
		this.next = next;
	}
	
	@Override
	public void setApprover(ExpenseRequest request) {
		if (request.getAmount() <= 5000) {
			System.out.println("Manager Approved");
		} else {
			next.setApprover(request);
		}
	}
}

class VP implements Approver {
	Approver next;
	
	@Override
	public void setNext(Approver next) {
		this.next = next;
	}
	
	@Override
	public void setApprover(ExpenseRequest request) {
		if (request.getAmount() <= 10000) {
			System.out.println("VP Approved");
		} else {
			next.setApprover(request);
		}
	}
}

class Director implements Approver {
	Approver next;
	
	@Override
	public void setNext(Approver next) {
		this.next = next;
	}
	
	@Override
	public void setApprover(ExpenseRequest request) {
		if (request.getAmount() <= 20000) {
			System.out.println("Director Approved");
		} else {
			System.out.println("Request Rejected");
		}
	}
}