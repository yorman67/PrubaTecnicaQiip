# PrubaTecnicaQiip

## Comenzando
Estas instrucciones te permitirán clonar el proyecto y realizar la configuración adecuada para que tengas el proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.

### Pre-Requisitos
Como pre-requisitos deberás tener instalados las siguientes herramientas:
  1. Git
  2. Java
  3. Gradle 6.8.3
  4. Intellij o el IDE que prefieras
  5. Tener instalado el plugin de cucumber en el IDE
  6. Tener instalado Appium
  7. Tener instalado Android studio
  8. Si es posible tener un dispositvo android fisico
  9. Apk https://github.com/saucelabs/sample-app-mobile/releases

## Instalación
  1. Abre una ventana de comandos
  2. Ejecuta el comando java -version
  3. Ejecuta el comando gradle -version
   ![image](https://user-images.githubusercontent.com/79065617/113531447-6c4fdd00-958e-11eb-90d6-e5c80d955b06.png)
  4. Clona el respositorio
    Git:
       - git clone https://github.com/yorman67/PrubaTecnicaQiip.git
       - cd PrubaTecnicaQiip
   6. Espera que todas las dependencias necesarias se descarguen
      
## Ejecución de pruebas
  En la carpeta  runners encontrarás el runner especifico de cada uno de los escenarios.
### Ejecucion con JUnit
     Si quieres ejecutar las pruebas con JUnit, sigue estos pasos  
     1.Selecciona un nombre para el escenario
     2.Selecciona el modulo donde se encuntra el runner
     3.Selecciona el runner que quieres ejecutar
     4.Ingresa la variable de entorno
        - si quieres ejecutar el proyecto usando kobitton usa esta variable Denv=kobitton
        - si lo quieres correr en un dispositivo fisico usa esta variable Denv=Local
     5.Selecciona la opcion JAR en la seccion de shorten command
     6.Selecciona aplicar
     7.Selecciona aplicar
     8.Ejecuta la prueba
     
  ![image](https://user-images.githubusercontent.com/79065617/133647185-18a356c7-8e28-4133-9dd6-2a51eb66744c.png)

   
### Ejecucion con Gradle
    Podrás ejecutar las pruebas con gradle para generar los resportes de serenity solo ejecutando el siguiente comando
        
      -  gradle clean -Denv=Local test --tests RealizarCompraRunner aggregate
      
### Como ejecutar en Kobitton
  1.Debemos crearnos una cuenta en kobiiton

  2.Seleccionamos el dispositivo en el que queramos ejecutar la prueba
  
  ![image](https://user-images.githubusercontent.com/79065617/133645917-e299ad83-9a24-4a61-b24a-3179b94dbaba.png)
  3.Seleccionamos la opcion Automatation Settings
  
  4.observaremos un pop up donde buscaremos la opcion Hybrid/Native from Apps
  ![image](https://user-images.githubusercontent.com/79065617/133647636-27f2865b-8b05-4c56-afd4-c826b4d0cd57.png)  
  
  5.Seleccionamos la app que correremos que previamente la debes cargar a tu cuenta
  ![image](https://user-images.githubusercontent.com/79065617/133646473-4a48da39-34a5-4759-b55b-75ff4e904045.png)
  
  6.por ultimo solo debemos cambiar los valores de los capabilities en la clase enumCapabilitiesKobitton
  ![image](https://user-images.githubusercontent.com/79065617/133646763-e38495e1-3a24-4532-b79c-b5ed73ea5b7e.png)

### Evidencia
    Estas pruebas se realizaron en dos dispositvos diferentes uno fisico y uno virtual
    
    El dispositivo fisico utlizado fue un MotoG30 y arrojo las siguientes evidencias
   ![image](https://user-images.githubusercontent.com/79065617/133642187-6edfe2bd-a7ff-4d8c-9a32-52ee350c5f4a.png)
   ![image](https://user-images.githubusercontent.com/79065617/133642267-225a5184-3b7d-4dfb-93d9-ec60021be6f5.png)


    El Dispositvo virtual fue un Galaxy A10 y fue ejecutado en la granja de dispositivos de kobitton y este arrojo las siguientes evidencias
   ![image](https://user-images.githubusercontent.com/79065617/133642621-a133f449-9895-4baa-aef6-e12e357b3924.png)

 ### Construido con 
  Este proyecto fue construido con:
  
    * serenity Bdd 
    * patrón Screenplay 
    * gradle
    * java
    * cucumber  
    * Appium
    
 ### Autor
  - Yorman Paúl Martínez Acevedo   

### Agradecimiento
  Quiero dar las gracias a Qiip por permitirme participar en su proceso de selección, con este ejercicio tuve la oportunidad de practicar y mejorar mis habilidades y espero poder tener una retroalimentación por parte de esta gran compañía, nuevamente muchas gracias.


    
