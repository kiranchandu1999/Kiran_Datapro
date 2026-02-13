# def function_name(parameters):
    # function body

# function calling
# function_name(arguments)

# Parameters --> Variables defined in function definition / function signature
# Arguments ---> Values passed during function calling

# Types of Arguments
#  Positional arguments --> values passed based on their order
# create function to calculate sum of 2 numbers
def add(n1, n2):
    print(f"Sum is: {n1 + n2}")

add(5, 8)
add(15, 3)

# Keyword arguments --> values passed based on parameter names
# create a function to book a train ticket
def book_ticket(src, dest, seat_type):
    print(f"Ticket booked from {src} to {dest} of seat type: {seat_type}")

book_ticket("Vizag", "Hyd", "Lower")
book_ticket(seat_type="Upper", dest="Hyd", src="Vizag")
# book_ticket("Kakinada", "Guntur") # ERROR: seat_type required

# Default arguments --> default values defined in function signature
# default arguments must be defined after any positional argument
def book_ticket_default(src, dest, seat_type="Middle"):
    print(f"Ticket booked from {src} to {dest} of seat type: {seat_type}")

book_ticket_default("Vizianagaram", "Guntur")


# Variable length arguments
# *args and **kwargs
# create function to add any number of values
def calculate_sum(*nums):
    total = 0
    for x in nums:
        total = total + x
    print(f"Sum is: {total}")

calculate_sum(10) # passing single argument
calculate_sum(5, 10, 15) # passing multiple arguments