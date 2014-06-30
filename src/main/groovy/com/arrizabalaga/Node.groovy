package com.arrizabalaga

/**
 * Created by arrizabalaga on 6/30/14.
 */
class Node {
    String name
    Node zero
    Node one
    boolean theEnd

    Node(String name){
        this.name=name
    }

    boolean isTheEnd(){
        return theEnd
    }

    String toString(){
        "$name:\t${zero?.name}\t${one?.name}\t${theEnd}"
    }

}
