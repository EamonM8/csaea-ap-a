from unicodedata import name


animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]

# PROCEDURE 1
def check_animal(name):
    for n in animals:
        if n == name:
            print(name, "is in the list")
            return
    print(name, "is not in the list")

check_animal("cat")
check_animal("penguin")

# PROCEDURE 2
