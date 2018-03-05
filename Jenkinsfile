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
       submitJUnitTestResultsToqTest([apiKey: '256ca053-f0df-4097-beac-742cfbbbcc7d', containerID: 1948696, containerType: 'test-suite', createNewTestRunsEveryBuildDate: true, createTestCaseForEachJUnitTestClass: false, createTestCaseForEachJUnitTestMethod: true, environmentID: 34843, overwriteExistingTestSteps: true, parseTestResultsFromTestingTools: true, projectID: 73985, qtestURL: 'https://qtestlaunch.qtestnet.com', submitToAReleaseAsSettingFromQtest: false, submitToExistingContainer: true, utilizeTestResultsFromCITool: false])

   }
}


