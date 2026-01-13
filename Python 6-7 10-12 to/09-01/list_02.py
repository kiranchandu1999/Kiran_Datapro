import copy

# Nested list:
marks1 = [80, 55, 69, 90]
marks2 = [81, 55, 70, 90]
marks3 = [80, 65, 69, 70]

all_marks = [marks1, marks2, marks3]

# print 1st person 4th subject and 3rd person 2nd subject marks
print(all_marks[0][3]) # 90
print(all_marks[2][1]) # 65

# find the averages in the form of list from all_marks

def cal_avg(list):
    total = 0
    for x in list:
        total += x
    avg = total/len(list)
    return avg

avg_list = []

for m in all_marks:
    avg_list.append(cal_avg(m))

print(avg_list)


# list comprehension:
# It is a way of creating a new list by doing some calculation on each element of iterable

# syntax:
# [expression for item in iterable if condition]
gt_70_marks1 = [n*2 for n in marks1 if n>70]
print(gt_70_marks1)

# finding average for all_marks using list comprehension
avg_list2 = [cal_avg(m) for m in all_marks]
print(avg_list2)


# list flattening using comprehension
flat_list = [n for m in all_marks for n in m]

# for m in all_marks:
#     for n in m:
#         flat_list.append(n)
print(flat_list)


# list assignment, shallow copy and deep copy:
a = [5, 8, 6, 4]
b = a  # list assignment

# modify 0th index in b, it will modify 0th index in a also
# b[0] = 12
# print(a)
# print(b)

# shallow copy of a into c
c = a[:]
c[0] = 20
print(c)
print(a)


# deep copy ==> copying mutable items in list1 into list2 
x = [[5, 8, 1], [6, 3, 4]]
# shallow copy
y = x.copy()
# y[0] = [1, 3]
# y[0][1] = 16
# print(y)
# print(x)

z = copy.deepcopy(x)
z[0][1] = 16
print(z)
print(x)