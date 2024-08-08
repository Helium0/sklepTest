pipeline {
    agent any

    stages {
        stage('Build') {
        agent {
            docker {
               image 'maven:3.9.8-eclipse-temurin-11'
               }
            }
            steps {
                echo 'Hello World'
                sh 'mvn --version'
            }
        }
    }
}