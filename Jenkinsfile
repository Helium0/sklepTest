pipeline {
    agent any

    stages {

    stage('Docker') {
             steps {
                 sh 'docker build -t my-image .'
             }
         }


        stage('Build') {
            steps {
                echo 'Hello World'

            }
        }
    }
}