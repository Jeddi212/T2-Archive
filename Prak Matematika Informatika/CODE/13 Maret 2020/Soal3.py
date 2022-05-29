# Deklarasi
KALI = '\u00b7'
KOMPLEMEN = '\u2032'


def buat_list_ekspresi_boolean(user):
    list = []
    for jenis in user:
        if jenis == 'x':
            break;
        if user[jenis] == 1:
            list.append(jenis)
        else:
            list.append(jenis + KOMPLEMEN)
    return list


daftar = [
    {
        'k' : 0,
        's' : 0,
        't' : 0,
        'x' : 0
    },
    {
        'k' : 0,
        's' : 0,
        't' : 1,
        'x' : 1
    },
    {
        'k' : 0,
        's' : 1,
        't' : 0,
        'x' : 1
    },
    {
        'k' : 0,
        's' : 1,
        't' : 1,
        'x' : 0
    },
    {
        'k' : 1,
        's' : 0,
        't' : 0,
        'x' : 1
    },
    {
        'k' : 1,
        's' : 0,
        't' : 1,
        'x' : 0
    },
    {
        'k' : 1,
        's' : 1,
        't' : 0,
        'x' : 1
    },
    {
        'k' : 1,
        's' : 1,
        't' : 1,
        'x' : 0
    },
]

print('k ' + 's ' + 't ' + 'x ')

semua = []

for interpretasi in daftar:
    for value in interpretasi:
        print(str(interpretasi[value]) + ' ', end="")
    if interpretasi['x'] == 1:
        hasil = buat_list_ekspresi_boolean(interpretasi)
        joining = "".join(hasil)
        print("  " + str(joining), end="")
        semua.append(joining)
    print("")

print("")
semuaTrue = "  +  ".join(semua)
print(semuaTrue)