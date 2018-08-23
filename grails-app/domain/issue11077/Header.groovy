package issue11077

class Header {
    String headerNo
    static hasMany = [items: Item]
}
