package other

sealed class Result<T> {
    class Loading<T> : Result<T>()
    class Success<T>(val value: T) : Result<T>()
    class Error<T>(val error: Throwable) : Result<T>()
}

fun main() {
    Result.Loading<Int>()
    Result.Error<Int>(Throwable())
    Result.Success(5)
}