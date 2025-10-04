class Pasajero:
    def __init__(self, nombre="", edad=0, genero="", nro_habitacion=0, costo_pasaje=0.0):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero
        self.nro_habitacion = nro_habitacion
        self.costo_pasaje = costo_pasaje
    def __pos__(self):
        print("--- Leyendo datos del Pasajero ---")
        self.nombre = input("Nombre: ")
        self.edad = int(input("Edad: "))
        self.genero = input("Género (Hombre/Mujer): ")
        self.nro_habitacion = int(input("Nro. Habitación: "))
        self.costo_pasaje = float(input("Costo del Pasaje: "))
        return self
    def __neg__(self):
        print(f"  - Pasajero: {self.nombre}, Edad: {self.edad}, Género: {self.genero}, Hab: {self.nro_habitacion}, Costo: ${self.costo_pasaje:.2f}")
class Crucero:
    def __init__(self, nombre, pais_origen, pais_destino):
        self.nombre = nombre
        self.pais_origen = pais_origen
        self.pais_destino = pais_destino
        self.pasajeros = []
    def agregar_pasajero(self, pasajero):
        self.pasajeros.append(pasajero)
    def __neg__(self):
        print(f"\n--- Datos del Crucero '{self.nombre}' ---")
        print(f"Ruta: {self.pais_origen} -> {self.pais_destino}")
        print(f"Total de pasajeros: {len(self.pasajeros)}")
        for p in self.pasajeros:
            -p
    def __eq__(self, otro):
        costo_self = sum(p.costo_pasaje for p in self.pasajeros)
        print(f"Costo total de pasajes en '{self.nombre}': ${costo_self:.2f}")
        return True 
    def __add__(self, otro):
        print(f"Comparando cantidad de pasajeros entre '{self.nombre}' y '{otro.nombre}':")
        return len(self.pasajeros) == len(otro.pasajeros)
    def __sub__(self, otro):
        hombres = sum(1 for p in self.pasajeros if p.genero.lower() == 'hombre')
        mujeres = sum(1 for p in self.pasajeros if p.genero.lower() == 'mujer')
        print(f"Estadísticas de género para '{self.nombre}': {hombres} Hombres, {mujeres} Mujeres.")
if __name__ == '__main__':
    p1 = Pasajero("Juan Vargas", 30, "Hombre", 502, 500.0)
    p2 = Pasajero("Martina Vasques", 28, "Mujer", 603, 1000.0)
    p3 = Pasajero("Wilmer Montero", 45, "Hombre", 401, 925.0)
    p4 = Pasajero("Ana Garcia", 35, "Mujer", 503, 500.0)
    p5 = Pasajero("Pedro Jimenez", 50, "Hombre", 402, 925.0)    
    c1 = Crucero("Caribean Dream", "Miami", "Bahamas")
    c1.agregar_pasajero(p1)
    c1.agregar_pasajero(p2)
    c1.agregar_pasajero(p4)    
    c2 = Crucero("Sea Explorer", "Barcelona", "Roma")
    c2.agregar_pasajero(p3)
    c2.agregar_pasajero(p5)
    print("--- Pasajero Nuevo ---")
    p_nuevo = Pasajero()
    +p_nuevo
    c2.agregar_pasajero(p_nuevo)
    -c1
    -c2
    _ = c1 == c2
    resultado_add = c1 + c2
    print(f"¿Tienen la misma cantidad de pasajeros? {'Sí' if resultado_add else 'No'}")    
    c1 - c2