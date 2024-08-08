pipeline {
    agent any

    stages {
        agent {
            docker {
                image 'maven:3.9.8-eclipse-temurin-21-alpine'
            }
            }
        stage('Build') {
            steps {
                echo 'Hello World'
                sh 'mvn --version'
            }
        }
    }
}