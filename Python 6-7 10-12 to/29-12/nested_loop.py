# printing table

for num in range(2, 6):
    for i in range(1, 6):
        print(f"{num} x {i} = {num*i}")
    print("----------")


# Digital clock
for h in range(5, 8):
    for m in range(0, 60):
        if m % 15 == 0:
            print(f"Time is {h:02d}hours:{m:02d}minutes")


# pattern printing
'''
*
* *
* * *
'''

for r in range(3):
    for i in range(r+1):
        print("*", end=" ")
    print()


'''
* * * *
*     *
*     *
* * * *
'''