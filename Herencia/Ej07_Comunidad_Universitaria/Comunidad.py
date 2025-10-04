class Persona:
    def __init__(self, nombre, paterno, materno, edad):
        self._nombre = nombre
        self._paterno = paterno
        self._materno = materno
        self._edad = edad
    def mostrar(self):
        print(f"Nombre Completo: {self._nombre} {self._paterno} {self._materno}")
        print(f"Edad: {self._edad}")
    def get_edad(self):
        return self._edad
class Estudiante(Persona):
    def __init__(self, nombre, paterno, materno, edad, ru, matricula):
        super().__init__(nombre, paterno, materno, edad)
        self._ru = ru
        self._matricula = matricula
    def mostrar(self):
        print("--- Datos del Estudiante ---")
        super().mostrar()
        print(f"RU: {self._ru}")
        print(f"Matrícula: {self._matricula}")
        print("--------------------------")
    def modificar_edad(self, nueva_edad):
        if nueva_edad > 0:
            self._edad = nueva_edad
class Docente(Persona):
    def __init__(self, nombre, paterno, materno, edad, sueldo, reg_profesional):
        super().__init__(nombre, paterno, materno, edad)
        self._sueldo = sueldo
        self._reg_profesional = reg_profesional
    def mostrar(self):
        print("--- Datos del Docente ---")
        super().mostrar()
        print(f"Sueldo: {self._sueldo}")
        print(f"Registro Profesional: {self._reg_profesional}")
        print("-------------------------")
def promedio_edad_estudiantes(lista_estudiantes):
    if not lista_estudiantes:
        return 0
    total_edades = sum(est.get_edad() for est in lista_estudiantes)
    return total_edades / len(lista_estudiantes)
if __name__ == '__main__':
    e1 = Estudiante("Ana", "Quispe", "Sosa", 20, "200012345", "MAT-123")
    e2 = Estudiante("Juan", "Perez", "Lara", 22, "200054321", "FIS-456")
    docente = Docente("Carlos", "Rojas", "Mendoza", 45, 8500.0, "PROF-789")
    e1.mostrar()
    e2.mostrar()
    docente.mostrar()    
    estudiantes = [e1, e2]
    promedio = promedio_edad_estudiantes(estudiantes)
    print(f"\nEl promedio de edad de los estudiantes es: {promedio:.2f} años.")    
    print(f"\nModificando edad de {e1._nombre} a 21...")
    e1.modificar_edad(21)
    e1.mostrar()    
    print("\nVerificando si algún estudiante tiene la misma edad que el docente...")
    for est in estudiantes:
        if est.get_edad() == docente.get_edad():
            print(f"El estudiante {est._nombre} tiene la misma edad que el docente.")
        else:
            print(f"El estudiante {est._nombre} NO tiene la misma edad que el docente.")