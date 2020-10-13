pipeline{
	agent any
	tools{
		maven "maven3.6.3"
		jdk "java8"
	}
	stages{
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
				bat "docker build -t hr-app:1.0 ."
			}
		}
	}
	
}