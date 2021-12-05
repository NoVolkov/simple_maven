pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                sh 'buildScript.bat'
            }
        }
    }
    post {
        always {
            mail to :"vdm.volkov249@mail.ru",
                subject: "New build report: ${currentBuild.fullDisplayName}",
                body:"Check out status at ${env.BUILD_URL}"
        }
    }
}