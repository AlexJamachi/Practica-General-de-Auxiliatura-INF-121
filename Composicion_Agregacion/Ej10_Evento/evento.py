class Persona:
    def __init__(self, nombre, apellido, edad, ci):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.ci = ci

    def get_nombre_completo(self):
        return f"{self.nombre} {self.apellido}"

    def get_ci(self):
        return self.ci

    def get_edad(self):
        return self.edad

class Speaker(Persona):
    def __init__(self, nombre, apellido, edad, ci, especialidad):
        super().__init__(nombre, apellido, edad, ci)
        self.especialidad = especialidad

    def mostrar(self):
        print(f"  Speaker: {self.get_nombre_completo()} (Espec: {self.especialidad})")

class Participante(Persona):
    def __init__(self, nombre, apellido, edad, ci, nro_ticket):
        super().__init__(nombre, apellido, edad, ci)
        self.nro_ticket = nro_ticket

    def mostrar(self):
        print(f"    - Participante: {self.get_nombre_completo()} (Ticket: {self.nro_ticket})")

class Charla:
    def __init__(self, lugar, nombre_charla, speaker):
        self.lugar = lugar
        self.nombre_charla = nombre_charla
        self.S = speaker
        self.P = []
        self.np = 0

    def add_participante(self, p):
        if self.np < 50:
            self.P.append(p)
            self.np += 1
        else:
            print("Charla llena, no se puede agregar más participantes.")

    def get_ci_speaker(self):
        return self.S.get_ci()

    def get_nombre_charla(self):
        return self.nombre_charla

    def get_nombre_completo_speaker(self):
        return self.S.get_nombre_completo()

    def get_participantes(self):
        return self.P

    def get_np(self):
        return self.np

    def mostrar(self):
        print(f"\n  Charla: {self.nombre_charla} (Lugar: {self.lugar})")
        self.S.mostrar()
        print(f"  Participantes ({self.np}):")
        for p in self.P:
            p.mostrar()

class Evento:
    def __init__(self, nombre):
        self.nombre = nombre
        self.C = []
        self.nc = 0

    def add_charla(self, c):
        if self.nc < 50:
            self.C.append(c)
            self.nc += 1

    def edad_promedio_participantes(self):
        total_edad = 0
        total_participantes = 0
        for c in self.C:
            for p in c.get_participantes():
                total_edad += p.get_edad()
                total_participantes += 1
        return (total_edad / total_participantes) if total_participantes > 0 else 0

    def buscar_persona(self, nombre, apellido):
        nombre_completo = f"{nombre} {apellido}"
        encontrado = False
        for c in self.C:
            if c.get_nombre_completo_speaker().lower() == nombre_completo.lower():
                print(f"{nombre_completo} es Speaker en la charla: {c.get_nombre_charla()}")
                encontrado = True
            for p in c.get_participantes():
                if p.get_nombre_completo().lower() == nombre_completo.lower():
                    print(f"{nombre_completo} es Participante en la charla: {c.get_nombre_charla()}")
                    encontrado = True
        if not encontrado:
            print(f"{nombre_completo} no se encuentra en el evento.")

    def eliminar_charlas_speaker(self, ci):
        charlas_filtradas = []
        for c in self.C:
            if c.get_ci_speaker() == ci:
                print(f"Eliminando charla: {c.get_nombre_charla()} (Speaker CI: {ci})")
                self.nc -= 1
            else:
                charlas_filtradas.append(c)
        self.C = charlas_filtradas

    def ordenar_charlas_por_participantes(self):
        self.C.sort(key=lambda charla: charla.get_np())
        print("Charlas ordenadas por número de participantes (ascendente):")
        self.mostrar_evento()

    def mostrar_evento(self):
        print(f"===== Evento: {self.nombre} ({self.nc} Charlas) =====")
        for c in self.C:
            c.mostrar()
        print("=========================================")

if __name__ == "__main__":
    tech_conf = Evento("Tech Conference 2025")

    s1 = Speaker("Ana", "Gomez", 35, 123, "IA")
    s2 = Speaker("Luis", "Rojas", 42, 456, "Ciberseguridad")

    c1 = Charla("Audit. A", "IA Avanzada", s1)
    c2 = Charla("Audit. B", "Defensa Activa", s2)
    c3 = Charla("Audit. A", "IA en Negocios", s1)

    c1.add_participante(Participante("Juan", "Perez", 20, 111, 101))
    c1.add_participante(Participante("Maria", "Luna", 22, 222, 102))
    
    c2.add_participante(Participante("Carlos", "Soliz", 30, 333, 103))

    tech_conf.add_charla(c1)
    tech_conf.add_charla(c2)
    tech_conf.add_charla(c3)

    tech_conf.mostrar_evento()

    print(f"Edad promedio: {tech_conf.edad_promedio_participantes()}")

    tech_conf.buscar_persona("Maria", "Luna")
    tech_conf.buscar_persona("Ana", "Gomez")

    print("\n--- Eliminando charlas del Speaker 123 ---")
    tech_conf.eliminar_charlas_speaker(123)
    tech_conf.mostrar_evento()

    tech_conf.add_charla(c1)
    print("\n--- Ordenando charlas ---")
    tech_conf.ordenar_charlas_por_participantes()