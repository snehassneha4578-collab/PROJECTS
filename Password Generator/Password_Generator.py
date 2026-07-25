import random

letters = [
    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
    "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
]

numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']

symbols = ["!", "@", "#", "$", "%", "^", "&", "*"]

print("Welcome to Password Generator!")

n_letters = int(input("How many letters do you want in your password?\n"))
n_symbols = int(input("How many symbols do you want?\n"))
n_numbers = int(input("How many numbers do you want?\n"))

password_list = []

# Add letters
for i in range(n_letters):
    char = random.choice(letters)
    password_list.append(char)

# Add symbols
for i in range(n_symbols):
    char = random.choice(symbols)
    password_list.append(char)

# Add numbers
for i in range(n_numbers):
    char = random.choice(numbers)
    password_list.append(char)

print(password_list)

# Shuffle the password
random.shuffle(password_list)

print(password_list)

# Convert list to string
password = ""

for char in password_list:
    password += char

print("Your password is:", password)