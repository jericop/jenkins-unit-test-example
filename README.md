# jenkins-unit-test-example

This is a working example of a basic jenkins unit test from the following blog posts.

* https://mtijhof.wordpress.com/tag/jenkins-series/
  * https://mtijhof.wordpress.com/2019/04/29/jenkins-preparing-your-shared-library-for-tests/
  * https://mtijhof.wordpress.com/2019/05/06/jenkins-testing-a-full-declarative-pipeline-in-your-shared-library/
  * There are more examples in the blog post series

* https://spockframework.org/spock/docs/1.3/spock_primer.html

To create or overwrite the callstacks for regression test(s) you must set `pipeline.stack.write=true` property.

* This can be done in the `gradle.properties` file
* or by passing it as a system property when running gradle:
  * `gradle clean test --info -Ppipeline.stack.write=true`

Callstack files are named `${ClassName}_${subname}.txt` where subname is the String value passed to `testNonRegression("some-text")`.