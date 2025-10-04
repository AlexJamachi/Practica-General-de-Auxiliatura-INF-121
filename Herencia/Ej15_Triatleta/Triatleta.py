class Nadador:
    def __init__(self, estilo_natacion):
        self.estilo_natacion = estilo_natacion
    def nadar(self):
        print(f"Nadando estilo {self.estilo_natacion}.")
class Ciclista:
    def __init__(self, tipo_bicicleta):
        self.tipo_bicicleta = tipo_bicicleta
    def pedalear(self):
        print(f"Pedaleando en bicicleta tipo {self.tipo_bicicleta}.")
class Corredor:
    def __init__(self, distancia_preferida):
        self.distancia_preferida = distancia_preferida
    def correr(self):
        print(f"Corriendo una distancia de {self.distancia_preferida} km.")
class Triatleta(Nadador, Ciclista, Corredor):
    def __init__(self, nombre, estilo_natacion, tipo_bicicleta, distancia_preferida):
        self.nombre = nombre
        Nadador.__init__(self, estilo_natacion)
        Ciclista.__init__(self, tipo_bicicleta)
        Corredor.__init__(self, distancia_preferida)
    def competir(self):
        print(f"\n¡El triatleta {self.nombre} comienza la competencia!")
        self.nadar()
        self.pedalear()
        self.correr()
        print(f"¡{self.nombre} ha completado el triatlón!")

if __name__ == '__main__':
    triatleta1 = Triatleta(
        nombre="Alex",
        estilo_natacion="crol",
        tipo_bicicleta="de ruta",
        distancia_preferida=10
    )
    triatleta1.competir()