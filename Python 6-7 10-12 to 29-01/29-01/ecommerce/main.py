# importing modules from different packages
# import package_name.module_name
# or
# from package_name.module_name import functionality

from users import register_user
from users import login_user
from orders import create_order
from payments.card import pay_with_card

def start_app():
    print("Application started!!")

start_app()

# register user
register_user("kiran", "1234")
register_user("ram", "9874")
# login user
login_user("ram", "9874")
# place order
create_order("Lenovo thinkpad 5")
# card payment
pay_with_card(5000)
