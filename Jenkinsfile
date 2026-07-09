pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
    }

    parameters {
        string(
            name: 'BRANCH_NAME',
            defaultValue: 'main',
            description: 'Git branch to build'
        )

        string(
            name: 'CUCUMBER_TAGS',
            defaultValue: '@Smoke',
            description: 'Cucumber Tags (Example: @Smoke or @Regression or @Smoke and not @WIP)'
        )
    }

    environment {
        REPOSITORY_URL = 'https://github.com/sunil-bombe/PlaywrightAutomationFramework.git'
    }

    stages {

        stage('Checkout Source') {
            steps {
                git branch: "${params.BRANCH_NAME}",
                    url: "${env.REPOSITORY_URL}"
            }
        }

        stage('Clean Project') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Execute Automation') {
            steps {
                sh """
                    mvn test \
                    -Dcucumber.filter.tags="${params.CUCUMBER_TAGS}"
                """
            }
        }

        stage('Publish Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {

        always {
            archiveArtifacts artifacts: 'target/**/*', fingerprint: true
        }

        success {
            echo 'Automation execution completed successfully.'
        }

        failure {
            echo 'Automation execution failed.'
        }

        cleanup {
            cleanWs()
        }
    }
}