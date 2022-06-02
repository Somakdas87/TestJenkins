pipeline {
    agent any

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
            }
        }
    }
}
