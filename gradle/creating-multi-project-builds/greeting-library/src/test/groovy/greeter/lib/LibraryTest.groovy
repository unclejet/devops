/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package greeter.lib

import spock.lang.Specification

class LibraryTest extends Specification {
       def 'Creating a greeting'() {
    	expect: 'The greeting to be correctly capitalized'
    	Library.greeting('gradlephant') == 'Hello,Gradlephant'
    }
}
