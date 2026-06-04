class Materia:
    def __init__(self, clave,nombre,creditos,):
        self.clave = clave
        self.nombre = nombre
        self._creditos= creditos
        self.__codigo_interno = 0

        @property
        def __codigo_interno(self):
            return self.__codigo_interno
        
        @codigo_interno.setter
        def codigo_interno(self, valor):
            self.__codigo_interno = valor

        @property
        def _creditos(self):
            return self.creditos
        
        @creditos
        def creditos(self, valor):
            self._creditos = valor

        



        matematias = Materia("MAT01", "Matematicas I",5)
        print (f"Materia: {matematias.clave} {matematias.nombre} ({matematias.creditos} creditos), codigo interno: {matematias.__codigo_interno}")
