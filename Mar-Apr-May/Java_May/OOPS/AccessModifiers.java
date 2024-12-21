package OOPS;

class Bank{
    String name;
    int amount;

    @Override
    public String toString() {
        return "Bank [name=" + name + ", amount=" + amount + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + amount;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bank other = (Bank) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (amount != other.amount)
            return false;
        return true;
    }

    Object getObject(){
        return this;
    }

    // setters and getters
    // public void setAmount (int value) {
    //     this.amount = value;
    // }

    // public int getAmount () {
    //     return this.amount;
    // }

    
}

public class AccessModifiers {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        b1.name = "SBI";
        b1.amount = 1000;

        b2.name = "SBI";
        b2.amount = 1000;
        // b1.setAmount(1000);
        int amt = b1.amount;
        // int amt = b1.getAmount();
        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b1.equals(b2));
    }
}
