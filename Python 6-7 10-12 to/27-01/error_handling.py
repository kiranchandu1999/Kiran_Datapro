# Error --> Compile time error and Runtime error
# Error handling will be done by try and except
# try block -> it contains statements which might throw error
# except block -> it contains handling statements when an error occured in try block

# list = [10, 15]
# try:
#     print(list[2])
# except Exception as err:
#     print(f"Handling error: {err}")
    
# print("remaining code")
# print("program end")

# --------------
try:
    num = int(input("Enter number:")) # ValueError
    num2 = 50 / num # ZeroDivisionError
except ValueError as e:
    print(f"Value error occured: {e}")
except ZeroDivisionError as e:
    print(f"ZeroDivisionError occured: {e}")
except (IndexError, TypeError) as e: # handling multiple error in single except block
    print("Error occured")
except Exception:
    print(f"An Unknown error occured..")
else:
    print(f"Result: {num2}") # this statement should run after successful execution of try block

print("program end")
    