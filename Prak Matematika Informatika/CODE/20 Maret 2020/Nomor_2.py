# Nama : Jedediah Fanuel
# Nim  : 1119023
# Summary of Product

# Deklarasi
KALI = '\u00b7'
KOMPLEMEN = '\u2032'
PI = '\u03A0'
SIGMA = '\u03A3'


def buat_list_ekspresi_boolean(user):
    list = []
    for jenis in user:
        if user[jenis] == 1:
            list.append(jenis)
        else:
            list.append(jenis + KOMPLEMEN)
    return list


daftar = [
    {
        'k': 0,
        's': 0,
        't': 0,
        'x': 0
    },
    {
        'k': 0,
        's': 0,
        't': 1,
        'x': 1
    },
    {
        'k': 0,
        's': 1,
        't': 0,
        'x': 1
    },
    {
        'k': 0,
        's': 1,
        't': 1,
        'x': 0
    },
    {
        'k': 1,
        's': 0,
        't': 0,
        'x': 1
    },
    {
        'k': 1,
        's': 0,
        't': 1,
        'x': 0
    },
    {
        'k': 1,
        's': 1,
        't': 0,
        'x': 1
    },
    {
        'k': 1,
        's': 1,
        't': 1,
        'x': 0
    },
]

print('  ' + 'k ' + 's ' + 't ' + 'f(k,s,t) ' + 'minterm')

minterm = []
indexMinterm = []
sigmaMinterm = []
for idx, interpretasi in enumerate(daftar):
    print(idx, '', end="")
    for value in interpretasi:
        print(str(interpretasi[value]) + ' ', end="")
    if interpretasi['x'] == 1:
        hasil = buat_list_ekspresi_boolean(interpretasi)
        joining = "".join([str(hasil[0]), str(hasil[1]), str(hasil[2])])
        print("       " + str(joining), end="")
        minterm.append(joining)
        indexMinterm.append('m' + str(idx))
        sigmaMinterm.append(str(idx))
    print("")

print("")
mintermTrue = " + ".join(minterm)
f = 'f(k,s,t) = '

print('Dalam bentuk kanonik SOP:')
print(f + mintermTrue)

print('\nMenggunakan lambang minterm:')
print(f, end="")
print(' + '.join(indexMinterm))

print('\nMenggunakan lambang minterm dan sigma:')
print(f + SIGMA + '(', end="")
print(','.join(sigmaMinterm), end="")
print(')')
