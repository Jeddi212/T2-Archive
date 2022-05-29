# Nama : Jedediah Fanuel
# Nim  : 1119023
# Desimal ke biner

biner = 8
print("Output tahap 1 : ")
for num in range(biner):
    print(num)
print("")


def desimal_ke_biner3digit(desimal):
    str_biner_python = bin(desimal)
    str_biner = str_biner_python[2:]
    str_biner_3digit = str_biner.zfill(3)

    return str_biner_3digit


print("Output tahap 2 : ")
for num in range(biner):
    print(num, '->', desimal_ke_biner3digit(num))

print("Output tahap Akhir : ")
for num in range(biner):
    biner = desimal_ke_biner3digit(num)
    print(num, '->', biner, '->', biner[0], biner[1], biner[2])
