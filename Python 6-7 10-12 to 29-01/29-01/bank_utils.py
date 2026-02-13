INT_RATE = 6.5

# logic for calculating interest
def calculate_interest(amount):
    interest_amount = amount * INT_RATE/100
    print(f"Calculated interest: {interest_amount}")

# logic for validating account no
def validate_account(accNo):
    if len(accNo) == 10:
        print("Valid account number")
    else:
        print("Invalid account number")