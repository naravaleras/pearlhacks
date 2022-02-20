import package1.User;
public class Transaction extends User {
    //Account Balance Transactions
    public void addFunds(Double amount){
        setAccBalance(getAccBalance() + amount);
    }
    public void subFunds(Double amount){
        setAccBalance(getAccBalance()-amount);
    }
    public double viewBalance(){
        return getAccBalance();
    }

    //Charity Balance Transactions
    public void addCharFunds(Double amount){
        setCharBalance(getCharBalance() + amount);
    }
    //Cash Out Methods
    public void cashOutAccount(Double amount){
        if(getAccBalance() >= amount){
            setAccBalance(getAccBalance() - amount);
        } else {
            //Replace with android message
            System.out.println("Insufficient funds");
        }
    }
    public void cashOutCharityAccount(Double amount){
        if(getCharBalance() >= amount){
            setCharBalance(getCharBalance() - amount);
        } else {
            // Replace with android message
            System.out.println("Insufficient funds");
        }
    }
}
