# polymorphism --> (many forms)
# It is a mechanism which allows multiple methods with same name, executes different methods based calling object

class Payment:
    def pay(self, amount):
        print(f"Amount paid: {amount}")

class UPIPayment(Payment):
    # method overriding (runtime polymorphism)
    def pay(self, amount):
        print(f"Amount paid using UPI: {amount}")

    def pay2(self):
        print("Dummy payment")

class CardPayment(Payment):
    # method overriding (runtime polymorphism)
    def pay(self, amount):
        print(f"Amount paid using card: {amount}")


p1 = Payment()
p1.pay(1000)

u1 = UPIPayment()
u1.pay(500)

c1 = CardPayment()
c1.pay(1500)
