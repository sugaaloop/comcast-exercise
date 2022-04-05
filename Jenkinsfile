pipeline {
    agent any

    environment {
        DOCKER_HUB=credentials('docker-hub')
    }

    stages {
        // stage('build') {
        //     steps {
        //         powershell './build/build.ps1'
        //     }
        // }

        stage('publish') {
            steps {
                powershell 'echo username: $env:DOCKER_HUB_PSW'
                // powershell 'write-output $env:DOCKER_HUB_PSW | docker login -u $env:DOCKER_HUB_USR --password-stdin'
                powershell ' docker login -u $env:DOCKER_HUB_USR -p $env:DOCKER_HUB_PSW'
                powershell './build/publish.ps1'
            }
        }
    }
}