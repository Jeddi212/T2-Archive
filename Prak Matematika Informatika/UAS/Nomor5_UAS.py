# Nim  : 1119023
# NAMA : Jedediah Fanuel
# Nomor 5

pembeli_1 = "Aristo"
pembeli_2 = "Levin"
pembeli_3 = "Gerry"
pembeli_4 = "Melvin"
pembeli_5 = "Fedly"
pembeli_6 = "Jeddi"

produk_1 = "Makaroni"
produk_2 = "Emping"
produk_3 = "Kerupuk"
produk_4 = "Pangpang"
produk_5 = "Moring"
produk_6 = "Lays"
produk_7 = "Chitato"
produk_8 = "Cheetos"
produk_9 = "Pilus"
produk_10 = "Tic Tac"

dict_pembeli_product = {

}


def tambah_pembeli(dict_customer, name):
    if not(name in dict_customer.keys()):
        dict_customer[name] = set()

    return dict_customer


def tambah_produk_pembeli(dict_customer, name, produk):
    if name in dict_customer:
        dict_customer[name].add(produk)

    return dict_customer


dict_pembeli_product = tambah_pembeli(dict_pembeli_product, pembeli_1)
dict_pembeli_product = tambah_pembeli(dict_pembeli_product, pembeli_2)
dict_pembeli_product = tambah_pembeli(dict_pembeli_product, pembeli_3)
dict_pembeli_product = tambah_pembeli(dict_pembeli_product, pembeli_4)
dict_pembeli_product = tambah_pembeli(dict_pembeli_product, pembeli_5)
dict_pembeli_product = tambah_pembeli(dict_pembeli_product, pembeli_6)

dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_1, produk_2)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_1, produk_4)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_1, produk_8)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_1, produk_10)

dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_2, produk_1)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_2, produk_4)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_2, produk_5)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_2, produk_7)

dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_4, produk_3)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_4, produk_9)

dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_5, produk_2)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_5, produk_3)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_5, produk_4)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_5, produk_9)

dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_6, produk_2)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_6, produk_3)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_6, produk_5)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_6, produk_6)
dict_pembeli_product = tambah_produk_pembeli(dict_pembeli_product, pembeli_6, produk_10)


def hitung_koefisien_kemiripan_dice(set_1, set_2):
    irisan = set_1 & set_2
    hasil = (2*len(irisan))/(len(set_1)+len(set_2))

    return hasil


def produce_rekomendasi(set_1,set_2):
    selisih = set_2 - set_1
    return selisih


nama_pembeli = input("Masukkan Nama Pembeli : ")

dict_nilai_kesamaan = {}
list_rekomendasi = {}
for daftar in dict_pembeli_product:
    if nama_pembeli != daftar:
        kemiripan = hitung_koefisien_kemiripan_dice(dict_pembeli_product[nama_pembeli],dict_pembeli_product[daftar])
        kemiripan = round(kemiripan, 3)
        dict_nilai_kesamaan[daftar] = kemiripan
        rekomendasi = produce_rekomendasi(dict_pembeli_product[nama_pembeli], dict_pembeli_product[daftar])
        list_baru = []
        for barang in rekomendasi:
            list_baru.append(barang)

        list_rekomendasi[daftar] = list_baru


list_pembeli_lain_terurut_kemiripan = sorted(dict_nilai_kesamaan,key=dict_nilai_kesamaan.__getitem__,reverse=True)
print(list_pembeli_lain_terurut_kemiripan)


print("\nPembeli : " + nama_pembeli)
print("Kandidat rekomendasi produk : ")

for nama in list_pembeli_lain_terurut_kemiripan:
    print(nama + " = ", dict_nilai_kesamaan[nama], ': ', end="")
    join_barang = ", ".join(list_rekomendasi[nama])
    print(join_barang)


for nama in list_pembeli_lain_terurut_kemiripan:
    if len(list_rekomendasi[nama]) > 0:
        print("\nRekomendasi Produk")
        join_barang = ", ".join(list_rekomendasi[nama])
        print(join_barang)
        print("berdasarkan")
        print(nama + " = ", dict_nilai_kesamaan[nama])
        break;
