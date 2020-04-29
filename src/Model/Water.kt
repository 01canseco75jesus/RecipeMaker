package Model

class Water: TypeOfFoods() ,IFoodsFunctions{

    val  listOfOptions: ArrayList<String> =
     arrayListOf("PURIFIED WATER","MINERALIZED WATER","TONIC WATER","MOUNTAIN SPRING WATER","ALKALINE WATER","HYPOSODIC WATER")

    override val quantity: Int = listOfOptions.size
    override val typo: String = "Water"

}