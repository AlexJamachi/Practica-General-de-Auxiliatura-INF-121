class Bus:
    COSTO_PASAJE = 1.50
    def __init__(self, capacidad_total):
        self.capacidad_total = capacidad_total
        self.pasajeros_a_bordo = 0
        self.dinero_acumulado = 0.0
    def subir_pasajeros(self, cantidad):
        asientos_libres = self.capacidad_total - self.pasajeros_a_bordo
        pasajeros_que_suben = min(cantidad, asientos_libres)
        if pasajeros_que_suben > 0:
            self.pasajeros_a_bordo += pasajeros_que_suben
            print(f"Han subido {pasajeros_que_suben} pasajeros.")
            self.cobrar_pasajes(pasajeros_que_suben)
        else:
            print("No hay asientos disponibles o la cantidad es inválida.")
    def cobrar_pasajes(self, cantidad):
        recaudado = cantidad * self.COSTO_PASAJE
        self.dinero_acumulado += recaudado
        print(f"Se han cobrado Bs. {recaudado:.2f} por los nuevos pasajeros.")
    def mostrar_asientos_disponibles(self):
        disponibles = self.capacidad_total - self.pasajeros_a_bordo
        print(f"Quedan {disponibles} asientos disponibles en el bus.")
    def mostrar_estado_general(self):
        print("\n--- Estado del Bus ---")
        print(f"Pasajeros a bordo: {self.pasajeros_a_bordo}")
        self.mostrar_asientos_disponibles()
        print(f"Dinero acumulado: Bs. {self.dinero_acumulado:.2f}")
        print("----------------------\n")
if __name__ == '__main__':
    mi_bus = Bus(40)
    mi_bus.mostrar_estado_general()
    mi_bus.subir_pasajeros(15)
    mi_bus.mostrar_estado_general()
    mi_bus.subir_pasajeros(30)
    mi_bus.mostrar_estado_general()