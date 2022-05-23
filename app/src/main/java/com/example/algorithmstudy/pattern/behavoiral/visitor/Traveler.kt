package com.example.algorithmstudy.pattern.behavoiral.visitor

class Traveler : RegionVisitor {
    override fun visit(region: Region) {
        println("Visiting $region. It\'s so good!")
    }
}
