import requests

class API:

    URL ="https://api.mistral.ai/v1/chat/completions"



    def __init__(self, token, modelo="mistral-small-latest", temperatura=0.7):

        self.__token = token
        self.modelo = modelo
        self.url = API.URL
        self.temperatura = temperatura

    @property
    def token(self):
        return self.__token
    
    @token.setter
    def token(self, nuevoToken):
        self.__token = nuevoToken

    def construir_cabeceras(self):
        return{
            "Authorization": f"Bearer {self.__token}",
            "Content-Type": "application/json",
            "Accept": "application/json",
        }
    
    def preguntar(self, mensaje):
        cuerpo = {
            "model": self.modelo,
            "temperature": self.temperatura,
            "messages": [
                {"role": "user","content":mensaje}
            ]
        }

        respuesta = requests.post(
            self.url,
            headers = self.construir_cabeceras(),
            json = cuerpo,
            timeout = 30,
        )

        respuesta.raise_for_status()

        datos = respuesta.json()
        return datos["choices"][0]["message"]["content"]
    


#--------Programa Principal-----------

token ="FhvUDfB5qzxwAihw7ccO9r0jD6yLIjFy"

llamadoAPI = API(token)

respuesta = llamadoAPI.preguntar ("como estas el dia de hoy?")

print(respuesta)