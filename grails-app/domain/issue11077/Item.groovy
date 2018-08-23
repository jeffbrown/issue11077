package issue11077

class Item {
    int itemNo
    static belongsTo = [header: Header]
    static constraints = {
        itemNo  unique: 'header'
    }
}
