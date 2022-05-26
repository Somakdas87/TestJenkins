pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Somakdas87/TestJenkins.git'
            }
        }
        stage('Fibonacci') {
            steps {
                echo 'Fibonacci!'
                sh "mvn test"
            }
        }
    }
}
