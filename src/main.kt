fun main(){
var x=multipleArray(arrayOf(22,11))
    println(x)
    var y=getsum(arrayOf(2,3.4,5.5,"Lark",7.1F))
    println(y)
    var z=novowels(arrayOf('a','j','g','e','i','k'))
    println(z)

}
fun multipleArray(numbers:Array<Int>):Int{
    var multiple=1
    numbers.forEach{number ->
        multiple*=number
}
    return multiple

    }
fun getsum(mixedArray:Array<Any>):Double{
    var sum=0.0
    mixedArray.forEach{num ->
        if (num is Double )
            sum+=num
    }
    return (sum)
}
fun novowels(character:Array<Char>):Int{
    var vowel=0
    character.forEach{char ->

        if (char=='a'||char=='e'||char=='i'||char=='o'||char=='u'){

            vowel++
         }
    }
    return vowel
    }