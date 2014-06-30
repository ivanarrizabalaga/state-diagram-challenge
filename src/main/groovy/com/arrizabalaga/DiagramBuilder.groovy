package com.arrizabalaga

/**
 * Created by arrizabalaga on 6/30/14.
 */
class DiagramBuilder {
    Node build(List l){
        Map nodes=[:]
        //Step 1: create nodes
        l.each{
            nodes.put(it.name,new Node(it.name))
        }
        //Step 2: attach neighbours
        l.each{
            //Take current node
            Node node=nodes.get(it.name)
            //Search & set neighbours
            node.one=nodes.get(it.oneAction)
            node.zero=nodes.get(it.zeroAction)
            //Set info
            node.theEnd=it.theEnd
        }

        l.each{
            Node node=nodes.get(it.name)
            println node
        }
        //Step 3: return first node
        return nodes.get(l[0].name)
    }
}
