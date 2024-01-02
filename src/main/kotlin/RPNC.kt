class RPNC {
    fun apply(str: String): Double {
        val strArray = str.split(" ")
        val stack: MutableList<Double> = ArrayList()
        for (t in strArray) {
            when (t) {
                "+" -> stack.add(stack.removeLast() + stack.removeLast())
                "*" -> stack.add(stack.removeLast() * stack.removeLast())
                "-" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.add(b - a)
                }

                "/" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.add(b / a)
                }

                else -> t.toDoubleOrNull()?.let { stack.add(it) }
            }
        }
        return stack[0]
    }
}