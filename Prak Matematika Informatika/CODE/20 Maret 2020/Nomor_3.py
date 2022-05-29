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
        if user[jenis] == 0:
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

print('  ' + 'k ' + 's ' + 't ' + 'f(k,s,t) ' + 'maxterm')

maxterm = []
indexMaxterm = []
sigmaMaxterm = []
for idx, interpretasi in enumerate(daftar):
    print(idx, '', end="")
    for value in interpretasi:
        print(str(interpretasi[value]) + ' ', end="")
    if interpretasi['x'] == 0:
        hasil = buat_list_ekspresi_boolean(interpretasi)
        joining = "+".join([str(hasil[0]), str(hasil[1]), str(hasil[2])])
        print("       " + str(joining), end="")
        maxterm.append(joining)
        indexMaxterm.append('M' + str(idx))
        sigmaMaxterm.append(str(idx))
    print("")

print("")
maxtermTrue = ")(".join(maxterm)

f = 'f(k,s,t) = '

print('Dalam bentuk kanonik POS:')
print(f + '(' + maxtermTrue + ')')

print('\nMenggunakan lambang maxterm:')
print(f, end="")
print(KALI.join(indexMaxterm))

print('\nMenggunakan lambang maxterm dan sigma:')
print(f + PI + '(', end="")
print(",".join(sigmaMaxterm), end="")
print(')')
