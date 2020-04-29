package Model

class Milk: TypeOfFoods() ,IFoodsFunctions{

    val listOfOptions: ArrayList<String> =
            arrayListOf("whole milk","cheese","yogurt","quesillo","requesón","cream","condensed milk","evaporated milk")

    override val quantity: Int = listOfOptions.size
    override val typo: String = "Milk"

}