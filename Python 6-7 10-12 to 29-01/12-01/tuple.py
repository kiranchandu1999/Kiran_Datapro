# tuple --> It is a built-in data structure which is used to store multiple heterogeneous elements in a sequenced order.
# It is same as a list which follows 0th based indexing for storing elememts
# The only difference is tuple is an immutable ds so accessing elements is fast comapred to list.

# tuple creation:
nums1 = (2, 4, 8, 1, 6)
nums2 = tuple([5, 8, 3])
# create a tuple with single value
tuple1 = (5,)
tuple2 = (5)

print(type(tuple1))
print(type(tuple2))


# accessing tuple using index and slicing
# print 3rd value in nums2
print(f"Third value in nums2 is: {nums2[2]}")

# extract some part of collection from tuple nums1 (2nd value to 4th value)
# tuple[start:stop:step]
print(nums1[1:4])


# packing and unpacking
# packing ---> combining individual items into a single tuple
signal_colors = 'red', 'yellow', 'green'
print(type(signal_colors)) # tuple

# unpacking ---> seperating the items of a tuple into individual values
r, y, g = signal_colors
print(r)
print(y)
print(g)

x, *y = signal_colors
print(y) # ['yellow', 'green']


a = 5
b = 10
# swap a and b values using packing and unpacking
# temp = a
# a = b
# b = temp

b, a = a, b
print(f"after swap: a is {a} and b is {b}")


# function returning muliple values
def get_min_max_sum(vals):
    return sum(vals), min(vals), max(vals)

sum, min, max = get_min_max_sum([5, 8, 3, 6])
print(f"Sum is: {sum}")
print(f"Min is: {min}")
print(f"Max is: {max}")