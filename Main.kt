import kotlin.math.sqrt

fun main(args: Array<String>) {
    var point1: point=point(2.3f, 4.2f)
    var point2: point=point(1.3f, 3.7f)
    println(point1)
    println(point2)
    point1.flip()
    point2.flip()
    println(point1)
    println(point2)
    println(point1.equals(point2))
    println(point1.distance(point2))

}
class point(x: Float, y: Float){
    var X: Float=x
    var Y: Float=y
    override fun toString(): String {
        return X.toString()+" "+Y.toString()
    }
    fun equals(point2: point): Boolean {
        return point2.X == X && point2.Y == Y
    }
    fun flip(){
        X = -X
        Y = -Y
    }
    fun distance(point2: point): Float {
       return sqrt((X-point2.X)*(X-point2.X)+(Y-point2.Y)*(Y-point2.Y))
    }
}
