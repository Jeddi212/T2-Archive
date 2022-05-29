# Nama : Jedediah Fanuel
# Nim  : 1119023

if __name__ == '__main__':
    list_pq_values = [
        {'p': True, 'q': True},
        {'p': True, 'q': False},
        {'p': False, 'q': True},
        {'p': False, 'q': False}
    ]

    def implies(p,q):
        hasil = not(p) or q
        return hasil

    print('{:<7}{:<7}{:<7}'.format(("p"), ("q"), ("p -> q")))

    for interpretasi in list_pq_values:
        hasil = implies(interpretasi['p'], interpretasi['q'])
        if interpretasi['p'] == 1:
            hasilp = "True"
        else:
            hasilp = "False"

        if interpretasi['q'] == 1:
            hasilq = "True"
        else:
            hasilq = "False"

        if hasil == 1:
            hasil = "True"
        else:
            hasil = "False"

        print('{:<7}{:<7}{:<7}'.format((hasilp), (hasilq), (hasil)), end="")
        print("")
