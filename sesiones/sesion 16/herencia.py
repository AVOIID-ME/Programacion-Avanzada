class Abuelo:
    def __init__(self, name):
        self.nombreAbuelo = name

    def saludo(self):
        print(self.nombreAbuelo)

class Padre(Abuelo):
    def __init__(self, nombre, abuelo):
        Abuelo.__init__(self,abuelo)
        self.nombrePadre = nombre

    def saludo(self):
        print(self.nombrePadre)

class Madre(Abuelo):
    def __init__(self, nombre, abuelo):
        Abuelo.__init__(self,abuelo)
        self.nombreMadre = nombre

    def saludo(self):
        print(self.nombreMadre)

class Hijo(Padre, Madre):
    def __init__(self, nombre, padre, madre, abuelo):
        Padre.__init__(self,padre, abuelo)
        Madre.__init__(self,madre, abuelo)
        self.nombreHijo = nombre

    def saludo(self):
        print(self.nombreHijo)

    def identificarPadres(self):
        print(f"Mi padre es {self.nombrePadre} y mi madre es {self.nombreMadre}.")
        print(f"Mi abuelo es {self.nombreAbuelo}.")

if __name__ == '__main__':
    abuelo1 = Abuelo("Sergio")
    padre1 = Padre("Fernando", abuelo1.nombreAbuelo)
    madre1 = Madre("Yessica", abuelo1.nombreAbuelo)
    hijo1 = Hijo("Fer", padre1.nombrePadre, madre1.nombreMadre, abuelo1.nombreAbuelo)

    abuelo1.saludo()
    padre1.saludo()
    madre1.saludo()
    hijo1.saludo()
    hijo1.identificarPadres()




    