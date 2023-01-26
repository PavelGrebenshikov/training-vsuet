import json


def write_to_file(matrix):

    matrix = [[1, 2, 3, 4],[5, 6, 7, 8],[9,10,11,12]]

    with open("GrebenshikovPavel_ZIT-2022_vvod.json", encoding="utf-8", mode="w+") as fw:
        json.dump(matrix, fw)



def read_from_file():

    with open("GrebenshikovPavel_ZIT-2022_vivod.json", encoding="utf-8", mode="r+") as rf:
        data = json.load(rf)
    
    return data


# write_to_file()
read_from_file()