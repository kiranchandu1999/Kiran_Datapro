# Function: It's a block of code to perform single task

# make a function to print "Hello World!"
def print_hello():
    print("Hello World!")
    print("Welcome to Python!")
    print("Happy learning!")

# function calling
print("Function called")
print_hello()
print("Calling function")

# Execution flow
# Defining function
# Reading function definition and storing in memory
# Function calling
# Whole function body executed
# Back to calling position and executing remaining code

# Doc strings
def greet():
    """
    This is function to greet  Datapro
    """
    # below is printing statement
    print("Hello Datapro!")

# function_name.__doc__
print(greet.__doc__)
greet()
a = greet()
print(a)
# printing the print function's docstring
print(print.__doc__)


# function with return statement
def get_sum():
    print("Calculating sum...")
    return 5 + 8

print("Before calling get_sum")
res = get_sum()
print("Result is", res)
print("Result is", get_sum())
print("After calling get_sum")