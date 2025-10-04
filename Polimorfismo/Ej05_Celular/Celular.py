class Celular:
    def __init__(self, nro_tel, dueno, espacio_gb, ram_gb, nro_app):
        self.nro_tel = nro_tel
        self.dueno = dueno
        self.espacio_gb = espacio_gb
        self.ram_gb = ram_gb
        self.nro_app = nro_app
    def mostrar(self):
        print(f"--- Celular de {self.dueno} ---")
        print(f"Número: {self.nro_tel}")
        print(f"Espacio: {self.espacio_gb} GB")
        print(f"RAM: {self.ram_gb} GB")
        print(f"Nro. de Apps: {self.nro_app}")
        print("-------------------------" + "-" * len(self.dueno))
    def __add__(self, valor):
        self.nro_app += 10
        return self
    def __sub__(self, valor):
        self.espacio_gb -= 5
        return self
if __name__ == '__main__':
    mi_celular = Celular("77712345", "Juan Perez", 128.0, 8.0, 50)
    print("--- Estado Inicial ---")
    mi_celular.mostrar()
    print("\n>>> Aplicando operador para aumentar apps...")
    mi_celular = mi_celular + 1
    print("\n--- Estado Intermedio ---")
    mi_celular.mostrar()
    print("\n>>> Aplicando operador para disminuir espacio...")
    mi_celular = mi_celular - 1
    print("\n--- Estado Final ---")
    mi_celular.mostrar()