# Deklarasi
pengguna1 = {
    'kopi' : False,
    'susu' : True,
    'teh' : False
}
pengguna2 = {
    'kopi' : False,
    'susu' : False,
    'teh' : True
}
pengguna3 = {
    'kopi' : True,
    'susu' : False,
    'teh' : False
}


def buat_list_ekspresi_boolean(user):
    list = []
    for jenis in user:
        if user[jenis] == True:
            list.append(jenis)
        else:
            list.append('not(' + jenis + ')')
    return list


hasil1 = buat_list_ekspresi_boolean(pengguna1)
hasil2 = buat_list_ekspresi_boolean(pengguna2)
hasil3 = buat_list_ekspresi_boolean(pengguna3)


print("Pengguna 1 : " + str(hasil1))
print("Pengguna 2 : " + str(hasil2))
print("Pengguna 2 : " + str(hasil3))

print("")
print("")

join1 = " AND ".join(hasil1)
join2 = " AND ".join(hasil2)
join3 = " AND ".join([str(hasil3[0]), str(hasil3[1]), str(hasil3[2])])

print("Pengguna 1 : " + join1)
print("Pengguna 1 : " + join1)
print("Pengguna 1 : " + join3)

print("")
print("")

print("Semua Pengguna : ")
semua = " OR ".join([join1, join2, join3])
print(semua)
