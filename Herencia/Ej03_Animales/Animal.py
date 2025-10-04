class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    def desplazarse(self):
        print(f"{self.nombre} se está moviendo.")
class Leon(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)
    def desplazarse(self):
        print(f"El león {self.nombre} está caminando sobre sus cuatro patas.")
class Pinguino(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)
    def desplazarse(self):
        print(f"El pingüino {self.nombre} está nadando ágilmente en el agua.")
class Canguro(Animal):
    def __init__(self, nombre, edad):
        super().__init__(nombre, edad)
    def desplazarse(self):
        print(f"El canguro {self.nombre} está saltando por la pradera.")
if __name__ == '__main__':
    animales = [
        Leon("Simba", 5),
        Pinguino("Kowalski", 3),
        Canguro("Jack", 4)
    ]    
    print("--- Demostración de desplazamiento polimórfico ---")
    for animal in animales:
        animal.desplazarse()