class Parada:
    MAX_ADMINS = 10
    MAX_AUTOS = 10
    def __init__(self, nombre_p="Parada Central"):
        self.nombre_p = nombre_p
        self.admins = []
        self.autos = []
        self.nro_admins = 0
        self.nro_autos = 0
    def adicionar(self, p1, p2=None, p3=None):
        if p2 is None and p3 is None:
            if self.nro_admins < self.MAX_ADMINS:
                self.admins.append(p1)
                self.nro_admins += 1
                print(f"Admin '{p1}' añadido.")
            else:
                print("No se pueden añadir más admins.")
        elif p2 is not None and p3 is not None:
            if self.nro_autos < self.MAX_AUTOS:
                self.autos.append([p1, p2, p3])
                self.nro_autos += 1
                print(f"Auto con placa '{p3}' añadido.")
            else:
                print("No se pueden añadir más autos.")
        else:
            print("Argumentos inválidos para adicionar.")
    def mostrar(self):
        print(f"\n--- {self.nombre_p} ---")
        print(f"Administradores ({self.nro_admins}/{self.MAX_ADMINS}):")
        if not self.admins:
            print("  (Ninguno)")
        else:
            for admin in self.admins:
                print(f"  - {admin}")        
        print(f"Autos ({self.nro_autos}/{self.MAX_AUTOS}):")
        if not self.autos:
            print("  (Ninguno)")
        else:
            for auto in self.autos:
                print(f"  - Modelo: {auto[0]}, Conductor: {auto[1]}, Placa: {auto[2]}")
if __name__ == '__main__':
    parada_defecto = Parada()
    parada_nombre = Parada("Parada de San Pedro")
    parada_defecto.adicionar("Luis Garcia")
    parada_defecto.adicionar("Toyota Corolla", "Ana Flores", "2468ABC")
    parada_defecto.adicionar("Nissan Sentra", "Juan Quispe", "1357XYZ")    
    parada_defecto.mostrar()
    parada_nombre.mostrar()