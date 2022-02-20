package package1;

public class User{
    private String firstName;
    private String lastName;
    private Double accBalance;
    private Double charBalance;
    private String accAddress;
    private String outgoingAddress;

    // Getter and setter for name
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String userFirstName){
        this.firstName = userFirstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String userLastName){
        this.lastName = userLastName;
    }

    // Getter and setter for Account balance
    public Double getAccBalance(){
        return this.accBalance;
    }
    public void setAccBalance(Double userBalance){
        this.accBalance = userBalance;
    }

    // Getter and setter for Charity balance
    public Double getCharBalance(){
        return this.charBalance;
    }
    public void setCharBalance(Double userBalance){
        this.charBalance = userBalance;
    }

    //Getter and setter for Addresses
    public String getAccAddress(){
        return this.accAddress;
    }
    public void setAccAddress(String address){
        this.accAddress = address;
    }
    public String getOutgoingAddress(){
        return this.outgoingAddress;
    }
    public void setOutgoingAddress(String address){
        this.outgoingAddress = address;
    }
}
