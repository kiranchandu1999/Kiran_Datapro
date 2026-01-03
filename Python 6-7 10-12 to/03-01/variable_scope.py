# Variable searching follows LEGB - L(Local) E(Enclosing) G(Global) B(Built in)

x = 1 # Global variable

def func1():
    x = 5 # Local variable
    print(f"x value inside func1: {x}") # 5

func1()
print(f"x value outside function: {x}") # 1

# -----------------------
# Update global variable inside function
def update_global():
    global x # informing python interpreter like I'm going to update global variable x
    x = x + 2
    print(f"x valu after update inside fun: {x}") # 3

print(f"x value before update fun: {x}") # 1
update_global()
print(f"x value after update fun: {x}") # 3


# ----------------
# Update global and enclosing variable
def outer():
    a = 10 # enclosing variable
    print(f"a value inside outer: {a}") # 10
    def inner():
        b = 15 # local variable
        nonlocal a
        a = a + 5
        print(f"a value after update inside inner: {a}") # 15

    inner()
    print(f"a value after update inside outer: {a}") # 15

outer()
