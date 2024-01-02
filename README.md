## RPNC
Simple reverse polish notation implementation in Kotlin.

The calculator is implemented in a class called RPNC. You can call it's only method `apply()` which receives a string
like `2 2 + 5 *`.

### Implementation breakdown for the apply method
The string is converted to an array separated by spaces, then we loop through the array doing the regular operations
with the stack. When the token does not match one of the four operations it converts the token into double, if it's not
possible, then it converts to null. This helps with ignoring strings such as in our test `testErrors`. The method 
`apply` returns a double.

### Tests
Inside the `src/test/kotlin` we have a test file for the RPNC class.
