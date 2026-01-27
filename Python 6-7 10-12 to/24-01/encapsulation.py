# Encapsulation -> Binding individual attributes and methods into a single unit and protecting their access from outside the class
# We have three access access modifiers (private(with double underscore), protected(with single underscore) and public)
class BankAccount:
    def __init__(self, balance):
        self.__balance = balance # private attribute
        self._acc_type = "savings" # protected attribute

    def deposit(self, amount):
        self.__balance += amount
        print(f"Amount {amount} deposited successfully!!")

    def withdraw(self, amount):
        self.__balance -= amount
        print(f"Amount {amount} withdrawn successfully!!")

    # method for checking balance
    def get_balance(self):
        return self.__balance

    
acc1 = BankAccount(500)

# private attributes access not possible
# acc1.__balance = 5000 # modify balance of acc1
# print(acc1.__balance) # check balance

acc1.deposit(1000)
print(acc1.get_balance())

print(acc1._acc_type)