pipeline{
	agent any
	tools{
		maven "maven3.6.3"
		jdk "java8"
	}
	options {
    	skipDefaultCheckout true
  	}
	environment{
		registry = "jagurram12/hr-app"
	    registryCredential = 'dockerhub'
	    dockerImage = ''
	}
	stages{	
		stage("Checkout"){
			steps{
				checkout scm
			}
		}
		stage("Compile"){
			steps{
				echo "Compiling the source"
				bat "mvn -DskipTests -Dmaven.test.skip=true clean compile"
			}
		}
		stage("Unit Test"){
			steps{
				echo "Executing unit tests"
				bat "mvn test"
			}
		}
		stage ("Build"){
			steps{
				echo "Building the source"
				bat "mvn -DskipTests -Dmaven.test.skip=true install"
				//bat "docker build -t jagurram12/hr-app:1.0 ."
				script {
		          dockerImage = docker.build registry + ":$BUILD_NUMBER"
		        }
			}
		}
		stage("Publish"){
			steps{
		        script {
		          docker.withRegistry( '', registryCredential ) {
		            dockerImage.push()
		          }
		        }
		    }
		}
	}
	
}