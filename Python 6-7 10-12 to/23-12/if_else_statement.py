# Login functionality
stored_password = "data@123"
input_password = input("Enter password:")

if input_password == stored_password:
    print("Login successful!")
else:
    print("Login failed!!!")

# Even or Odd functionality
num = int(input("Enter number: "))

if num % 2 == 0:
    print(f"Given number {num} is Even!")
else:
    print(f"Given number {num} is Odd!")