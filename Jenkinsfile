pipeline {
    agent any
    stages {
        stage ("Clone Repo") {
            when {
                expression {
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                echo 'cloning the application...'
                git url: 'https://github.com/TokhirjonSoliev/spring-boot-CI-CD-example.git'
            }
        }
        stage ("Build docker") {
            steps {
                echo 'building docker image of the application...'
                sh 'docker build -t spring-boot-example .'
            }
        }
        stage ("Docker run") {
            steps {
                echo 'running the image of the application...'
                sh 'docker run -d -p 8081:8082 spring-boot-example'
            }
        }
    }
    post {
        always {
            echo 'message in here, is always printed out'
        }
        success {
            echo 'message in here, is printed out when the stages are reached success'
        }
        failure {
            echo 'message in here, is printed out when the stages are reached failure'
        }
    }
}
