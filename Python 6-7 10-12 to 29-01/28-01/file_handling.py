# file handling involves reading data from a file and writing data into a file through program.
# file -> It's a container which contains data in the form of bytes or character stream

# file handling steps:
# open a file (existing file)
# perform operations (read/write)
# close the file
# handling file exceptions (optional)

# opening a file using open() built-in function
# syntax: open('file_name', 'mode_of_operation')
# open() function returns file object
file1 = open('data.txt', 'r')

# reading whole data from data.txt file
# print(file1.read())

# reading data line by line
# print(file1.readline())
# print(file1.readline())

# for l in file1:
#     print(l)


# reading data for defined size (limited characters)
# print(file1.read(3))
# print(file1.read(3))

# closing file object
file1.close()

# writing data into file
# over writes the existing data
# file2 = open('data.txt', 'w')
# file2.write("Overridden")
# file2.write("New line")
# print("Data written successfully!")
# file2.close()

# append the data at the end of the file
file3 = open('data.txt', 'a')
# file3.write('\nNew line 1 after existing data')
# print('Data written successful')
file3.close()


# Best practice - use 'with' keyword for opening files
# It automatically closes the opened file
# with open('data.txt', 'r') as file4:
#     for line in file4:
#         print(line.strip())


# Example
# create a function for User registration to store registered users data into a file 
def register_user(username, password):
    with open('users.txt', 'a') as f:
        # adding user data into users.txt file
        f.write(f"{username},{password}\n")
        print('User registed!!!')

register_user('kiran', '1234')
register_user('ram', '5689')
register_user('priya', '2145')


# create a function to check login successful or not
def login(username, password):
    with open('users.txt', 'r') as f:
        # reading data line by line
        for line in f:
            u, p = line.strip().split(',')
            if (u == username and p == password):
                return "login success!"
    return "login failed!!!"


print(login('kiran', '1234')) # login success
print(login('ram', '5412')) # login failed


# copying image using file handling
img_data = []
try:
    with open('python.jpg', 'rb') as f:
        # reading data
        img_data = f.read()

    with open('copy.jpg', 'wb') as f:
        # writing image data into copy file
        f.write(img_data)
        print('Image copied to new file')
except FileNotFoundError:
    print("File not found!!")