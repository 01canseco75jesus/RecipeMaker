package Model

class Meat :TypeOfFoods() ,IFoodsFunctions{

    val listOfOptions: ArrayList<String> =
            arrayListOf("pork meat","beef","chicken meat","mutton","fish")

    override val typo: String = " "
    override val quantity: Int = listOfOptions.size

}