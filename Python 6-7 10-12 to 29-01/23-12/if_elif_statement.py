# print the grade based on marks
# Grade-A >= 90, Grade-B >= 80, Grade-C >= 70, Grade-D >= 50
marks = 60

if marks >= 90:
    print("Grade-A")
elif marks >= 80:
    print("Grade-B")
elif marks >= 70:
    print("Grade-C")
elif marks >= 50:
    print("Grade-D")
else:
    print("Fail")


# traffic signaling problem
signal = "yellow" # red or yellow or green

if signal == "red":
    print("Signal is red, Stop!")
elif signal == "yellow":
    print("Signal is yellow, Wait!")
elif signal == "green":
    print("Signal is Green, Go!")
else:
    print("Not a valid signal")