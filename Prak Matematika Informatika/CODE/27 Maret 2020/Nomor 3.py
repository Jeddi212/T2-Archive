# Nama : Jedediah Fanuel
# Nim  : 1119023
# Decimal to Hexadecimal

print("Program Convert Decimal to Hexadecimal")
print("--------------------------------------")


def decimal_to_hexa(angka):
    temp_mod = []
    temp_hexa = []
    tuple_hexadecimal = (
        '0', '1', '2', '3',
        '4', '5', '6', '7',
        '8', '9', 'A', 'B',
        'C', 'D', 'E', 'F'
    )

    while angka != 0:
        div, mod = divmod(angka, 16)
        temp_mod.insert(0,mod)
        angka = div

    for value in temp_mod:
        temp_hexa.append(tuple_hexadecimal[value])

    string_dec = "".join(temp_hexa)
    return "0X" + string_dec


n = 524
print("Decimal = " + str(n))
str_biner = decimal_to_hexa(n)
print("Result = ", str_biner, "\n")

n = 16
print("Decimal = " + str(n))
print("Result = ", decimal_to_hexa(n), "\n")

n = 123
print("Decimal = " + str(n))
print("Result = ", decimal_to_hexa(n), "\n")