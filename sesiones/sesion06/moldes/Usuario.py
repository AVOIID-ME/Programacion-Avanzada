class Usuario:

    def __init__(self, nombre, edad, ubicacion):
        self.nombre = nombre
        self.edad = edad
        self.__ubicacion = ubicacion

    @property
    def ubicacion(self):
        return self.__ubicacion
    
    @ubicacion.setter
    def ubicacion(self, nuevaUbicacion):
        self.__ubicacion = nuevaUbicacion

