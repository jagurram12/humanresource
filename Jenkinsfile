pipeline{
	agent any
	tools{
		maven "maven3.6.3"
	}
	stages{
		stage("Compile"){
			steps{
				echo "Compiling the source"
				bat "mvn clean compile"
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
				bat "mvn install"
			}
		}
	}
	
}