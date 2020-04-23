fun main(args: Array<String>) {

  menu@do{
     println("""
         
         ::Welcome to Recipe Maker::

         Select the option desired
         1. Make a Recipe
         2. See my Recipes
         3. Exit
     """.trimIndent())
        val resp:String? = readLine()
        val respF:Int = resp?.toIntOrNull() ?:0

        when (respF){
           1 -> println("Come on make a Recipe")
           2 -> println("This are your recipes")
           3 -> println("Good Bye")
           0 -> println("Chose a valid option")
        }

    }while (respF != 3)

}


