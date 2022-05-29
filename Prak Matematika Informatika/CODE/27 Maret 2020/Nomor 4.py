# Nama : Jedediah Fanuel
# Nim  : 1119023
# Binary to Decimal

print("Program Convert Binary to Decimal")
print("---------------------------------")


def bin_to_dec(val):

    int_desimal = 0
    biner_reverse = val[::-1]

    for posisi, biner in enumerate(biner_reverse):
        hasil_kali = int(biner) * (2**posisi)
        int_desimal += hasil_kali

    return int_desimal


list_nilai_decimal = [
    '0', '1', '10', '11', '100',
    '101', '110', '111', '1000'
]

for value in list_nilai_decimal:
    out = bin_to_dec(value)
    print('{:>6}''{:^1}''{:<6}'.format(value, " ", out))
