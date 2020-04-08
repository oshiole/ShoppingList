package com.example.shoppinglist.model

data class ShoppingList(
    var itemTitle: String,

    var itemDescription: String,

    var itemImage: String,

    var itemPrice: String
) {

    override fun toString(): String {
        return "ShoppingList(image='$itemImage', title='$itemTitle', price='$itemPrice', description='$itemDescription')"
    }
}



