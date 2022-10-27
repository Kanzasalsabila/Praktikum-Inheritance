
package PraktikumInheritance;

public class SavingAccount extends Account {
    private double interestRate;
    
    public SavingAccount(double balance, double interstRate){
        super(balance);
        this.interestRate = interstRate;
    }
}
