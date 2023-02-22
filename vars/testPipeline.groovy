// vars/testPipeline.groovy
// This pipeline requires no parameters as input.

def call(Map pipelineParams) {
    pipeline {
        agent any
        stages {
            stage('printenv') {
                steps {
                    sh('printenv')
                }
            }
        } // end stages
    } // end pipeline
}