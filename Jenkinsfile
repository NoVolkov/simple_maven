pipeline {
    agent any
    stages{
        stage('build'){
            steps {
                bat 'buildScript.bat'
            }
        }
		stage('start'){
            steps {
                bat 'runScript.bat'
            }
        }
    }
    
}