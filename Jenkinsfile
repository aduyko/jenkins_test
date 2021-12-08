@Library('test@lib') _
@Library('test@lib') import static org.test.Test.*

def testObj = new org.test.Test()
pipeline {
  agent { docker { image 'node:14-alpine' } }
  stages {
    stage('build') {
      steps {
        sh 'npm --version'
      }
    }
    stage('log') {
      steps {
        script {
          log.info 'Info log'
          log.warning 'Warning log'
        }
      }
    }
    stage('command') {
      testObj.npm "--version"
    }
  }
}
