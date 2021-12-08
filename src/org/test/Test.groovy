package org.test
class Test implements Serializable {
  def steps
  Test(steps) {this.steps = steps}
  static def npm(flags) {
    steps.sh "npm ${flags}"
  }
}
