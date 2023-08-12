fun main() {

    var English = 67
    var Hindi = 56
    var Gujarati = 68
    var Science = 70
    var Maths = 80

    var total = English + Hindi + Gujarati + Science + Maths
    var per = total / 5

    println("Total Marks:$total")
    println("Total Per.:$per")

    if (per >= 75) {
        print("A Grade")
    } else if (per >= 60) {
        print("B Grade")
    } else if (per >= 50) {
        print("C Grade")
    } else if (per >= 35) {
        print("D Grade")
    } else {
        print("Fail")
    }
}