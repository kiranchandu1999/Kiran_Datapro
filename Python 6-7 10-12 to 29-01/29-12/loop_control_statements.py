# password checking
correct_password = "Python123"
max_attempts = 3
count = 1
while count <= max_attempts:
    password = input("Enter password:")
    if password == correct_password:
        print("Login success!")
        break
    count += 1
else:
    print("You reached max attempts, System locked!")

if 5 > 3:
    # I will write logic later
    pass


# print 1 to 10 numbers except 4 and 7
for i in range(1, 11):
    if i == 4 or i == 7:  # skip 4 and 7
        continue
    print(i)
    print("Hi")
    print("hello")