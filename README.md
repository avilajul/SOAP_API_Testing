# SOAP API Testing
Para la versión en Español, haz clic [aquí](README-es.md).

Test automation with the Serenity framework implementing the Screenplay pattern in Java, 
Gradle, Cucumber and Junit to test a SOAP service.

The public SOAP API was used for automation
[http://www.dneonline.com/calculator.asmx](http://www.dneonline.com/calculator.asmx)

Para la automatización se usó la API SOAP pública [http://www.dneonline.com/calculator.asmx](http://www.dneonline.com/calculator.asmx) 

### Built tests 📋
Send two integers to the service to obtain the result of the multiplication.

## Prerequisites 🛠️ ##

- Java JDK 11
- Gradle 8.1.1 or higher
- GIT

## Project structure 🗼

    .
    ├──📂 src              
    │   ├──🗃️ main                             # Source files 
    │   │   └──📂️️ java
    │   │       └──📦 com.co.company.certification.soap
    │   │           ├──📦 exceptions           # Custom exceptions
    │   │           │
    │   │           │
    │   │           ├──📦 models               # Package where the models are located - Object
    │   │           │            
    │   │           │
    │   │           ├──📦 questions            # Package where classes are stored to obtain data from the service, response from the service, etc.
    │   │           │   
    │   │           │                         
    │   │           ├──📦 tasks                # Package where the tasks that perform the consumption of the service are stored, etc.
    │   │           │   
    │   │           │
    │   │           └──📦 utils                # Utilities developed
    │   │               ├──📦 constants        # Constants used in the project
    │   │               └──📦 various          # Various functions used in the project
    │   │
    │   │
    │   ├──🗃️ test                             # Files for the execution of the tests
    │   │   └──📂 java 
    │   │       ├──📦 com.co.company.certification.soap
    │   │       │   ├──📦 runners              # Test execution classes
    │   │       │   │   
    │   │       │   │
    │   │       │   └──📦 stepdefinitions      # Classes with the Java method with an expression that links it to one or more Gherkin steps    │   │   │       
    │   │       │       └──📦 settings         # Settings for StepDefinitions classes
    │   │       │    
    │   │       └──🗂️ resources
    │   │           ├──📂 features             # Package where the scenarios are stored in Gherkin language
    │   │           │   
    │   │           │
    │   │           └──📂 requests             # Package where xml file is stored with the request of the SOAP service
    │   │           
    │   └── ···
    │
    └── ···

## Installation ⚙️
- Clone this repository using `git clone https://github.com/avilajul/SOAP_API_Testing.git`
- Open or import the project from your preferred IDE
- Go to the `build.gradle` file to download and build the project dependencies
- Another option is to execute the following command to run through the console
```
gradle clean build -x test
gradle compileJava
```
## Execution 🚀
- Go to the `multiplicationResult` runner and run
**NOTE:** The generated test report is located in the path `/target/site/serenity/index.html`

## Contribution 🤝 
️
If you would like to make a contribution, please follow the steps below:

1. Clone or Fork the project
2. Create the Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'comments of changes added'`)
4. Push to working branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request