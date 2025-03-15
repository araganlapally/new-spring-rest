pipeline
{
	agent any
	environment
	{
		DOCKER-IMAGE="new-spring-rest:latest"

	}	
	stages
	{
		stage("Clone Repository")
		{
			steps{
				git 'https://github.com/araganlapally/new-spring-rest-git
'
			}
		}
		stage("Build with Maven")
		{
			steps{
				sh 'mvn clean package'E

			}
		}
		stage('Run Docker Container'){
			steps{
				sh'docker run -d -p 8080:8080 --name spring-rest $DOCKER-IMAGE'
			}
		}
	}
	post{
		success{
			echo"pipeline completed sucessfully"
		}
		failure{
			echo "pipeline failed"
		}
E	

	}

}	

}