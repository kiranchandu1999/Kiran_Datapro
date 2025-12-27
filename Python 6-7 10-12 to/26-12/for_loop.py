# for loop : We know no of iterations (range() and sequences)
# print 'Hello World' 5 times

for i in range(5):  # range(stop) ==> not including stop value
    print("Hello World")

for i in range(5):
    print(i)

# print numbers from 11 to 15
for i in range(11, 16):   # range(start, stop)
    print(i)


# print even numbers from 1 to 20
for i in range(2, 21, 2):   # range(start, stop, step) 
    print("Even number:", i)


# Count down timer from 10 to 1
for i in range(10, 0, -1):
    print("Count down: ", i)


# print 5th table upto 10 multiples
num = 5
for i in range(1, 11):
    print(f"5 x {i} = {num*i}")


# print sum of first 10 natural numbers
sum = 0
for i in range(1, 11):
    sum = sum + i

print("Sum of first 10 natural numbers is:", sum)