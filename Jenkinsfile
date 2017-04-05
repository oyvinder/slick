#!/usr/bin/env groovy

node {
    git url: 'https://github.com/oyvinder/slick.git'
    def mvnHome = tool 'M3'
    sh "${mvnHome}/bin/mvn test"
}
