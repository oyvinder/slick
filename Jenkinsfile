#!/usr/bin/env groovy

pipeline {
    agent any
    stages { 
        stage('Test') {
            steps {
                git url: 'https://github.com/oyvinder/slick.git'
                
                def mvnHome = tool 'M3'
                sh "${mvnHome}/bin/mvn test"
            }            
        }
    }
}
