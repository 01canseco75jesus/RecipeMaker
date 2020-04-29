package Model

class Cereal: TypeOfFoods() ,IFoodsFunctions{

   val listOfOptions:ArrayList <String> =
           arrayListOf<String>("Avena","Trigo","Arroz","Maiz","Centeno","Cebada","Chía","Linaza")

    override val typo: String = "Cereal"
    override val quantity: Int = listOfOptions.size

}