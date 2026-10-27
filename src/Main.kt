//zadacha 1
val sec = readln().toIntOrNull()
fun main()
{
    AgoToText()
}

    fun AgoToText()
    {
        if (sec == null || sec < 0)
        {
            println("Некорректный ввод")
            return
        }
        when (sec) {
            in 0..60 -> println("был(а) только что")
            in 61..60 * 60 -> println("был(а) ${sec / 60} ${minuti()} назад")
            in 60 * 60 + 1..24 * 60 * 60 -> println("был(а) ${sec / 3600} ${chasi()} назад")
            in 24 * 60 * 60 + 1..(24 * 60 * 60) * 2 -> println("был(а) вчера")
            in (24 * 60 * 60) * 2 + 1..(24 * 60 * 60) * 3 -> println("был(а) позавчера")
            else -> println("был(а) давно")
        }
    }

fun minuti(): String
{
    val seconds = sec ?: return "минут"
    val lTD = seconds % 100
    val lD = seconds % 10

    return when {
        lTD in 11..14 -> "минут"
        lD == 1 -> "минута"
        lD in 2..4 -> "минуты"
        else -> "минут"
    }
}

fun chasi(): String
{
    val seconds = sec ?: return "часов"
    val lTD = seconds % 100
    val lD = seconds % 10

    return when
    {
        lTD in 11..14 -> "часов"
        lD == 1 -> "час"
        lD in 2..4 -> "часа"
        else -> "часов"
    }
}

//zadacha 2
//fun main()
//{
//
//}
//
//fun Comisia( TipKarti: String = "VK Pay", PredSumma: Int = 0, summaPerevoda: Int): Double
//{
//    val itog = PredSumma + summaPerevoda
//    return when (TipKarti) {
//        "Mastercard", "Maestro" -> if (itog <= 75_000) 0.0 else (summaPerevoda * 0.6 / 100 + 20)
//        "Visa", "Мир" -> maxOf(35.0,summaPerevoda  * 0.75 / 100)
//        else -> 0.0
//    }
//}