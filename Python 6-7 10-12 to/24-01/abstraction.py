# Abstraction --> Hiding the method implementation details and provides standard structure to all child classes
# For abstraction need to inherit ABC class and use @abstractmethod for methods

from abc import ABC, abstractmethod

class Payment(ABC):
    # abstract method (method without any implementation)
    @abstractmethod
    def pay(self, amount):
        pass

class UPIPayment(Payment):
    # method overriding
    def pay(self, amount):
        print(f"Paid {amount} using UPI")

class CardPayment(Payment):
    # method overriding
    def pay(self, amount):
        print(f"Paid {amount} using credit card..")

# Adding new payment mode
class NetBankingPayment(Payment):
    def pay(self, amount):
        print(f"Amount paid {amount} using net banking...")


u1 = UPIPayment()
# u1.pay(500) # paying amount using UPI

c1 = CardPayment()
# c1.pay(500) # paying amount using Card

# function to process payemnt with selected payment mode
def process_payment(payment_mode, amount):
    # paying amount using selected payment mode
    payment_mode.pay(amount)


process_payment(UPIPayment(), 1000) # paying amount using UPI
process_payment(CardPayment(), 800) # paying amount using Card
process_payment(NetBankingPayment(), 1500) # paying amount using Card
