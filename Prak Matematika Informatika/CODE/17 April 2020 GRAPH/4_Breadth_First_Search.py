# Nim  : 1119023
# Nama : Jedediah Fanuel

# Breadth_First_Search

# Nomor 4
########################################################


def get_terhubung(graph, simpul):
    list_temp = []
    for tetangga in graph[simpul]:
        list_temp.append(tetangga)

    return list_temp


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

masukkan_user = input("Masukkan nama : ")

list_simpul_terhubung = []
list_simpul_terlihat = [masukkan_user]

print("\nsimpul dicapai : ", end="")
print(list_simpul_terhubung)

print("simpul dikenali : ", end="")
print(list_simpul_terlihat)

while len(list_simpul_terlihat) != 0:
    simpul_diproses = list_simpul_terlihat.pop(0)
    print("\ndiproses : ", end="")
    print(simpul_diproses)
    print("simpul dikenali : ", end="")
    print(list_simpul_terlihat)

    list_tetangga = get_terhubung(graph_1, simpul_diproses)
    for tetangga in list_tetangga:
        if not(tetangga in list_simpul_terhubung) and not(tetangga in list_simpul_terlihat):
            list_simpul_terlihat.append(tetangga)

    list_simpul_terhubung.append(simpul_diproses)

    print("simpul dicapai : ", end="")
    print(list_simpul_terhubung)
    print("tetangga ", simpul_diproses, ": ", end="")
    print(list_tetangga)
    print("simpul dikenali (sesudah) : ", end="")
    print(list_simpul_terlihat)

print("\nSimpul-simpul yang dapat dicapai dari", masukkan_user, ":")
print(list_simpul_terhubung)