package GetSet

class babelFish (private val coefficient: Int){

    var isTranslated = false

  /*  var nerweSignalLevel = 200                      //field - значение переменной.      value - объявленный параметр функции.
        get() = field                               //get - выполняется когда обращаемся
        set(value: Int) {                           //set - выполняется когда меняют значение переменной
            field = value
            if (value>300) {
                isTranslated = true
                println("isTranslated = true")
            }



        }         */
    var nerveSignalTest = 200                                           //field - значение переменной.   value - объявленный параметр функции.
        get() = if (coefficient != null) {field * coefficient} else field             //get - выполняется когда обращаемся
        set(value: Int) {                                                             //set - выполняется когда меняют значение переменной
            field = value
            if (value > 300) {
                isTranslated = true
                println("isTranslated = true")
            }

        }

}