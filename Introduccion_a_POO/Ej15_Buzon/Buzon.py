class Carta:
    def __init__(self, codigo, remitente, destinatario, descripcion):
        self.codigo = codigo
        self.remitente = remitente
        self.destinatario = destinatario
        self.descripcion = descripcion
    def get_codigo(self):
        return self.codigo
    def get_remitente(self):
        return self.remitente
    def get_destinatario(self):
        return self.destinatario
    def get_descripcion(self):
        return self.descripcion
    def mostrar(self):
        print(f"  - Carta [Código: {self.codigo}, De: {self.remitente}, Para: {self.destinatario}]")
class Buzon:
    def __init__(self, nro):
        self.nro = nro
        self.cartas = []
    def agregar_carta(self, carta):
        self.cartas.append(carta)
    def eliminar_carta_por_codigo(self, codigo):
        carta_a_eliminar = None
        for carta in self.cartas:
            if carta.get_codigo() == codigo:
                carta_a_eliminar = carta
                break
        if carta_a_eliminar:
            self.cartas.remove(carta_a_eliminar)
            return True
        return False
    def get_cartas(self):
        return self.cartas
    def mostrar_contenido(self):
        print(f"--- Contenido del Buzón Nro. {self.nro} ---")
        if not self.cartas:
            print("  (El buzón está vacío)")
        else:
            for carta in self.cartas:
                carta.mostrar()
if __name__ == '__main__':
    buzon1, buzon2, buzon3 = Buzon(1), Buzon(2), Buzon(3)
    
    cartas = [
        Carta("C1", "Ana", "Luis", "Hola, te escribo por el proyecto."),
        Carta("C2", "Luis", "Maria", "Recibí tu correo, gracias."),
        Carta("C3", "Pedro", "Ana", "No olvides la reunión de mañana."),
        Carta("C4", "Maria", "Pedro", "El reporte está listo."),
        Carta("C5", "Juan", "Ana", "Feliz cumpleaños! Espero que tengas un gran día."),
        Carta("C6", "Luis", "Juan", "Confirmado para el viernes."),
        Carta("C7", "Ana", "Maria", "Te envío el documento adjunto."),
        Carta("C8", "Pedro", "Juan", "Necesito tu ayuda con algo urgente."),
        Carta("C9", "Maria", "Luis", "Hablamos más tarde.")
    ]
    buzon1.agregar_carta(cartas[0])
    buzon1.agregar_carta(cartas[2])
    buzon1.agregar_carta(cartas[4])
    buzon2.agregar_carta(cartas[1])
    buzon2.agregar_carta(cartas[3])
    buzon2.agregar_carta(cartas[8])
    buzon3.agregar_carta(cartas[5])
    buzon3.agregar_carta(cartas[6])
    buzon3.agregar_carta(cartas[7])    
    buzones = [buzon1, buzon2, buzon3]
    for b in buzones:
        b.mostrar_contenido()
    destinatario_x = "Ana"
    contador = sum(1 for b in buzones for c in b.get_cartas() if c.get_destinatario() == destinatario_x)
    print(f"\nEl destinatario '{destinatario_x}' recibió {contador} cartas en total.")
    codigo_x = "C5"
    print(f"\nEliminando carta con código '{codigo_x}'...")
    for b in buzones:
        if b.eliminar_carta_por_codigo(codigo_x):
            print(f"Carta eliminada del buzón {b.nro}.")
            break
    buzon1.mostrar_contenido()
    remitente_verificar = "Luis"
    recibio_carta = False
    remitentes_de_luis = []
    for b in buzones:
        for c in b.get_cartas():
            if c.get_destinatario() == remitente_verificar:
                recibio_carta = True
                remitentes_de_luis.append(c.get_remitente())
    if recibio_carta:
        print(f"\nEl remitente '{remitente_verificar}' también ha recibido cartas de: {', '.join(remitentes_de_luis)}.")
    else:
        print(f"\nEl remitente '{remitente_verificar}' no ha recibido ninguna carta.")
    palabra_clave = "reunión"
    print(f"\nBuscando cartas que contengan la palabra '{palabra_clave}':")
    encontrada = False
    for b in buzones:
        for c in b.get_cartas():
            if palabra_clave in c.get_descripcion().lower():
                encontrada = True
                c.mostrar()
                print(f"     Descripción: \"{c.get_descripcion()}\"")
    if not encontrada:
        print("No se encontraron cartas con esa palabra clave.")