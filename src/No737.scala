/**
  * Created by wqlin on 17-12-1 14:22.
  */
object No737 {
  /**
    * based on union-find
    */
  def areSentencesSimilarTwo(words1: Array[String], words2: Array[String], pairs: Array[Array[String]]): Boolean =
    if (words1.length != words2.length) false
    else {
      //obtain a map that mapping an word to an unique int
      val (map, n) = pairs.foldLeft((Map[String, Int](), 0)) { case ((m, id), Array(word1, word2)) =>
        if (!m.contains(word1) && !m.contains(word2))
          (m + (word1 -> id) + (word2 -> (id + 1)), id + 2)
        else if (!m.contains(word1))
          (m + (word1 -> id), id + 1)
        else if (!m.contains(word2))
          (m + (word2 -> id), id + 1)
        else (m, id)
      }
      val parent = (0 until n).toArray

      //union similar words
      pairs.foreach { case Array(word1, word2) => union(map(word1), map(word2)) }

      def root(p: Int): Int =
        if (p != parent(p)) {
          parent(p) = parent(parent(p))
          root(parent(p))
        } else p

      def connected(p: Int, q: Int) = root(p) == root(q)

      def union(p: Int, q: Int): Unit = {
        val rootP = root(p)
        val rootQ = root(q)
        if (rootP != rootQ)
          parent(rootP) = rootQ
      }

      (words1 zip words2).view.forall { case (word1, word2) =>
        (map.get(word1), map.get(word2)) match {
          case (Some(p), Some(q)) =>
            p == q || connected(p, q)
          case (None, None) => word1 == word2
          case _ => false
        }
      }
    }
}
