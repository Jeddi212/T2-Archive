# Nim  : 1119023
# Nama : Jedediah Fanuel


def hitung_kemiripan_by_jaccard(set_1, set_2):
    irisan = set_1 & set_2
    gabungan = set_1 | set_2
    banyak_irisan = len(irisan)
    banyak_gabungan = len(gabungan)

    return banyak_irisan / banyak_gabungan


set1 = {6, 7, 8}
set2 = {1, 6, 7}
kemiripan = hitung_kemiripan_by_jaccard(set1, set2)

print(kemiripan)

musik_fav = {
    "Jonathan": {'electronica','rap','industrial','rock','funk'},
    "Anthony": {'funk','alternative','rap'},
    "Josh": {'alternative','funk','rap'},
    "Michael": {'jazz','electronica'},
    "Brian": {'rock','funk','industrial','rap'}
}

nama = input("Masukkan nama untuk dicari nilai kemiripannya : ")

set_cari = musik_fav[nama]

for daftar_nama in musik_fav:
    set_daftar = musik_fav[daftar_nama]
    if daftar_nama != nama:
        kemiripan = hitung_kemiripan_by_jaccard(set_cari, set_daftar)
        print("Nilai kemiripan dengan" , daftar_nama , "=", kemiripan)
