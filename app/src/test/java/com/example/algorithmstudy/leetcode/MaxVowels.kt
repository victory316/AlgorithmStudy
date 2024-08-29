class MaxVowels {
    fun maxVowels(s: String, k: Int): Int {
        var value = 0
        for(i in 0 until k){
            value += valueOf(s[i])
        }
        var maxValue = value
        for(i in k until s.length){
            value = value - valueOf(s[i - k]) + valueOf(s[i])
            maxValue = Math.max(value, maxValue)
        }
        return maxValue
    }

    inline fun valueOf(c: Char): Int{
        return if(isVowel(c)) 1 else 0
    }

    inline fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
    }
}