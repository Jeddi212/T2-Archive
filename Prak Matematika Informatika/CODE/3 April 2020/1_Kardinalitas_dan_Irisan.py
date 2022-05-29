# Nim  : 1119023
# Nama : Jedediah Fanuel


def hitung_kemiripan_by_kardinalitas(set_1, set_2):
    irisan = set_1 & set_2
    return len(irisan)


set1 = {6, 7, 8}
set2 = {1, 6, 7}
kemiripan = hitung_kemiripan_by_kardinalitas(set1, set2)

print(kemiripan)
print("---------\n")

musik_jonathan = {'electronica', 'rap', 'industrial', 'rock', 'funk'}
musik_anthony = {'funk', 'alternative', 'rap'}
musik_josh = {'alternative', 'funk', 'rap'}
musik_michael = {'jazz', 'electronica'}
musik_brian = {'rock', 'funk', 'industrial', 'rap'}

print("Kesamaan musik Jonathan dan Anthony")
print(hitung_kemiripan_by_kardinalitas(musik_jonathan, musik_anthony))
print("yaitu:")
print(musik_jonathan & musik_anthony, "\n")

print("Kesamaan musik Jonathan dan Josh")
print(hitung_kemiripan_by_kardinalitas(musik_jonathan, musik_josh))
print("yaitu:")
print(musik_jonathan & musik_josh, "\n")

print("Kesamaan musik Jonathan dan Michael")
print(hitung_kemiripan_by_kardinalitas(musik_jonathan, musik_michael))
print("yaitu:")
print(musik_jonathan & musik_michael, "\n")

print("Kesamaan musik Jonathan dan Brian")
print(hitung_kemiripan_by_kardinalitas(musik_jonathan, musik_brian))
print("yaitu:")
print(musik_jonathan & musik_brian, "\n")

print("___\n")

print("Kesamaan musik Josh dan Michael")
print(hitung_kemiripan_by_kardinalitas(musik_josh, musik_michael))
