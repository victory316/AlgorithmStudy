package com.example.algorithmstudy.pattern.behavoiral.templatemethod

/**
 *  reference :
 *  - http://www.devll.org/blog/2020/kotlin/template-method-pattern.html
 *  - https://kimchanjung.github.io/design-pattern/2020/05/28/template-method-pattern/
 */
abstract class Drink {
    fun prepareDrink() {
        println("prepare ${this.javaClass.simpleName}")

        boilWater()
        addIngredient()
        fillWaterInCup()

        println("Finished preparing drink\n")
    }

    // 템플릿 메소드 : 각 구현 요소에 따라 달라지는 부분
    protected abstract fun addIngredient()

    // 각 구현 요소들이 공통으로 사용하는 부분
    private fun boilWater() = println("Boil water")
    private fun fillWaterInCup() = println("Fill cup with hot water")
}
