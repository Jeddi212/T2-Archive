# Nim  : 1119023
# NAMA : Jedediah Fanuel
# Nomor 1

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
    pembeli_1: {produk_2, produk_4, produk_8, produk_10},
    pembeli_2: {produk_1, produk_4, produk_5, produk_7},
    pembeli_3: set(),
    pembeli_4: {produk_3, produk_9},
    pembeli_5: {produk_2, produk_3, produk_4, produk_9},
    pembeli_6: {produk_2, produk_4, produk_5, produk_6, produk_10}
}

print("Banyaknya jenis produk yang dibeli pembeli (dan apa saja produknya):")
for customer in dict_pembeli_product:
    jumlah_barang = str(len(dict_pembeli_product[customer]))
    print(customer + " = " + jumlah_barang)

    list_barang = []
    for barang in dict_pembeli_product[customer]:
        list_barang.append(barang)

    if len(list_barang) < 1:
        list_barang.append('-')

    join_barang = ','.join(list_barang)
    print(join_barang)
    print("")