@Library('grovy/master') _

pipeline{
  agent any
  stages {
  stage('Where is Jenkins Shared Library cloned') {
    steps {
	  script {
	    echo "pipeline started"
		}
	  }
	}
  }
  post {
	success{
		script{
		def workspace = "${WORKSPACE}"
		def obj1 = new Checkimport(manager,workspace)
		obj1.checkname()
		}
	}
}
}
