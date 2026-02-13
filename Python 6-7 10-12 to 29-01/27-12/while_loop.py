# while loop ==> it executes block of code until the condtions gets false
# syntax:
# while condition:
#     block of code

# print numbers from 1 to 5
i = 1

while i <= 5:
    print(i)  # execution statements
    i += 1  # updation


# run while loop until given number not equal to 0
num = int(input("Enter number:"))

while num != 0:
    print(f"You entered: {num}")
    # again taking the input from user
    num = int(input("Enter number:"))



# reverse the given number (Ex: 568 -->  865)
input_num = int(input("Enter the numnber to reverse:"))
res = 0
digit = 0

while input_num != 0:
    # extracting reminder (last digit)
    digit = input_num % 10
    res = (res * 10) + digit
    input_num = input_num // 10


print("Reversed numbers is", res)