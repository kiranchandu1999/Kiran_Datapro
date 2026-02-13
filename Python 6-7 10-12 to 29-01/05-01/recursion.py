# Calculate the sum of N natural numbers
# Ex: n=3, ans=3+2+1=6
def calculate(n):
    # base condition
    if n == 1 or n == 0:
        return n
    return n + calculate(n-1)


# find sum of first 5 numbers
res = calculate(5)
print(res)


# find factorial of N
# Ex: n=3, ans = 3*2*1 = 6

def factorial(n):
    # base condition
    if n == 1:
        return 1
    return n*factorial(n-1)

print(factorial(5))