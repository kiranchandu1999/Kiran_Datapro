# Iteration over strings
s1 = "datapro"
vowels = "aeiou"
# print vowels in s1
for ch in s1:
    # condition to check vowels (a,e,i,o,u)
    # if (ch=='a' or ch=='e' or ch=='i' or ch=='o' or ch=='u'):
    #     print(ch)
    if ch in vowels:
        print(ch)


# String methods
# validate the entered username
stored_username = "PYTHON"
# username = input("Enter username: ")
# lower() --> convert into lower case
# upper() --> convert into upper case
# strip() --> removes leading and lagging spaces
# if (username.strip().upper() == stored_username):
#     print("Valid user!")
# else:
#     print("Invalid user!")


# seraching methods
# check whether given input starts with 'p' or ends with 'n'
s2 = 'python'

if (s2.startswith('pyt') or s2.endswith('n')):
    print("Given string starting with 'p' or ending with 'n'")
else:
    print("Not starting with 'p'")


# Check given string is palindrome or not
s3 = "12345"
reversed_s3 = s3[::-1]

if (reversed_s3 == s3):
    print("Given string is palindrome")
else:
    print("Not a palindrome")


# Concatenation and string mupliplier
s4 = "Hello"
s5 = "World"
print(s4 + s5)
print(s4 * 3)

s6 = "I found a bug in my bug stroy, now I need to fix that bug"
print(s6.count("bug"))
# replace bug with issue
# replace(old, new)
bug_s6 = s6.replace("bug", "issue")
print(bug_s6)

# replace first 2 occurances of bug in s6
s7 = s6.replace("bug", "issue", 2)
print(s7)