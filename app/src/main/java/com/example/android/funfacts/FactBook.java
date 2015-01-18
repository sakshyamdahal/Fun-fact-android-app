package com.example.android.funfacts;

import java.util.Random;

/**
 * Created by sakshyamdahal on 1/14/15.
 */
public class FactBook {

    // member variables
    public String[] mFacts = {
            "In space you cannot cry because there is no gravity to make the tears flow.",
            "Elephants have the longest pregnancy in the animal kingdom at 22 months. The longest human pregnancy on record is 17 months, 11 days.",
            "California consumes more bottled water than any other product.",
            "In 1936, American track star Jesse Owens beat a race horse over a 100-yard course. The horse was given a head start.",
            "A man will ejaculate approximately 18 quarts of semen in his lifetime.",
            "It is estimated that millions of trees are planted by forgetful squirrels.",
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };


    // method to return a random fact
    public String getFact()
    {
        String fact = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }


}
