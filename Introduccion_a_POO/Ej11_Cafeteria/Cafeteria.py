class Pedido:
    def __init__(self, numero, estado):
        self._numero = numero
        self._estado = estado
        print("Objeto Pedido creado.")
    def __del__(self):
        print("Objeto Pedido destruido.")
    def get_numero(self):
        return self._numero
    def set_numero(self, numero):
        self._numero = numero
    def get_estado(self):
        return self._estado
    def set_estado(self, estado):
        self._estado = estado
    def mostrar(self):
        print(f"--- Pedido ---")
        print(f"Número: {self._numero}")
        print(f"Estado: {self._estado}")
        print(f"--------------")
class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio
        print("Objeto Producto creado.")
    def __del__(self):
        print("Objeto Producto destruido.")
    def get_nombre(self):
        return self._nombre
    def set_nombre(self, nombre):
        self._nombre = nombre
    def get_precio(self):
        return self._precio
    def set_precio(self, precio):
        self._precio = precio
    def mostrar(self):
        print(f"--- Producto ---")
        print(f"Nombre: {self._nombre}")
        print(f"Precio: {self._precio}")
        print(f"----------------")
if __name__ == '__main__':
    print("Creando objetos...")
    pedido_uno = Pedido(101, "registrado")
    producto_uno = Producto("Café Americano", 12.50)
    print("\nMostrando datos de los objetos:")
    pedido_uno.mostrar()
    producto_uno.mostrar()
    print("\nModificando datos...")
    pedido_uno.set_estado("preparado")
    producto_uno.set_precio(15.00)
    print("\nMostrando datos actualizados:")
    pedido_uno.mostrar()
    producto_uno.mostrar()
    print("\nFinalizando programa...")