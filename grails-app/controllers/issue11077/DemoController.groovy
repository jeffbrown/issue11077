package issue11077

class DemoController {

    def index() {
        Header.withTransaction {
            // Saving the Header before adding
            // items allows the integration test to pass
            Header h = new Header(headerNo: 'SOMETHING')//.save()
            h.addToItems itemNo: 1
            h.addToItems itemNo: 2
            h.save(failOnError: true)
        }
        render 'Success'
    }
}
