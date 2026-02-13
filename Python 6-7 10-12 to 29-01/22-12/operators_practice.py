n1 = int(input("Enter number 1: "))
n2 = int(input("Enter number 2: "))

# print n1 + n2
print("Hello", "World", sep="---")
print(n1 + n2)

print("One", end=" ")
print("Two", end=" ")
print("Three")


# Formatted string (f-string)
# Addition of 5 and 3 is 8 
# Multiplication of 5 and 3 is 15
print(f"Addition of {n1} and {n2} is {n1 + n2}")
print(f"Multiplication of {n1} and {n2} is {n1 * n2}")