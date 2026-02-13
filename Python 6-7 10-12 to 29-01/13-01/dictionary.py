# Dictionary:
# It is a built in data structure which stores collection of data in key value pairs

# Why dictionary:
# Accessing items in dictionary is fast compared to other datastructures - O(1)
# It allows to store structured data

# Creating dict
student1 = {"name": "kiran", "email": "kiran@gmail.com", "age": 20}
# or
student2 = dict(name="raju", email="raju@gmail.com", age=21)


# accessing dictionary keys and values
print(student1)
# dict_name[key]
print(student1["email"]) # kiran@gmail.com

# iterating over dictionary
# print the keys in student1
for x in student1.keys():
    print(x)

print('-' * 15)

# print values of student1
for k in student1.keys():
    print(student1[k])

print('-' * 15)
# print key: value in student1
for k, v in student1.items():
    print(f"{k}: {v}")


# dictionary methods
# add contact no. to student2 dictionary
# add/update
student2["contact"] = "1234" # adding new key value
student2["age"] = 22 # updating existing key value

print(student2)


# delete email key/value pair from student2
# dict_name.pop(key)
student2.pop("email")
print(student2)

# merge data2 dict into student2 dictionary
data2 = {"college": "ABCD", "city": "vizag"}
student2.update(data2)
print(f"student2 after merge: {student2}")

# safe methods for accessing and inserting new values
# dict_name.get(key, default_value)
print(student2.get("email", "default_email")) # default_email

student2.setdefault("city", "visakhapatnam") # won't update existing one
print(student2)


# Letter frequency calculator

def calc_freq(str):
    freq = {}

    for l in str:
        freq[l] = freq.get(l, 0) + 1

    return freq

print(calc_freq("datapro"))
print(calc_freq("dwarakanagr vizag"))


# dictionary comprehension:
# {key_expression: value_expression for item in iterable if condition}

marks_data = {"kiran": 85, 
              "raju": 60, 
              "priya": 78,
              "ashok": 52}

# filter above marks_data that return students marks >= 75
above_75_marks = {n: m for n, m in marks_data.items() if m >= 75}
print(above_75_marks)