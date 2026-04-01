pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/lakshmiprasannareddy30/password-strength-checker.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
