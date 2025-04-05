pipeline {
    agent any

    environment {
        SONAR_SCANNER_HOME = 'C:\\sonar-scanner-5.0.1.3006-windows\\bin'
        SONAR_HOST_URL = 'http://localhost:9000'
        SONAR_PROJECT_KEY = 'Abstraction5'
        SONAR_LOGIN = 'sqp_169443e3dc5da8dbe837fe6f3ad67b95171325f9'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/abdirahim888/gas.git'
            }
        }

        stage('abdirahim2') {
            steps {
                withSonarQubeEnv('abdirahim2') {
 bat "C:\\sonar-scanner-5.0.1.3006-windows\\bin\\sonar-scanner -Dsonar.projectKey=Abstraction5 -Dsonar.sources=modular-java-app\\src\\main/module -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_169443e3dc5da8dbe837fe6f3ad67b95171325f9"               
              }
            }
        }
    }
}
