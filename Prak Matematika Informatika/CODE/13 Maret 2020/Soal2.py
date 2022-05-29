# Deklarasi
KALI = '\u00b7'
KOMPLEMEN = '\u2032'

pengguna1 = {
    'k' : 0,
    's' : 1,
    't' : 0
}
pengguna2 = {
    'k' : 0,
    's' : 0,
    't' : 1
}
pengguna3 = {
    'k' : 1,
    's' : 0,
    't' : 0
}


def buat_list_ekspresi_boolean(user):
    list = []
    for jenis in user:
        if user[jenis] == 1:
            list.append(jenis)
        else:
            list.append(jenis + KOMPLEMEN)
    return list


hasil1 = buat_list_ekspresi_boolean(pengguna1)
hasil2 = buat_list_ekspresi_boolean(pengguna2)
hasil3 = buat_list_ekspresi_boolean(pengguna3)

print("Pengguna 1 : " + str(hasil1))
print("Pengguna 2 : " + str(hasil2))
print("Pengguna 2 : " + str(hasil3))

print("")
print("")

join1 = KALI.join(hasil1)
join2 = KALI.join(hasil2)
join3 = KALI.join([str(hasil3[0]), str(hasil3[1]), str(hasil3[2])])

print("Pengguna 1 : " + join1)
print("Pengguna 1 : " + join1)
print("Pengguna 1 : " + join3)

print("")
print("")

print("Semua Pengguna : ")
semua = '  +  '.join([join1, join2, join3])
print(semua)
