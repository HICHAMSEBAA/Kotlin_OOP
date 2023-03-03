import jdk.jfr.Category

class Car (private val Category: String,private val Brand: String,private val Model: String,private val Year: Int) {

    // second constructor for defult year (2023)
    constructor(Category: String,Brand: String,Model: String):this(Category,Brand,Model,2023)
    var Version: String = ""
        get() = field.uppercase()
        set(value) {
            field = value
        }
    var Portres: Int = 4
        get() = field
        set(value) {
            field = value
        }
    var Energy: String = ""
        get() = field.uppercase()
        set(value) {
            field = value
        }
    var Box: String = ""
        get() = field.uppercase()
        set(value) {
            field = value
        }
    var Price: Float = 0.0f
        get() = field
        set(value) {
            field = value
        }

    //Display Function
    fun Display(){
        println("*** General Information About this Car ***" )
        println(" Category : ${this.Category}")
        println(" Brand    : ${this.Brand}")
        println(" Model    : ${this.Model}")
        println(" Year     : ${this.Year}")
    }
    //Technical datasheets
    fun Technical_datacheets(){
        println("*** Technical Datacheets ***" )
        println(" Category : ${this.Category}")
        println(" Brand    : ${this.Brand}")
        println(" Model    : ${this.Model}")
        println(" Year     : ${this.Year}")
        println(" Version  : ${this.Version}")
        println(" Portres  : ${this.Portres}")
        println(" Energy   : ${this.Energy}")
        println(" Box      : ${this.Box}")
        println(" Price    : ${this.Price}$")
    }
}