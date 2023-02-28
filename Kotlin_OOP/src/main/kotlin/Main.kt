import Car
fun main() {
    val BMW = Car("BMW","X6","X6 F86 M",2018)
    BMW.Display()
    println("_________________________________________________________")
    BMW.Version = "4.4 M AUTO"
    BMW.Portres = 5
    BMW.Energy = "Ess"
    BMW.Box = "Auto"
    BMW.Price = 138500F
    BMW.Technical_datacheets()

}