# Money withdraw from ATM
pin_entered = False
balance = 1000
withdraw_amount = 1500

if pin_entered:
    print("PIN entered")
    if withdraw_amount <= balance:
        print("Money debited from your account, Thank you!")
    else:
        print("Insufficient Balance")
else:
    print("PIN not entered")



# Loan eligibility based on age, salary, credit score
age = 25
salary = 2000
credit_score = 800

if age >= 18:
    print("Your age is eligible for loan")
    if salary >= 1000:
        print("Salary criteria matched!")
        if credit_score >= 850:
            print("Credit score is excellent so eligible for instant loan")
        elif credit_score >= 600:
            print("Credit score is average so documents required")
        else:
            print("Credit score is low so not eligible for loan")
    else:
        print("Salary not sufficient to apply loan")
else:
    print("Age not eligible")


# nested match case
# Order status update
payment_done = False
order_status = "SHIPPED"  # PLACED, SHIPPED, DELIVERED

if payment_done:
    print("Payment done!")
    match order_status:
        case "PLACED":
            print("Order is placed!")
        case "SHIPPED":
            print("Order is shipped!")
        case "DELIVERED":
            print("Order is Delivered!")
        case _:
            print("Invalid order status!!!")
else:
    print("Payment pending!!")

