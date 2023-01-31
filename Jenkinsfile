pipeline {
    agent any
    stages {
        stage ("build") {
            steps {
                echo 'building the application...'
            }
        }
        stage ("test") {
            when {
                expression {
                    BRANCH_NAME == 'dev' || BRANCH_NAME == 'master'
                }
            }
            steps {
                echo 'testing the application...'
            }
        }
        stage ("deploy") {
            when {
                expression {
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                echo 'deploying the application...'
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
