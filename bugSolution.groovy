```groovy
def myMethod(List<Integer> numbers) {
    if (numbers == null || numbers.isEmpty()) {
        println "Input list is null or empty"
        return
    }
    try {
        numbers.eachWithIndex { number, index ->
            if (number == null) {
                println "Null value encountered at index: $index"
            } else if (number == 0) {
                throw new IllegalArgumentException("Zero is not allowed at index: $index")
            } else {
                println "Number: $number, Index: $index"
            }
        }
    } catch (IllegalArgumentException e) {
        println "Exception caught: ${e.message}"
    }
}

myMethod([1, 2, 0, 4, 5])
myMethod(null)
myMethod([1, 2, null, 4, 5])
```