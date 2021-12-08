package org.test
class Test {
  static def npm(flags) {
    script.sh "npm ${flags}"
  }
}
