row1 = ['😃', '😃', '😃']
row2 = ['😃', '😃', '😃']
row3 = ['😃', '😃', '😃']

matrix = [row1, row2, row3]   # Create the matrix

print(f"{row1}\n{row2}\n{row3}")

position = input("Enter the position where you want to hide money: ")

row_num = int(position[0])
col_num = int(position[1])

row_selected = matrix[row_num - 1]
row_selected[col_num - 1] = 'x'

print(f"{row1}\n{row2}\n{row3}")