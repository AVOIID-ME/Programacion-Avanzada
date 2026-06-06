from sesiones.sesion06.moldes.Usuario import Usuario as user

#-----------Inicio de Programa--------------


Usuario1 = user("Fernando",23,"Atizapan")

print(f"El Usuario {Usuario1.nombre} tiene {Usuario1.edad} años y vive en {Usuario1.ubicacion()}")

Usuario1.ubicacion = "Nueva York"