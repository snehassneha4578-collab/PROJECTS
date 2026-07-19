import random

rock = """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
"""

paper = """
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
"""

scissors = """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
"""

game_images = [rock, paper, scissors]

user_choice = int(input("Enter your choice:\nType 0 for Rock\nType 1 for Paper\nType 2 for Scissors\n"))

if user_choice < 0 or user_choice > 2:
    print("Invalid choice! You Lose.")
else:
    print("\nYou chose:")
    print(game_images[user_choice])

    computer_choice = random.randint(0, 2)

    print("Computer chose:")
    print(game_images[computer_choice])

    if user_choice == computer_choice:
        print("It's a Draw!")

    elif user_choice == 0 and computer_choice == 2:
        print("You Win!")

    elif user_choice == 2 and computer_choice == 0:
        print("You Lose!")

    elif user_choice > computer_choice:
        print("You Win!")

    else:
        print("You Lose!")