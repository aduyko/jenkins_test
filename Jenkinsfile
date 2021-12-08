@Library('test@lib') _

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
      steps {
        script {
          def testObj = new org.test.Test()
          testObj.npm("--version")
        }
      }
    }
  }
}
