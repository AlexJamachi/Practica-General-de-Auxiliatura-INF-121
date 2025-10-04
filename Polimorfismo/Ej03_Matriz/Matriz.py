class Matriz:
    DIMENSION = 10
    def __init__(self, valores=None):
        self.matriz = [[0.0] * self.DIMENSION for _ in range(self.DIMENSION)]
        if valores is None:
            for i in range(self.DIMENSION):
                self.matriz[i][i] = 1.0
        else:
            if (len(valores) == self.DIMENSION and 
                all(len(row) == self.DIMENSION for row in valores)):
                self.matriz = valores
            else:
                print("Error: Las dimensiones de los valores proporcionados no son 10x10.")
    def sumar(self, otra_matriz):
        nueva_matriz_valores = [[0.0] * self.DIMENSION for _ in range(self.DIMENSION)]
        for i in range(self.DIMENSION):
            for j in range(self.DIMENSION):
                nueva_matriz_valores[i][j] = self.matriz[i][j] + otra_matriz.matriz[i][j]
        return Matriz(nueva_matriz_valores)
    def restar(self, otra_matriz):
        nueva_matriz_valores = [[0.0] * self.DIMENSION for _ in range(self.DIMENSION)]
        for i in range(self.DIMENSION):
            for j in range(self.DIMENSION):
                nueva_matriz_valores[i][j] = self.matriz[i][j] - otra_matriz.matriz[i][j]
        return Matriz(nueva_matriz_valores)
    def es_igual(self, otra_matriz):
        for i in range(self.DIMENSION):
            for j in range(self.DIMENSION):
                if self.matriz[i][j] != otra_matriz.matriz[i][j]:
                    return False
        return True
    def mostrar(self):
        for fila in self.matriz:
            print(" ".join(f"{valor:5.1f}" for valor in fila))
        print("-" * (self.DIMENSION * 6))
if __name__ == '__main__':
    matriz_identidad = Matriz()
    print("Matriz Identidad (A):")
    matriz_identidad.mostrar()
    valores_b = [[float(i + j) for j in range(10)] for i in range(10)]
    matriz_b = Matriz(valores_b)
    print("Matriz B:")
    matriz_b.mostrar()
    matriz_c = matriz_identidad.sumar(matriz_b)
    print("Matriz C (A + B):")
    matriz_c.mostrar()
    print(f"¿La matriz A es igual a la B? {'Sí' if matriz_identidad.es_igual(matriz_b) else 'No'}")
    matriz_identidad_copia = Matriz()
    print(f"¿La matriz A es igual a su copia? {'Sí' if matriz_identidad.es_igual(matriz_identidad_copia) else 'No'}")