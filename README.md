State diagram challenge
=========

What if someone challenge you to write an evaluator of state diagrams?

This repo contains a simple programming challenge that covers this question under some conditions.

  - Input can only contain 0|1.
  - There are 0|N ending nodes.
  - Input can be any size with or without loops.
  - The evaluator must return true if the input takes you an exit node.

An example of state diagram:




            +----------+
            |    A     |               +--------+
            |          +      1        |   B    <-------+
            +-----+----+--------------->        |       |1
                  |                    |        +-------+
                  |                    +----+---+
                  |0                        |
                  |                         |0
            +-----v----+                    |
            |+--------+|      1        +----v---+
            ||   E    |<---------------+        |
            |+--------+|               |   C    |
            +----------+               |        |
                                       |        |
                                       +----+---+
                                            |0
                                       +----v---+
                                       |        |
                                 +------>  D    <------+
                                0|     |        |      |1
                                 +-----+        +------+
                                       +--------+


Additional notes
----

  - For simplicity I suppose that input is just a string.
  - The sample admits a pretty simple regex that evaluates correctly, but that's useless because you want to create an evaluator for any diagram.