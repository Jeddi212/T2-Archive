# Nama : Jedediah Fanuel
# Nim  : 1119023

import random

if __name__ == '__main__':

    list_val = [True, False]
    list_operator = ['and', 'or', 'xor']

    random_val = random.choice(list_val)
    random_operator = random.choice(list_operator)

    p = random_val
    q = random_val

    print("p : ", end = "")
    print(p)
    print("q : ", end = "")
    print(q)

    if random_operator == "or":
        hasil_benar = p or q
    elif random_operator == "and":
        hasil_benar = p and q
    else:
        hasil_benar = p ^ q

    if hasil_benar == True:
        hasil_benar = "True"
    else:
        hasil_benar = "False"

    print(" ")

    found = False
    while not(found):
        User = input("p " + random_operator + " q = ? ")

        if User == hasil_benar:
            print("Benar")
            found = True
        else:
            print("Salah")

        print(" ")
