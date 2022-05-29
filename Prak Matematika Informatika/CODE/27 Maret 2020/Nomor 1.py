# Nama : Jedediah Fanuel
# Nim  : 1119023
# Desimal ke biner

print("Program Convert Decimal to Binary")
print("---------------------------------")


def decimal_to_biner(angka):
    temp_mod = []

    while angka != 0:
        div, mod = divmod(angka, 2)
        temp_mod.insert(0,str(mod))
        angka = div

    biner = "".join(temp_mod)

    return biner


print("Decimal = 4")
str_biner = decimal_to_biner(4)
print("Result = ", str_biner)
print(type(str_biner), "\n")

print("Decimal = 5")
print("Result = ", decimal_to_biner(5))

