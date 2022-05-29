# Nama  :   Jedediah Fanuel
# Nim   :   1119023

def printNormal(list):
    print("Tanpa nomor urut : ")
    for nama in list:
        print(nama)

def printOut(list):
    print("Dengan nomor urut : ")
    for idx, nama in enumerate(list):
        print("No.", idx+1, " ", nama)

if __name__ == '__main__':

    daftar_mahasiswa = ["Jeddi", "Ojan", "Julian"]

    printNormal(daftar_mahasiswa)

    print("")

    printOut(daftar_mahasiswa)
