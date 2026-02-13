# print weekday name
day = 3

if day == 1:
    print("Sunday!!")
elif day == 2:
    print("Monday!!")
elif day == 3:
    print("Tuesday!!")
elif day == 4:
    print("Wednesday!!")
elif day == 5:
    print("Thursday!!")
else:
    print("Weekend!!")


# above example using match case
# we can use match case instead of if elif ladder for fixed values
match day:
    case 1:
        print("Sunday!!")
    case 2:
        print("Monday!!")
    case 3:
        print("Tuesday!!")
    case 4:
        print("Wednesday!!")
    case 5:
        print("Thursday!!")
    case _:
        print("Weekend!!")
