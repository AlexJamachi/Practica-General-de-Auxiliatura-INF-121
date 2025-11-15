class DatosInvalidosException(Exception):
    pass

class ContactoNoEncontradoException(Exception):
    pass

class Contacto:
    def __init__(self, nombre, telefono):
        if not nombre or not nombre.strip():
            raise DatosInvalidosException("El nombre no puede estar vacío.")
        if not telefono or not telefono.strip():
            raise DatosInvalidosException("El teléfono no puede estar vacío.")
        self.nombre = nombre
        self.telefono = telefono

    def get_nombre(self):
        return self.nombre

    def mostrar(self):
        print(f"  - Contacto: {self.nombre}, Tel: {self.telefono}")

class Agenda:
    def __init__(self):
        self.contactos = []

    def agregar_contacto(self, nombre, telefono):
        nuevo = Contacto(nombre, telefono)
        self.contactos.append(nuevo)
        print(f"Contacto '{nombre}' agregado.")

    def buscar_contacto(self, nombre):
        for c in self.contactos:
            if c.get_nombre().lower() == nombre.lower():
                return c
        raise ContactoNoEncontradoException(f"El contacto '{nombre}' no existe en la agenda.")

    def mostrar_agenda(self):
        print("Contactos en la Agenda:")
        for c in self.contactos:
            c.mostrar()

if __name__ == "__main__":
    mi_agenda = Agenda()

    try:
        mi_agenda.agregar_contacto("Juan Perez", "77712345")
        mi_agenda.agregar_contacto("Ana Gomez", "66654321")
        mi_agenda.agregar_contacto("Luis", "") 
    except DatosInvalidosException as e:
        print(f"Error al agregar: {e}")
        
    try:
        mi_agenda.agregar_contacto("", "123456") 
    except DatosInvalidosException as e:
        print(f"Error al agregar: {e}")

    print()
    mi_agenda.mostrar_agenda()
    print()

    try:
        print("Buscando a 'Ana Gomez'...")
        c = mi_agenda.buscar_contacto("Ana Gomez")
        c.mostrar()
    except ContactoNoEncontradoException as e:
        print(e)

    try:
        print("\nBuscando a 'Pedro'...")
        c = mi_agenda.buscar_contacto("Pedro")
        c.mostrar()
    except ContactoNoEncontradoException as e:
        print(e)