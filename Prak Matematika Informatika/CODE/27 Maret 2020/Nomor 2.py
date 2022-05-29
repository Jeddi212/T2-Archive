# Nama : Jedediah Fanuel
# Nim  : 1119023
# Hexadecimal to Decimal

print("Program Convert Hexadecimal to Decimal")
print("--------------------------------------")


def hexa_to_dec(val):
    tuple_hexadecimal = (
        '0', '1', '2', '3',
        '4', '5', '6', '7',
        '8', '9', 'A', 'B',
        'C', 'D', 'E', 'F'
    )

    int_desimal = 0
    hexa_reverse = val[::-1]

    for posisi, hexa in enumerate(hexa_reverse):
        index_karakter = tuple_hexadecimal.index(hexa)
        hasil_kali = index_karakter * (16**posisi)
        int_desimal += hasil_kali

    return int_desimal


list_nilai_hexadecimal = [
    'E', 'F', '0', '11', '12', '13', '14', '15',
    '16', '17', '18', '19', '1A', '1B', '20C'
]

for value in list_nilai_hexadecimal:
    string_hexa = '0X' + value
    out = hexa_to_dec(value)
    print('{:6}''{:<6}'.format(string_hexa, out))
