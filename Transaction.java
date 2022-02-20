import package1.User;
public class Transaction extends User {
    //Account Balance Transactions
    public void addFunds(Double amount){
        setAccBalance(getAccBalance() + amount);
    }
    public void subFunds(Double amount){
        setCharBalance(getCharBalance() + 0.10);
        setAccBalance(getAccBalance()-amount);
    }
    public double viewBalance(){
        return getAccBalance();
    }
    public double viewCharBalance(){
        return getCharBalance();
    }

    //Charity Balance Transactions
    public void addCharFunds(Double amount){
        setCharBalance(getCharBalance() + amount);
    }

    //Cash Out Methods
    public void cashOutAccount(Double amount){
        if(getAccBalance() >= (amount * 1.1)){
            setAccBalance(getAccBalance() - (amount * 1.1));
            setCharBalance(getCharBalance() + (amount * 0.1));
            //Route amount to target account
        } else {
            //Replace with android message
            System.out.println("Insufficient funds");
        }
    }
    public void cashOutCharityAccount(Double amount){
        if(getCharBalance() >= amount){
            setCharBalance(getCharBalance() - amount);
            //Route amount to charity
        } else {
            // Replace with android message
            System.out.println("Insufficient funds");
        }
    }
}
