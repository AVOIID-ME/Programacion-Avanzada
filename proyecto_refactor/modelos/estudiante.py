class Estudiante:
    """Alumno Inscirot en el curso"""

    def __init__(self, nombre, edad, email, materias):
        self.nombre = nombre
        self._edad = edad
        self.__email = email
        self.materias = materias
    
    @property
    def edad(self):
        return self.edad
    
    @edad.setter
    def edad(self, valor):
        if valor <= 3 or valor >= 100:
            raise ValueError("La edad debe ser entre 3 y 99")
        self.edad = valor

    @property
    def email(self):
        return self.email
    
    @email.setter
    def email(self, valor):
        self.__email = valor


estudiante1=Estudiante(20,"Juan",["Matematicas,Historia"], "juaniquilador69@gmail.com")
print (f"Se genera el estudiante {estudiante1.nombre} con edad {estudiante1.edad}")