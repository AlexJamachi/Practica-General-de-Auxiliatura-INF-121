class Vehiculo:
    def __init__(self, conductor, placa, id_vehiculo):
        self._conductor = conductor
        self._placa = placa
        self._id = id_vehiculo
    def mostrar_placa_y_conductor(self):
        print(f"Vehículo con Placa: {self._placa}, Conductor: {self._conductor}")
    def cambiar_conductor(self, nuevo_conductor):
        print(f"Cambiando conductor de {self._conductor} a {nuevo_conductor} para el vehículo {self._placa}.")
        self._conductor = nuevo_conductor
class Bus(Vehiculo):
    def __init__(self, conductor, placa, id_vehiculo, capacidad, sindicato):
        super().__init__(conductor, placa, id_vehiculo)
        self.capacidad = capacidad
        self.sindicato = sindicato
class Auto(Vehiculo):
    def __init__(self, conductor, placa, id_vehiculo, caballos_fuerza, descapotable):
        super().__init__(conductor, placa, id_vehiculo)
        self.caballos_fuerza = caballos_fuerza
        self.descapotable = descapotable
class Moto(Vehiculo):
    def __init__(self, conductor, placa, id_vehiculo, cilindrada, tiene_casco):
        super().__init__(conductor, placa, id_vehiculo)
        self.cilindrada = cilindrada
        self.tiene_casco = tiene_casco
if __name__ == '__main__':
    bus = Bus("Mario Luna", "1234BUS", 1, 40, "Sindicato 1ro de Mayo")
    auto = Auto("Ana Soliz", "5678CAR", 2, 150, True)
    moto = Moto("Pedro Roca", "9012BIK", 3, 250, True)   
    vehiculos = [bus, auto, moto]   
    print("--- Mostrando Placa y Conductor de cada vehículo ---")
    for v in vehiculos:
        v.mostrar_placa_y_conductor()        
    print("\n--- Cambiando conductor del Auto ---")
    auto.cambiar_conductor("Carlos Vera")
    auto.mostrar_placa_y_conductor()