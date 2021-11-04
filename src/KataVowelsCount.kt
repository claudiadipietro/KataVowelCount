class KataVowelsCount {
    fun getCount(str : String) : Int {
        var vowels = arrayOf("a", "e", "i", "o", "u")
        var vowelsCount = 0
        str.forEach{
            var letter = it.toString()
            if (letter in vowels){
                vowelsCount++
            }

        }

        return vowelsCount
    }
}