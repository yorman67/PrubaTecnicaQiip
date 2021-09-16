# PruebaTecnicaQiip

## Comenzando
Estas instrucciones te permitirán clonar el proyecto y realizar la configuración adecuada para que tengas el proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.

### Pre-Requisitos
Como pre-requisitos deberás tener instalados las siguientes herramientas:
  1. Git
  2. JDK 1.8.0
  3. Gradle 6.9.1
  6. Appium 1.21.0
  7. SDK
  8. contar con acceso a un dispositivo android
  9. Apk https://github.com/saucelabs/sample-app-mobile/releases

## Clonacion Proyecto
    Git:
       - git clone https://github.com/yorman67/PruebaTecnicaQiip.git
       - cd PrubaTecnicaQiip
      
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
     7.Ejecuta la prueba
     
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
   ![image](https://user-images.githubusercontent.com/79065617/133696911-67a5daa3-b384-428c-9047-ca68734aec9b.png)
   ![image](https://user-images.githubusercontent.com/79065617/133696948-34e39be1-1cd3-4287-9911-c2939e5119fa.png)
   ![image](https://user-images.githubusercontent.com/79065617/133696990-e95ddb15-4e92-4d6f-bcd0-f6ed46ac9a93.png)


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
  Quiero dar las gracias a qiip por permitirme participar en su proceso de selección, con este ejercicio tuve la oportunidad de practicar y mejorar mis habilidades y espero poder tener una retroalimentación por parte de esta gran compañía, nuevamente muchas gracias.


    
