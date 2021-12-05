pipeline {
    agent any
    stages{
		stage('git'){
			steps{
				git credentialsId: 'simple_maven_id', url: 'https://github.com/NoVolkov/simple_maven.git'
			}
		}
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