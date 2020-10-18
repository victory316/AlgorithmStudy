package com.example.algorithmstudy.pattern.creation

/**
 *  매개변수 팩토리 메소드 패턴
 *
 *  - create에 별도로 parameter를 지정하지 않는 경우 단순 팩토리 메소드 패턴이 됨.
 *  - create에 파라미터를 지정함으로써 원하는 제품을 생성해 반환하도록 함.
 */
abstract class FactoryMethod {
    enum class ProductModel {
        SAMSUMG,
        LG
    }

    fun create(model: ProductModel): Product {
        return when (model) {
            ProductModel.SAMSUMG -> SamsumgProduct()
            ProductModel.LG -> LgProduct()
        }
    }
}

class LgProduct : Product {
    override fun createProduct() {
        println("Created LG Product")
    }
}

class SamsumgProduct : Product {
    override fun createProduct() {
        println("Created Samsung Product")
    }
}