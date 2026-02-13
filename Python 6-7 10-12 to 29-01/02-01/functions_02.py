# Variable length arguments
# (*args  --->  we can pass any no of positional arguments)

def calc_sum(*nums):
    total = 0
    for x in nums:
        total = total + x

    print(f"Sum is: {total}")


calc_sum(5, 3, 8)
calc_sum(2, 3)


# (*kwargs  --->  we can pass any no of keyword arguments)
# create a function to register new user profile
# def create_profile(name, email, dob, location):
#     print(f"Profile created for {name} with {email}")
#     # printing extra information
#     print("Additonal Information:")
#     print(f"dob: {dob}, location: {location}")


def create_profile(name, email, **additional_info):
    print(f"Profile created for {name} with {email}")
    # printing extra information
    print("Additonal Information:")
    for x, y in additional_info.items():
        print(f"{x}: {y}")


# calling function
create_profile("John", "john@gmail", location="vizag", dob=2000)

create_profile("Alice", "alice@gmail", dob=2001, location="Hyd", ssc=95, graduation=80)