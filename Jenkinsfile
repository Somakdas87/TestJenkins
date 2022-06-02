pipeline {
    agent any

    tools{
        maven 'Maven-3.8.5'
        jdk 'jdk-9.0.4'
    }

    environment{
        PATH = "C:/Program Files/apache-maven-3.8.5-bin/apache-maven-3.8.5/bin:$PATH"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Somakdas87/TestJenkins.git'
            }
        }
        stage('Fibonacci') {
            steps {
                echo 'Fibonacci!'
                bat "mvn test"
            }
        }
    }
}
