# Nim  : 1119023
# Nama : Jedediah Fanuel

# Adjacency_List

# Nomor 3
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

# list_sisi_graph = [
#    {'Max', 'Igor'},
#    {'Max', 'Paulo'},
#    {'Paulo', 'Igor'},
#    {'Paulo', 'Andreas'},
#    {'Paulo', 'Derrick'},
#    {'Paulo', 'Eloy'},
#    {'Igor', 'Andreas'},
#    {'Andreas', 'Derrick'},
#    {'Eloy', 'Bella'},
#    {'Gloria', 'Roxanne'}
# ]

list_sisi = []

for simpul in graph_1:
    for tetangga in graph_1[simpul]:
        set_temp = {simpul, tetangga}
        if not (set_temp in list_sisi):
            list_sisi.append(set_temp)

print("Sisi-sisi dalam graph : ")
print(list_sisi)

print("\nBanyak sisi pada graph : ", end="")
print(len(list_sisi))
