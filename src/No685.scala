import scala.annotation.tailrec

/**
  * Created by wqlin on 17-12-1 14:09.
  */
object No685 {
  def findRedundantDirectedConnection(edges: Array[Array[Int]]): Array[Int] = {
    val length = edges.length
    val parent1 = (0 to length).toArray
    val parent2 = (0 to length).toArray

    var _child = 0 // an child has two parent
    for (i <- 0 until length)
      edges(i) match {
        case Array(p, q) =>
          if (parent1(q) != q) { // if q already has a parent
            parent2(q) = p
            _child = q
          } else {
            parent1(q) = p
            parent2(q) = p
          }
      }

    @tailrec
    def hasLoop(parent: Array[Int], i: Int): Boolean =
      if (parent(i) == i) false
      else if (parent(i) == _child) true
      else hasLoop(parent, parent(i))

    /**
      * if we call this method, there is definitely a cycle and our job is find this cycle.
      * We use union find. If two vertex are already connected, the connection between they
      * are redundant
      */
    def findRedundantDirectedConnection(): Array[Int] = {
      val parent = (0 to length).toArray

      def root(p: Int): Int =
        if (parent(p) != p) {
          parent(p) = parent(parent(p))
          root(parent(p))
        } else p

      def connected(p: Int, q: Int) = root(p) == root(q)

      def union(p: Int, q: Int): Unit = {
        val rootP = root(p)
        val rootQ = root(q)
        parent(rootQ) = rootP
      }

      @tailrec
      def loop(i: Int): Array[Int] = edges(i) match {
        case Array(p, q) =>
          if (connected(p, q)) edges(i)
          else {
            union(p, q)
            loop(i + 1)
          }
      }

      loop(0)
    }

    if (hasLoop(parent1, _child)) Array(parent1(_child), _child)
    else if (_child != 0) Array(parent2(_child), _child)
    else findRedundantDirectedConnection()
  }
}
