# class
class BankAccount:
    # class variable common to all instances
    interest_rate = 5.0
    # constructor
    def __init__(self, name, balance):
        # instance variables
        self.holder_name = name
        self.balance = balance

    # instance methods used to process the instance variables data
    # method for depositing money
    def deposit(self, amount):
        # check amount validation
        if BankAccount.validate_amount(amount):
            self.balance += amount
            print(f"Amount {amount} deposited successfully, Balance: {self.balance}")
        else:
            print(f"Invalid amount to deposit!!! {amount}")

    # method to withdraw
    def withdraw(self, amount):
        # check amount validation
        if (amount < 0):
            print(f"Invalid amount to withdraw!!! {amount}")
        elif (amount <= self.balance):
            self.balance -= amount
            print(f"Amount {amount} withdrawn successfully, Balance: {self.balance}")
        else:
            print(f"Insufficient balance!!! {amount}")

    def show_data(self):
        print(f"Holder name: {self.holder_name}, Balance: {self.balance}")

    # class method used to manipulate class variables data
    @classmethod
    def change_interest_rate(cls, new_rate):
        cls.interest_rate = new_rate

    # static method is used to perform class utility operations/calculations
    @staticmethod
    def validate_amount(amount):
        if (amount > 0):
            return True
        else:
            return False


# objects creation
acc1 = BankAccount("John", 5000)
acc2 = BankAccount("Raju", 2000)

# deposit 2000 in each account
acc1.deposit(2000)
acc2.deposit(2000)

# checking balance after deposit
acc1.show_data() # 7000
acc2.show_data() # 4000

# withdraw 5000 from each account
acc1.withdraw(5000)
acc2.withdraw(5000)

# check balance after withdraw
acc1.show_data() # 2000
acc2.show_data() # 4000

# check interest rate before changing
print(BankAccount.interest_rate)

# change interest rate
BankAccount.change_interest_rate(6.5)

# check interest rate after change
print(BankAccount.interest_rate)
            