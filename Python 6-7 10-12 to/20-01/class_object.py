# class --> blueprint for object creation
# object --> real instance created from a class

# class definition
class Student:
    # class variables
    college_name = 'ABCD'

    # constructor --> it is a kind of method, it will be called automatically while creating objects
    def __init__(self, name, age):
        # instance variables
        self.name = name
        self.age = age


    # method to store student name, age
    # self represents address of current object and it should be first param
    def store_data(self, name, age):
        # instance variables
        self.name = name
        self.age = age

# object creation
s1 = Student('kiran', 20)
s2 = Student('john', 21)

# no need to call these methods explicitly (constructr will assign the values)
# s1.store_data('kiran', 20)
# s2.store_data('john', 21)

# accessing instance data of objects
print(s1.name)
print(s2.age)

# accessing class variables
print(s1.college_name)
print(s2.college_name)
print(Student.college_name)

# declaring new instance variables to objects
s1.city = 'vizag'
print(s1.city)
print(s1)