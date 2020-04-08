package com.example.shoppinglist

import com.example.shoppinglist.model.ShoppingList

class GetData {

    companion object {

        fun createDataSet() : ArrayList<ShoppingList> {

            val itemList = ArrayList<ShoppingList>()

            itemList.add(
                ShoppingList(
                    "Mermaid Gown",
                    "Lovely gown worn by the Duchess of Montreal for a \n" +
                            "formal meeting with the Queen of England, Queen Victoria at a " +
                            "New York Function ",
                    "https://pixabay.com/illustrations/female-lady-woman-young-happy-3194839/",
                    "$11.80"
                )

            )

            itemList.add(
                ShoppingList(
                    "CockTail Gown",
                    "Look radiant in our next generation of fashion wear \n" +
                            "make a bold statement with your outfit by keeping the world popping " +
                            "and at your feet",
                    "https://pixabay.com/photos/woman-standing-female-caucasian-918784/",
                    "$24.09"
                )

            )


            itemList.add(
                ShoppingList(
                    "Ball Gown",
                    "Radiate in pure beauty and class with our beautiful ball \n" +
                            "gown giving you the fresh feel of a beautiful and unique princess",
                    "https://pixabay.com/vectors/gown-red-robe-wedding-150290/",
                    "$19.99"
                )

            )


            itemList.add(
                ShoppingList(
                    "Morning Gown",
                    "Step out in style with our casual gown collection \n" +
                            "we make sure even when relaxing and chilling, you are never " +
                            "caught out of style",
                    "https://pixabay.com/photos/pretty-woman-in-field-dancing-820477/",
                    "$22.99"
                )

            )


            itemList.add(
                ShoppingList(
                    "Sheath gown",
                    "Explore your sexuality and feel confident and unstoppable \n" +
                            "in our breadth taking sheath gown that fit your body in all angle " +
                            "giving you that sexy body feeling all day",
                    "https://pixabay.com/photos/prom-dress-fashion-girl-female-1450373/",
                    "$16.99"
                )

            )


            itemList.add(
                ShoppingList(
                    "Maxi Gown",
                    "Out partying with friend at the beach, take a look out \n" +
                            "our maxi gown collection keeping you dazzling and in style",
                    "https://pixabay.com/vectors/gown-black-hanger-fashion-clothing-303547/",
                    "$31.99"
                )

            )


            itemList.add(
                ShoppingList(
                    "Vintage Gown",
                    "Step to work in style and completely looking ravishing \n" +
                            "without losing the confidence look and feeling good",
                    "https://pixabay.com/vectors/lady-gown-purple-elegance-307315/",
                    "$27.99"
                )

            )
            return itemList
        }
    }
}