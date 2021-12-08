def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def evenOrOdd(int buildNumber) {
  if (buildNumber % 2 == 0) {
    stage('Even Stage') {
      steps {
        echo "The build number is even"
      }
    }
  } else {
    stage('Odd Stage') {
      steps {
        echo "The build number is odd"
      }
    }
  }
}
