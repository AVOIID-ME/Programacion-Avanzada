import modelos.estudiante as claseEstudiante
import modelos.materias as claseMateria

if __name__== "__main__":
    estudiante1 = claseEstudiante.Estudiante(5, "Juan",["Matematicas", "Historia"], "juaniquilador@gmail.com")
    materia1 = claseMateria.Materia("MAT01", "Matematicas I",5)
    print(f"El estudiante")