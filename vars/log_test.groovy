def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def evenOrOdd(buildNumber) {
  if (buildNumber % 2 == 0) {
    echo "The build number is even"
  } else {
    echo "The build number is odd"
  }
}
