pipeline{
	agent any
	stages{
		stage("Compile"){
			steps{
				echo "Compiling the source"
				sh "mvn clean compile"
			}
		}
		stage("Unit Test"){
			steps{
				echo "Executing unit tests"
				sh "mvn test"
			}
		}
		stage ("Build"){
			steps{
				echo "Building the source"
				sh "mvn install"
			}
		}
	}
	
}