pipeline {
    agent any

    stages {
        stage('Fetch & Validate') {
            steps {
                sh 'ls'
                git 'https://github.com/ravi2krishna/maven-stand-alone.git'
                sh 'ls'
                sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
