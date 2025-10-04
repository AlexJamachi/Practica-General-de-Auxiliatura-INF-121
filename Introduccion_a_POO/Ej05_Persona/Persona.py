class Persona:
    def __init__(self, nombre, paterno, materno, edad, ci):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad
        self.ci = ci
    def mostrarDatos(self):
        print(f"--- Datos de la Persona ---")
        print(f"Nombre completo: {self.nombre} {self.paterno} {self.materno}")
        print(f"Edad: {self.edad}")
        print(f"CI: {self.ci}")
        print(f"---------------------------")
    def esMayorDeEdad(self):
        return self.edad >= 18
    def modificarEdad(self, nuevaEdad):
        if nuevaEdad > 0:
            self.edad = nuevaEdad
        else:
            print("Edad inválida.")
    def getPaterno(self):
        return self.paterno
if __name__ == '__main__':
    persona1 = Persona("Ana", "Quispe", "Mendoza", 25, "1234567 LP")
    persona2 = Persona("Carlos", "Quispe", "Rojas", 17, "7654321 CB")
    print("Instancias creadas:")
    persona1.mostrarDatos()
    persona2.mostrarDatos()
    print(f"\n¿{persona1.nombre} es mayor de edad? {'Sí' if persona1.esMayorDeEdad() else 'No'}")
    print(f"¿{persona2.nombre} es mayor de edad? {'Sí' if persona2.esMayorDeEdad() else 'No'}")
    print("\nModificando la edad de Carlos a 18...")
    persona2.modificarEdad(18)
    print(f"¿{persona2.nombre} es ahora mayor de edad? {'Sí' if persona2.esMayorDeEdad() else 'No'}")
    persona2.mostrarDatos()
    print("\nVerificando apellidos paternos...")
    if persona1.getPaterno() == persona2.getPaterno():
        print("Las dos personas tienen el mismo apellido paterno.")
    else:
        print("Las dos personas tienen apellidos paternos diferentes.")