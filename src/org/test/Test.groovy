package org.test
class Test implements Serializable {
  static def npm(flags) {
    steps.sh "npm ${flags}"
  }
}
