# Nim  : 1119023
# Nama : Jedediah Fanuel

# Adjacency_List

# Nomor 1
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

list_simpul = []


def print_list(graph):
    for simpul in graph:
        print(simpul)
        list_simpul.append(simpul)


print_list(graph_1)
