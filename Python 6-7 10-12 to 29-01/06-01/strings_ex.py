# String -> Sequence of characters enclosed in quotes and it's an immutable data structure

# Creating strings: strings can be created using single, double or triple quotes

s1 = "Python"
multiline = """
    Line 1
    Line 2
    Line 3
"""
print(multiline)

# Indexing: string follows positive indexes from 0 to n-1 (left to right)
# Negative indexes from -1 to -n (right to left)

# print character at 3rd index in s1
print(s1[3]) # 'h'

# print 2nd character of s1 using negetive index
# print(len(s1)) # returns length of s1 sting that is 6
print(s1[-(len(s1)-1)]) # 'y'


# slicing: extracting some part of content from main string
# syntax: str[start:end:step]
location = "Dwarakanagar Vizag"

# print city name from above location
space_idx = location.find(" ") # returns index of given string
print(location[space_idx+1:])
