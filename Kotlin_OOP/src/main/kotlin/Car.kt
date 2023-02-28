import jdk.jfr.Category

class Car (private val Category: String,private val Brand: String,private val Model: String,private val Year: Int) {

    //Display Function
    fun Display(){
        println("*** General Information About this Car ***" )
        println(" Category : ${this.Category}")
        println(" Brand    : ${this.Brand}")
        println(" Model    : ${this.Model}")
        println(" Year     : ${this.Year}")
    }
}