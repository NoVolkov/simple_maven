pipeline {
    agent any	
	triggers { pollSCM('* * * * *') }
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
		stage('deploy'){
			steps{
				bat 'deployScript.bat'
			}
		}
		stage('start'){
            steps {
                bat 'runScript.bat'
            }
        }
    }
	/*post{
		always{
			emailext body: 'Test Message. :)',
				subject: 'Test Subject',
				to: 'volkov.v16@yandex.ru'
		}
	}*/
    
}