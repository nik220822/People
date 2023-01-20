fun main() {
    println("Введите число лайков")
    val likes = readLine()
//    val likesArray: CharArray = likes!!.toCharArray()
//    val lastIndex= likesArray!!.lastIndex
    val lastIndex = likes!!.lastIndex
//    val text = if (likesArray[lastIndex] == '1') "человеку" else "людям"
    val text = if (likes[lastIndex] == '1') "человеку" else "людям"
    println(text)
}