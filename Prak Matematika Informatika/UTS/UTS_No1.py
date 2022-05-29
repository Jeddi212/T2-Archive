# Nama : Jedediah Fanuel
# Nim  : 1119023

import random

if __name__ == '__main__':

    list_val = [True, False]
    p = random.choice(list_val)
    q = random.choice(list_val)

    print("p : ", end = "")
    print(p)
    print("q : ", end = "")
    print(q)

    User = input("Masukkan operator (and, or, xor): ")

    if User == "or":
        output = p or q
    elif User == "and":
        output = p and q
    else:
        output = p^q

    print("p " + User + " q = ")

    print(output)
