pipeline {
    agent any
	environment{
		V_PACK="false"
	}
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
			post{
				success{
					echo 'Успех упаковки'
					V_PACK="true"
				}
			}
		}
		stage('deploy'){
			when{
				allOf{
					environment name:'V_PACK', value: 'true'
				}
			}
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