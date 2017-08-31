package com.example.afreen.fruitlist;

import java.util.ArrayList;

/**
 * Created by Afreen on 8/23/2017.
 */

public class FruitList {
    private ArrayList<String> fruitList;
    public FruitList()
    {
        fruitList=new ArrayList<String>();
        fruitList.add("Apple" + "The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.");
        fruitList.add("Banana" + "The banana is an edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa.");
        fruitList.add("Chikoo" + "Chikoo is a delicate brown fruit which tastes sweet and yummy. Chikoo is scientifically known as Sapodilla.");
        fruitList.add("Guava" + "Guavas are common tropical fruits cultivated and enjoyed in many tropical and subtropical regions.");
        fruitList.add("Jackfruit"+"The jackfruit, also known as jack tree, fenne, jakfruit, or sometimes simply jack or jak, is a species of tree in the fig, mulberry, and breadfruit family native to South India.");
        fruitList.add("Mango"+"Mangoes are juicy stone fruit from numerous species of tropical trees belonging to the flowering plant genus Mangifera, cultivated mostly for their edible fruit.");
        fruitList.add("Orange"+"The orange is the fruit of the citrus species Citrus × sinensis in the family Rutaceae.");
        fruitList.add("Pear"+"The pear is any of several tree and shrub species of genus Pyrus, in the family Rosaceae.");
        fruitList.add("Watermelon"+"Watermelon Citrullus lanatus var. lanatus is a scrambling and trailing vine in the flowering plant family Cucurbitaceae.");
    }

    public ArrayList<String> getFruitList() {
        return fruitList;
    }
}
