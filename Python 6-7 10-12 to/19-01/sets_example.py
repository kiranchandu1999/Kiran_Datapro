# Set: It's an unordered collection of unique elements

# set creation
nums = {5, 8, 3, 6, 5}
# or
evens = set([2, 6, 10, 4, 2, 8])
# create empty set
empty_set = set()

print(nums)
print(evens)
print(type(empty_set))


# set methods
# add/update into set
nums.add(11)
nums.update(evens)
print('-' * 10)
print(nums) # {2, 3, 4, 5, 6, 8, 10, 11}


# removing elements from set
nums.remove(5) # throws error
nums.discard(9) # doesn't throws any error if key not found
nums.pop() # removes random item
# nums.clear() # removes everything
print(nums)


# accessing elements
# print(nums[0]) # doesn't allow index based access

for i in nums:
    print(i)


# Mathematical operations
set_a = {2, 3, 4, 5}
set_b = {4, 5, 6, 7}

# union (|)
print(set_a | set_b)
print(set_a.union(set_b))

# intersection (&)
print(set_a & set_b)
print(set_a.intersection(set_b))

# difference (-)
print(set_b - set_a) # {6, 7}

# symmetric difference (^)
print(set_a ^ set_b)


# Filter unique emails
emails = ['a@gmail.com', 'b@gmail.com', 'a@gmail.com', 'c@gmail.com']

unique_emails = set(emails)
print(unique_emails)


# common students in both classes
class_a = {'kiran', 'raju', 'john', 'ashok', 'priya'}
class_b = {'rahul', 'ashok', 'lalit', 'sujit', 'raju'}

print(f"Common students: {class_a & class_b}")