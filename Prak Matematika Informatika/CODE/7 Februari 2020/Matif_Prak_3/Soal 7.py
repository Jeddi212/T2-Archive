# Nama  :   Jedediah Fanuel
# Nim   :   1119023

def is_satisfiable(list):
    count = bool
    for i in list:
        if i == True:
            count = True

    if count == True:
        return "Satisfiable"
    else:
        return "Tidak Satisfiable"

#Fungsi Bentuk Lain 
"""
def is_satisfiable(list):
    count = bool
    for i in list:
        if i == True:
            count = True

    if count == True:
        return True
    else:
        return False
"""

if __name__ == '__main__':
    truth_value_result = [False, False, False, True]
    truth_value_result2 = [False, False, False, False]
    truth_value_result3 = [True, True, True, True]

    print("Nilai truth value: ", truth_value_result)
    print(is_satisfiable(truth_value_result))

    print(" ")

    print("Nilai truth value: ", truth_value_result2)
    print(is_satisfiable(truth_value_result2))

    print(" ")

    print("Nilai truth value: ", truth_value_result3)
    print(is_satisfiable(truth_value_result3))
