pipeline {
    agent any

    environment {
        DOCKER_HUB=credentials('docker-hub')
    }

    stages {
        stage('build') {
            steps {
                sh './build/build.sh'
            }
        }

        stage('publish') {
            steps {
                sh 'echo $DOCKER_HUB_PSW | docker login -u $DOCKER_HUB_USR --password-stdin'
                sh './build/publish.sh'
            }
        }
    }
}