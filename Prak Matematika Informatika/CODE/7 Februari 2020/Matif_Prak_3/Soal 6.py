# Nama  :   Jedediah Fanuel
# Nim   :   1119023

def is_contradiction(list):
    count = 0
    for i in list:
        if i == False:
            count += 1

    if len(list) == count:
        return "Contradiction"
    else:
        return "Bukan Contradiction"
    
#Fungsi Bentuk Lain 
"""
def is_contradiction(list):
    found = False
    for i in list:
        if i == True:
            found = True
            break

    if found != False:
        return True
    else:
        return False
"""

if __name__ == '__main__':
    truth_value_result = [False, False, False, False]
    truth_value_result2 = [False, False, True, False]

    print("Nilai truth value: ", truth_value_result)
    print(is_contradiction(truth_value_result))

    print(" ")

    print("Nilai truth value: ", truth_value_result2)
    print(is_contradiction(truth_value_result2))
