```groovy
def myMethod(List<Integer> numbers) {
    numbers.eachWithIndex { number, index ->
        if (number == 0) {
            throw new IllegalArgumentException("Zero is not allowed")
        }
        println "Number: $number, Index: $index"
    }
}

myMethod([1, 2, 0, 4, 5])
```