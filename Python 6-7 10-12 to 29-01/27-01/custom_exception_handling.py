# raise keyword is used to throw exception manually
# Custom exception
class InsufficientBalanceError(Exception):
    def __init__(self, balance, amount):
        super().__init__(f"You are requested: {amount}, but your balance is: {balance}")

def withdraw(balance, amount):
    if (balance > amount):
        print("Amount withdrawl successful..")
    else:
        raise InsufficientBalanceError(balance, amount)

try:
    withdraw(1000, 1200)
except Exception as e:
    print(f"{e}")

print("Program end")