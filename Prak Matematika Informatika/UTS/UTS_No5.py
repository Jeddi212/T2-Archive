# Nama : Jedediah Fanuel
# Nim  : 1119023

if __name__ == '__main__':
    list_pq_values = [
        {'p': True, 'q': True},
        {'p': True, 'q': False},
        {'p': False, 'q': True},
        {'p': False, 'q': False}
    ]

    User = input("Masukkan ekspresi Boolean : ")

    for interpretasi in list_pq_values:
        interpretasi_temp = interpretasi.copy()
        hasil = eval(User, interpretasi_temp)
        interpretasi[User] = hasil
        print(interpretasi)

    # print(list_pq_values)