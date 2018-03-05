node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git branch: 'develop', url: 'https://github.com/QASymphony/ci-examples.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'maven-3.5.2'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -f pom.xml -Dmaven.test.failure.ignore clean test"
      } else {
         bat(/"${mvnHome}\bin\mvn" -f pom.xml -Dmaven.test.failure.ignore clean test/)
      }
   }
   stage('Results') {
      junit '**/target/**/*.xml'
      archive 'target/*.jar'
   }
   stage('qTestJenkinsPlugin'){
       submitJUnitTestResultsToqTest([apiKey: '256ca053-f0df-4097-beac-742cfbbbcc7d', containerID: 1148479, containerType: 'test-cycle', createNewTestRunsEveryBuildDate: true, createTestCaseForEachJUnitTestClass: true, environmentID: 0, overwriteExistingTestSteps: true, parseTestResultsFromTestingTools: false, parseTestResultsPattern: '', projectID: 73985, qtestURL: 'https://qtestlaunch.qtestnet.com', submitToExistingContainer: true])

   }
}


