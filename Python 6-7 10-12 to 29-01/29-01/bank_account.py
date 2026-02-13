# importing functionality from other module
# import module_name (importing complete module)
import bank_utils
# from bank_utils import INT_RATE

# from module_name import functionality (importing specific functionality)
# from bank_utils import calculate_interest

# creating new bank account
def create_account(name, balance):
    # logic for creating bank account
    print(f"Account created for {name} with balance {balance}")


# logic for printing bank statements
def print_statement(acc_no):
    print(f"Account statement getting printed for account no: {acc_no}")


create_account("kiran", 1000)
print_statement("1234567890")

# want to calculate interest for 5000
bank_utils.calculate_interest(5000)