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
		stage('test'){
			steps{
				bat 'testScript.bat'
			}
		}
		stage('packaging'){
			steps{
				bat 'packagingScript.bat'
			}
		}
		stage('start'){
            steps {
                bat 'runScript.bat'
            }
        }
    }
	post{
		success{
			emailext body: 'Test Message. :)',
				subject: 'Test Subject',
				to: 'vdm.volkov249@mail.ru'
		}
	}
    
}