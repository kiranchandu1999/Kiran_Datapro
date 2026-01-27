# inheritance --> 
# It's a mechanism which allows to create a new class by acquiring attributes and methods from a parent class
# Parent class -> Child class
# Base class -> Derived class
# Super class -> Subclass

# Why inheritance --> for code reusability

# Types
# Single level inheritance (one parent to one child)
class Person: # parent class
    def __init__(self, name):
        self.name = name

    def speak(self):
        print(f"{self.name} is speaking...")


class Student(Person): # child class
    def __init__(self, name, marks):
        super().__init__(name) # calling parent class constructor
        self.marks = marks

    def study(self):
        print(f"{self.name} is studying...")


p1 = Person('John')
p1.speak()

s1 = Student('Ashok', 95)
s1.study() # self or own method
s1.speak() # inherited from parent
print(s1.name) # inherited from parent


# --------------------------------------
# Multi level inheritance (parent -> child -> subchild)

class Employee(Person): # Child class
    def __init__(self, name, id, salary):
        super().__init__(name)
        self.emp_id = id
        self.salary = salary

    def work(self):
        print(f"Employee {self.name} is working...")


class Developer(Employee): # subchild class
    def __init__(self, name, id, salary, lang):
        super().__init__(name, id, salary)
        self.lang = lang

    def code(self):
        print(f"Developer {self.name} is coding in {self.lang}")


e1 = Employee('Priya', 101, 500)

d1 = Developer('Daniel', 202, 1000, 'python')
d1.code() # own method
d1.work() # immediate parent method
d1.speak() # parent method
print(d1.emp_id)
