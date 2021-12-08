@Library('test@lib') _

def testObj = new org.test.Test()
pipeline {
  agent { docker { image 'node:14-alpine' } }
  stages {
    stage('build') {
      steps {
        sh 'npm --version'
      }
    }
    stage ('log') {
      steps {
        script {
          log_test.info 'Info log'
          log_test.warning 'Warning log'
        }
      }
    }
    log_test.evenOrOdd currentBuild.getNumber()
      stage('command') {
        steps {
          testObj.npm "--version"
        }
      }
  }
}
