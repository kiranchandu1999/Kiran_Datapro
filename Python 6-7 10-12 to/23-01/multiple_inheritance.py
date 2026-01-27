# Multiple inheritance --> Creating a child class by inheriting multiple parent classes
class Employee:
    def __init__(self, name, id):
        print("Employee constructor start")
        self.name = name
        self.id = id
        super().__init__() # control goes to next parent
        print("Employee constructor end")

    def work(self):
        print("Employee is working..")

class Developer(Employee):
    # constructor
    def __init__(self, name, id, lang):
        super().__init__(name, id)
        self.lang = lang

    def code(self):
        print(f"Coding in {self.lang}")

class Manager:
    def __init__(self):
        print("Manager constructor start")
        super().__init__() # control goes to Object class (because next parent not exists)
        print("Manager constructor end")

    def conduct_meeting(self):
        print("Conducting meeting!!")

class TechLead(Employee, Manager):
    def __init__(self, name, id):
        print("TechLead constructor start")
        super().__init__(name, id) # Employee constructor calling
        print("TechLead constructor end")

# MRO (Method resolution order)
tl1 = TechLead('john', 101)
tl1.conduct_meeting()
tl1.work()

# ---------------
class A:
    def f1(self):
        print("Class A method")


class B:
    def f2(self):
        print("Class B method")


class C(A, B):
    def f3(self):
        print("Class C method")

c1 = C()
c1.f1()
c1.f2()
c1.f3()