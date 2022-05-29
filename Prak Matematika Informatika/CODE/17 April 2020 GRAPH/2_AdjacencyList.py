# Nim  : 1119023
# Nama : Jedediah Fanuel

# Adjacency_List

# Nomor 2
########################################################
graph_1 = {
    'Max': ['Igor', 'Paulo'],
    'Igor': ['Max', 'Andreas', 'Paulo'],
    'Andreas': ['Igor', 'Paulo', 'Derrick'],
    'Derrick': ['Andreas', 'Paulo'],
    'Paulo': ['Max', 'Igor', 'Andreas', 'Derrick', 'Eloy'],
    'Eloy': ['Paulo', 'Bella'],
    'Bella': ['Eloy'],
    'Gloria': ['Roxanne'],
    'Roxanne': ['Gloria']
}

print("Nomor 2.A")


def get_terhubung(graph, simpul):
    list_temp = []
    for tetangga in graph[simpul]:
        list_temp.append(tetangga)

    return list_temp


list_andreas = get_terhubung(graph_1, 'Andreas')
print("List Andreas : ", end="")
print(list_andreas)


print("\nNomor 2.B")


def is_terhubung(graph, simpul_1, simpul_2):
    if simpul_1 in graph[simpul_2]:
        terhubung = True
    else:
        terhubung = False

    return terhubung


igor_dan_gloria = is_terhubung(graph_1, 'Igor', 'Gloria')
print("Igor & Gloria, Apakah terhubung : ", end="")
print(igor_dan_gloria)

igor_dan_max = is_terhubung(graph_1, 'Igor', 'Max')
print("Igor & Max, Apakah terhubung : ", end="")
print(igor_dan_max)


print("\nNomor 2.C")

masukkan_1 = input("Masukkan orang ke-1 : ")
masukkan_2 = input("Mauskkan orang ke-2 : ")


print("\nNomor 2.D")
list_1 = get_terhubung(graph_1, masukkan_1)
print("List", masukkan_1, ": ", end="")
print(list_1)

list_2 = get_terhubung(graph_1, masukkan_2)
print("List", masukkan_2, ": ", end="")
print(list_2)


print("\nNomor 2.E")
cek_terhubung = is_terhubung(graph_1, masukkan_1, masukkan_2)
print("Apakah", masukkan_1, "dan", masukkan_2, "terhubung : ")
print(cek_terhubung)
