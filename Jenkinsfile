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
				echo 'Идёт сборка'
                bat 'buildScript.bat'
            }
        }
		stage('test'){
			steps{
				echo 'Идёт тестирование'
				bat 'testScript.bat'
			}
		}
		stage('packaging'){
			steps{
				echo 'Идёт упаковка'
				bat 'packagingScript.bat'
			}
		}
		stage('deploy'){
			steps{
				echo 'Идёт развёртка'
				bat 'deployScript.bat'
			}
		}
		stage('start'){
            steps {
				echo 'Идёт запуск'
                bat 'runScript.bat'
            }
        }
    }
	post{
		always{//Двойные кавычки нужны
			mail to: "vdm.volkov249@mail.ru",//кому
		             cc : "vdm.volkov249@gmail.com",//от кого
				subject: "Отчёт Jenkins. Build ${currentBuild.fullDisplayName}.",//название письма (Оглавление)
				body: "Hi. Build`s status at ${env.BUILD_URL}."//текст письма (Сообщение)
		}
	}
    
}
