from task_4 import read_from_file
import json

def matrix_is_magic(matrix):

    if matrix is None:
        return

    n = sum(matrix[0])
 
    for i in range(len(matrix)):
        num = 0
        for j in range(len(matrix)):
            num += matrix[j][i]
        if num != n or sum(matrix[i]) != n:
            return False
    return True
 
print(matrix_is_magic(read_from_file()))


def per_matrix(matrix):

    mat_first = matrix[0]
    mat_last = matrix[::-1][0]

    matrix.pop(0)
    matrix.pop(len(matrix) - 1)

    matrix.insert(0, mat_last)
    matrix.append(mat_first)

    
    with open("GrebenshikovPavel_ZIT-2022_vvod.json", encoding="utf-8", mode="w+") as fw:
        json.dump(matrix, fw)

per_matrix(read_from_file())
