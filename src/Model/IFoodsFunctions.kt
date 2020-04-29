package Model

import java.util.*
import kotlin.collections.ArrayList

interface IFoodsFunctions{

    fun view(typo:String,quantity:Int,listOfOptions:ArrayList<String>)
    {
        println("Category: $typo \n\n" +
                "Number of ingredients: $quantity\nAvailable ingredients:")
        for (item in listOfOptions){
            println("✔ ${item.toUpperCase(Locale.ENGLISH)}")
        }
    }

}