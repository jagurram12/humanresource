pipeline{
	
	stage("Compile"){
		echo "Compiling the source"
		sh "mvn clean compile"
	}
	stage("Unit Test"){
		echo "Executing unit tests"
		sh "mvn test"
	}
	stage ("Build"){
		echo "Building the source"
		sh "mvn install"
	}
	
}