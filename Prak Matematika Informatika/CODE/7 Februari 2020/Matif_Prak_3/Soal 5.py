# Nama  :   Jedediah Fanuel
# Nim   :   1119023

def is_tautology(list):
    count = 0
    for i in list:
        if i == True:
            count += 1

    if len(list) == count:
        return "Tautology"
    else:
        return "Bukan Tautology"

#Fungsi Bentuk Lain 
"""
def is_tautology(list):
    found = True
    for i in list:
        if i == False:
            found = True
            break

    if found != True:
        return True
    else:
        return False
"""
 
if __name__ == '__main__':
    truth_value_result = [True, True, True, True]
    truth_value_result2 = [True, True, True, False]

    print("Nilai truth value: ", truth_value_result)
    print(is_tautology(truth_value_result))

    print(" ")

    print("Nilai truth value: ", truth_value_result2)
    print(is_tautology(truth_value_result2))
