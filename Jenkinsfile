pipeline
{
	agent any
	environment
	{
		DOCKER_IMAGE="new-spring-rest:latest"

	}E
	stages
	{
		stage("Clone Repository")
		

			steps{
				git 'https://github.com/araganlapally/new-spring-rest-git
				
  
'
			}
		}		sage("Build wih Maven")
		{
			steps{
				sh 'mvn clean package'_

			}
		}
		stage('Run Docker Container'){
			steps{
				sh'docker run -d -p 8080:8080 --name spring-rest $DOCKER_IMAGE'
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
_	

	}

}	

