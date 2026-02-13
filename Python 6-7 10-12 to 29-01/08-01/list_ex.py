# List: It is an ordered sequence of elements and it's a built in data structure.
# List can contain multiple different data type elements

# Why list:
# easy to store multiple items in a single variable
# easy to process and modfify items using single variable

# Creating a list:
list_1 = []  # empty list
list_2 = [5, 8, 3, 6]  # with values
list_3 = list("python")  # list(iterable)
list_4 = ['a', True, 15.6, 28]

print(list_3)
print(list_4)


# Indexing and slicing
# print 3rd element of list_4
print(list_4[2]) # 15.6


# make another list with last 2 items of list_2
# [start: stop: step]
list_5 = list_2[2:]
print(list_5) # [3, 6]

# reverse the given list_3 and store in a new list
rev_list_3 = list_3[::-1]
# rev_list_3 = list_3.reverse()
print(rev_list_3)


# Iterating over list
colors = ["green", "blue", "yellow", "red"]
# for x in colors:
#     print(x)

# make a new list with colors which are having morethan 4 characters
colors_2 = []
for x in colors:
    # condition to check color length
    if len(x) > 4:
        # append(item) --> it will add item to the list at the end
        colors_2.append(x)

print(colors_2)


# list methods
# insert(index, item) --> will add item at given index
# add 'orange' color at index 2
colors.insert(2, 'orange')
print(colors)

# replace color at index 3 with 'black'
colors[3] = 'black'
print(colors)

# merging 2 lists into a single list
# extend(iterable) --> it will add given iterable at end of list_1
colors.extend(colors_2)
print(colors) # ['green', 'blue', 'orange', 'black', 'red', 'green', 'yellow']


# implement stack on colors list
# list.pop() --> removes last item from the list
# for i in range(len(colors)):
#     print(colors.pop())

# remove 'black' from colors
# list.remove(item) --> removes given item from list if exists otherwise throws error
colors.remove('black')
print(colors)