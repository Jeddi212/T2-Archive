# Nama  :   Jedediah Fanuel
# Nim   :   1119023

def is_tautology(list):
    count = 0
    for i in list:
        if i == True:
            count += 1

    if len(list) == count:
        return True  # Tautology
    else:
        return False  # Bukan Tautology


def is_contradiction(list):
    count = 0
    for i in list:
        if i == False:
            count += 1

    if len(list) == count:
        return True  # Contradiction
    else:
        return False  # Bukan Contradiction
    
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


def is_contingency(list):
    if is_tautology(list) != True and is_contradiction(list) != True:
        return True  # Contingency
    else:
        return False  # Bukan Contingency


if __name__ == '__main__':
    # Deklarasi
    truth_value_result = [True, False, False, False]
    truth_value_result2 = [True, True, True, True]
    truth_value_result3 = [False, False, False, False]

    print("Nilai truth value: ", truth_value_result)
    if is_contingency(truth_value_result):
        print("Contingency")
    else:
        print("Bukan Contingency")

    print(" ")

    print("Nilai truth value: ", truth_value_result2)
    if is_contingency(truth_value_result2):
        print("Contingency")
    else:
        print("Bukan Contingency")

    print(" ")

    print("Nilai truth value: ", truth_value_result3)
    if is_contingency(truth_value_result3):
        print("Contingency")
    else:
        print("Bukan Contingency")
