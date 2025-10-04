class Politico:
    def __init__(self, profesion, anios_exp):
        self.profesion = profesion
        self.anios_exp = anios_exp
class Partido:
    def __init__(self, nombre_partido, rol_en_partido="Miembro"):
        self.nombre_partido = nombre_partido
        self.rol_en_partido = rol_en_partido
class Presidente(Politico, Partido):
    def __init__(self, nombre, apellido, profesion, anios_exp, nombre_partido, rol_en_partido="Candidato Presidencial"):
        Politico.__init__(self, profesion, anios_exp)
        Partido.__init__(self, nombre_partido, rol_en_partido)
        self.nombre = nombre
        self.apellido = apellido
    def mostrar(self):
        print(f"--- Presidente: {self.nombre} {self.apellido} ---")
        print(f"Profesión: {self.profesion}")
        print(f"Años de Experiencia: {self.anios_exp}")
        print(f"Partido Político: {self.nombre_partido}")
        print(f"Rol en el Partido: {self.rol_en_partido}")
        print("-" * (20 + len(self.nombre) + len(self.apellido)))
if __name__ == '__main__':
    presidentes = [
        Presidente("Luis", "Arce", "Economista", 20, "MAS-IPSP"),
        Presidente("Carlos", "Mesa", "Historiador", 25, "Comunidad Ciudadana"),
        Presidente("Jorge", "Quiroga", "Ingeniero", 30, "Acción Democrática Nacionalista")
    ]
    print("--- Listado de Presidentes ---")
    for p in presidentes:
        p.mostrar()
    nombre_a_buscar = "Carlos"
    print(f"\nBuscando al presidente con nombre '{nombre_a_buscar}'...")
    encontrado = False
    for p in presidentes:
        if p.nombre == nombre_a_buscar:
            print(f"Presidente encontrado: {p.nombre} {p.apellido}")
            print(f"  -> Profesión: {p.profesion}")
            print(f"  -> Partido Político: {p.nombre_partido}")
            encontrado = True
            break
    if not encontrado:
        print(f"No se encontró un presidente con el nombre '{nombre_a_buscar}'.")