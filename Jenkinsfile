pipeline {
    agent any

    stages {
        stage('Build') {
        agent {
            docker {
               image 'maven:3.9.8-eclipse-temurin-21-alpine'
               }
            }
            steps {
                echo 'Hello World'
                sh 'mvn --version'
            }
        }
    }
}