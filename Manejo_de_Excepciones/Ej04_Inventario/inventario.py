class ProductoExistenteException(Exception):
    pass

class ProductoNoEncontradoException(Exception):
    pass

class StockInsuficienteException(Exception):
    pass

class Producto:
    def __init__(self, codigo, nombre, precio, stock):
        if precio < 0 or stock < 0:
            raise ValueError("Precio y stock no pueden ser negativos.")
        self.codigo = codigo
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def get_codigo(self):
        return self.codigo

    def get_nombre(self):
        return self.nombre

    def get_stock(self):
        return self.stock
    
    def vender(self, cantidad):
        if cantidad > self.stock:
            raise StockInsuficienteException(f"Stock insuficiente para {self.nombre}. (Stock: {self.stock})")
        self.stock -= cantidad

    def mostrar(self):
        print(f"  - [{self.codigo}] {self.nombre}, Precio: {self.precio}, Stock: {self.stock}")

class Inventario:
    def __init__(self):
        self.productos = []

    def buscar_producto(self, codigo):
        for p in self.productos:
            if p.get_codigo().lower() == codigo.lower():
                return p
        raise ProductoNoEncontradoException(f"Producto con código {codigo} no encontrado.")

    def agregar_producto(self, p):
        try:
            self.buscar_producto(p.get_codigo())
            raise ProductoExistenteException(f"El código {p.get_codigo()} ya existe.")
        except ProductoNoEncontradoException:
            self.productos.append(p)
            print(f"Producto '{p.get_nombre()}' agregado.")

    def vender_producto(self, codigo, cantidad):
        p = self.buscar_producto(codigo)
        p.vender(cantidad)
        print(f"Venta exitosa: {cantidad} de '{p.get_nombre()}'. Stock restante: {p.get_stock()}")

    def mostrar_inventario(self):
        print("--- Inventario Actual ---")
        for p in self.productos:
            p.mostrar()
        print("-------------------------")

if __name__ == "__main__":
    inventario = Inventario()

    try:
        inventario.agregar_producto(Producto("A001", "Laptop", 1500, 10))
        inventario.agregar_producto(Producto("A002", "Mouse", 50, 30))
        inventario.agregar_producto(Producto("A001", "Teclado", 100, 5))
    except (ProductoExistenteException, ValueError) as e:
        print(f"Error al agregar: {e}")
        
    try:
        inventario.agregar_producto(Producto("A003", "Monitor", -200, 5))
    except (ProductoExistenteException, ValueError) as e:
        print(f"Error al agregar: {e}")

    inventario.mostrar_inventario()

    try:
        print("\nIntentando vender A002 (3 unidades)...")
        inventario.vender_producto("A002", 3)
        
        print("\nIntentando vender A001 (20 unidades)...")
        inventario.vender_producto("A001", 20)

    except (ProductoNoEncontradoException, StockInsuficienteException) as e:
        print(f"Error en venta: {e}")
        
    try:
        print("\nIntentando vender A005 (1 unidad)...")
        inventario.vender_producto("A005", 1)

    except (ProductoNoEncontradoException, StockInsuficienteException) as e:
        print(f"Error en venta: {e}")

    inventario.mostrar_inventario()