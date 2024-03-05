pipeline {
	agent any

	tools {
  		maven 'maven'
	}

	stages {
		stage("Script") {
			steps {
				git branch: 'feature', url: 'https://github.com/udiscopotato/my-app.git'
				sh "bash script.sh"
			}
		}
		stage("Maven Build") {
			steps {
				git "https://github.com/udiscopotato/my-app.git"
				sh "mvn clean install"
			}
		}
	}
}
