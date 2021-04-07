/*Desafío 1.
*/
/*
fun main(parametro: Array<String>) {
    var suma = 0.0
    println ("Finaliza programa Ingresando -1 en el numero de cuenta ")
    do {
        print("Ingrese número de cuenta: ")
        val cuenta = readLine()!!.toInt()
        if (cuenta != -0)
        if ( cuenta >= 0) {
            print("Ingrese saldo:")
            val saldo = readLine()!!.toDouble()
            if (saldo > 0) {
                println("Saldo Acreedor.")
                suma += saldo
            } else
                if (saldo < 0)
                    println("Saldo Deudor.")
                else
                    println("Saldo Nulo.")
             }
            } while(cuenta>=0)
              println ("Saldo Total de Acreedores $suma")
              print("Programa Finalizado")
}
*/
/*
Desafío 2.
*/
/*
    fun main(parametro: Array<String>) {
    print("Cantidad de puntos a ingresar:")
    val cantidad = readLine()!!.toInt()
    for (i in 1..cantidad) {
        print("Ingrese coordenada x:")
        val x = readLine()!!.toInt()
        print("Ingrese coordenada y:")
        val y = readLine()!!.toInt()
        when {
            x > 0 && y > 0 -> println("Primer cuadrate")
            x < 0 && y > 0 -> println("Segundo cuadrante")
            x < 0 && y < 0 -> println("Tercer cuadrante")
            x > 0 && y < 0 -> println("Cuarto cuadrante")
            else -> println("El punto se encuentra en un eje")
        }
    }
}
*/
/*
Desafío 3.
*/
/*
fun main(parametro: Array<String>) {
    var negativos = 0
    var positivos = 0
    var multiplo15 = 0
    var sumapares = 0
    for(i in 1..10) {
        print("Ingrese valor:")
        val valor = readLine()!!.toInt()
        if (valor < 0)
            negativos++
        else if (valor > 0)
                positivos++
        if ( valor % 15 == 15)
            multiplo15++
        if (valor % 2 == 0)
            sumapares+=valor
    }
    println("Cantidad de valores negativos: $negativos")
    println("Cantidad de valores positivos: $positivos")
    println("Cantidad de valores múltiplos de 15: $multiplo15")
    println("El valor acumulado de los números ingresados que son pares: $sumapares")
}
*/
/*
Desafío 4.
*/
/*
fun main(argumento: Array<String>) {
        var num1 = 0
        var num2 = 0
        var num3 = 0
        print("Ingrese la cantidad de triángulos:")
        val n = readLine()!!.toInt()
        for (i in 1..n) {
            print("Ingrese lado 1:")
            val lado1 = readLine()!!.toInt()
            print("Ingrese lado 2:")
            val lado2 = readLine()!!.toInt()
            print("Ingrese lado 3:")
            val lado3 = readLine()!!.toInt()
            if (lado1 == lado2 && lado1 == lado3) {
                println("Es un triángulo equilatero.")
                num1++
            } else
                if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    println("Es un triángulo isósceles.")
                    num2++
                } else {
                    println("Es un triángulo escaleno.")
                    num3++
                }
        }
        println("Cantidad de triángulos equilateros: $num1")
        println("Cantidad de triángulos isósceles: $num2")
        println("Cantidad de triángulos escalenos: $num3")
    }

*/
/*
Desafío 5.
*/
/*
fun main(parametro: Array<String>) {
    Cuadrado()
    Multiplicacion()
}

fun Cuadrado() {
    println ("calculo al cuadrado de un Numero")
    print("Ingrese un numero entero:")
    val Num = readLine()!!.toInt()
    val cuadrado = Num * Num
    println("El cuadrado de $Num es $cuadrado") }

fun Multiplicacion() {
    println("Calculo de la multiplicacion entre dos valores")
    print("Ingrese primer valor:")
    val num1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val num2 = readLine()!!.toInt()
    val multiplicacion = num1 * num2
    println("El producto es: $multiplicacion") }

*/
/*
Desafío 6.
*/
/*
fun main(parametro: Array<String>){
    valorMenor()
    valorMenor()
    }
fun valorMenor() {
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    print("Ingrese tercer valor:")
    val valor3 = readLine()!!.toInt()
    print("El Valor Menor de los tres es:")
    if (valor1 < valor2 && valor1 < valor3)
        println(valor1)
       else if(valor2 < valor3)
           println(valor2)
        else println(valor3)
}
*/
