class Pelicula:
    def __init__(self, titulo, genero, precio_butaca):
        self.titulo = titulo
        self.genero = genero
        self.precio_butaca = precio_butaca    
    def __str__(self):
        return f"'{self.titulo}' (Género: {self.genero}) - Precio: Bs. {self.precio_butaca:.2f}"
class Cine:
    def __init__(self, nombre, direccion):
        self.nombre = nombre
        self.direccion = direccion
        self.cartelera = []
    def agregar_pelicula(self, pelicula):
        self.cartelera.append(pelicula)
    def mostrar_cartelera(self):
        print(f"\n--- Cartelera de {self.nombre} ---")
        for i, pelicula in enumerate(self.cartelera):
            print(f"{i+1}. {pelicula}")
    def mostrar_peliculas(self, genero=None, indice=None):
        if genero:
            print(f"\n--- Películas del género '{genero}' ---")
            encontradas = [p for p in self.cartelera if p.genero.lower() == genero.lower()]
            if not encontradas:
                print("No hay películas de ese género.")
            for p in encontradas:
                print(f"- {p.titulo}")
        elif indice is not None:
            print(f"\n--- Mostrando la película en la posición {indice} ---")
            if 0 < indice <= len(self.cartelera):
                print(self.cartelera[indice-1])
            else:
                print("Índice fuera de rango.")
    def __pos__(self):
        print("\nIncrementando precio de todas las butacas en Bs. 5...")
        for pelicula in self.cartelera:
            pelicula.precio_butaca += 5
        return self
    def ordenar_peliculas_alfabeticamente(self):
        print("\nOrdenando cartelera alfabéticamente por título...")
        self.cartelera.sort(key=lambda p: p.titulo)
if __name__ == '__main__':
    mi_cine = Cine("Cine Center", "Av. Arce 123")
    mi_cine.agregar_pelicula(Pelicula("Dune: Parte Dos", "Ciencia Ficción", 40.0))
    mi_cine.agregar_pelicula(Pelicula("El Secreto de sus Ojos", "Drama", 35.0))
    mi_cine.agregar_pelicula(Pelicula("¿Qué Pasó Ayer?", "Comedia", 30.0))
    mi_cine.agregar_pelicula(Pelicula("Super Mario Bros: La película", "Comedia", 35.0))
    mi_cine.agregar_pelicula(Pelicula("Oppenheimer", "Drama", 45.0))    
    print("Estado inicial del cine:")
    mi_cine.mostrar_cartelera()
    mi_cine.mostrar_peliculas(genero="Comedia")
    mi_cine.mostrar_peliculas(indice=1)
    +mi_cine
    mi_cine.mostrar_cartelera()
    mi_cine.ordenar_peliculas_alfabeticamente()
    mi_cine.mostrar_cartelera()