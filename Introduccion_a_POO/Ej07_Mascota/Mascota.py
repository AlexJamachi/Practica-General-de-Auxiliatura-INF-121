class Mascota:
    def __init__(self, nombre, tipo, energia=50):
        self.nombre = nombre
        self.tipo = tipo
        self.energia = max(0, min(100, energia))
    def alimentar(self):
        print(f"Alimentando a {self.nombre}...")
        self.energia = min(100, self.energia + 20)
        self.mostrarEnergia()
    def jugar(self):
        print(f"Jugando con {self.nombre}...")
        self.energia = max(0, self.energia - 15)
        self.mostrarEnergia()
    def mostrarEnergia(self):
        print(f"Energía de {self.nombre}: {self.energia}/100")
if __name__ == '__main__':
    mascota1 = Mascota("Rocky", "Perro", 60)
    mascota2 = Mascota("Mishi", "Gato", 40)
    print("--- Simulación de Mascotas ---\n")
    mascota1.mostrarEnergia()
    mascota2.mostrarEnergia()
    print("")
    mascota1.jugar()
    mascota2.alimentar()
    print("")
    mascota1.jugar()
    mascota2.jugar()
    print("")
    mascota1.alimentar()
    mascota2.alimentar()
    print("\n--- Fin de la Simulación ---")