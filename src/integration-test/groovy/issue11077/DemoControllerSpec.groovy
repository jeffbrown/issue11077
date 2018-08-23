package issue11077

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class DemoControllerSpec extends GebSpec {

    void 'test that the index action may be invoked multiple times'() {
        when:
        go '/demo/index'

        then:
        $().text() == 'Success'

        when:
        go '/demo/index'

        then:
        $().text() == 'Success'
    }
}
