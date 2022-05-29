# Nim  : 1119023
# Nama : Jedediah Fanuel


def hitung_kemiripan_by_jaccard(set_1, set_2):
    irisan = set_1 & set_2
    gabungan = set_1 | set_2
    banyak_irisan = len(irisan)
    banyak_gabungan = len(gabungan)

    return banyak_irisan / banyak_gabungan


transaksi_jordie = ["Dragon Hoops", "Dragon Hoops", "Booked", "The Crossover", "Rebound"]
transaksi_sarah = ["The Oracle Code", "Under The Moon", "Overdrive","The Crossover"]
transaksi_shannon = ["Breaking Glass", "Breaking Glass"]
transaksi_steve = ["Breaking Glass", "Dragon Hoops", "The Crossover", "Nightwalker"]
transaksi_manuel = ["Booked", "Overdrive", "Dragon Hoops", "The Crossover", "The Playbook"]

produk_fav = {
    'Jordie': set(transaksi_jordie),
    'Sarah': set(transaksi_sarah),
    'Shannon': set(transaksi_shannon),
    'Steve': set(transaksi_steve),
    'Manuel': set(transaksi_manuel)
}

for nama in produk_fav:
    print(nama, " : ")
    print(produk_fav[nama])

nama = input("\nMasukkan nama pelanggan yang sedang belanja : ")

set_cari = produk_fav[nama]

for daftar_nama in produk_fav:
    set_daftar = produk_fav[daftar_nama]
    if daftar_nama != nama:
        kemiripan = hitung_kemiripan_by_jaccard(set_cari, set_daftar)
        print("Nilai kemiripan dengan" , daftar_nama , "=", kemiripan)

kemiripan_tertinggi = input("\nMasukkan Nama dengan nilai kemiripan tertinggi,\nuntuk dasar rekomendasi : ")

print("\nBerdasarkan daftar pembelian", kemiripan_tertinggi,
      "\n(sebagai pelanggan yang paling mirip dengan", nama, ",",
      "\nrekomendasi pembelian untuk", nama, "adalah :")

print("\n", produk_fav[kemiripan_tertinggi] - produk_fav[nama])

print("\n(yaitu produk yang telah dibeli", kemiripan_tertinggi, "yang belum perah dibeli", nama, ")")