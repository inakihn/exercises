# Flowable - General Programming Exercises

## Exercise 1 : Weather measures adjustment

Little Merlin wants to become a meteorologist. He measures the temperature of the air each hour so that after several days he has a long sequence of values. However, his instruments are not well calibrated, so the measurements are not exact: they randomly jump up and down by several degrees from the real values. Observing this, Merlin decided to make his data more smooth. To achieve this he only needs every value to be substituted by the average of it and its two neighbors.

For example, if he has a sequence of 5 values like this:

`3 5 6 4 5`

- Then the second (i.e. 5) should be substituted by `(3 + 5 + 6) / 3 = 4.66666666667`
- The third (i.e. 6) should be substituted by `(5 + 6 + 4) / 3 = 5`
- The fourth (i.e. 4) should be substituted by `(6 + 4 + 5) / 3 = 5`

The result should be `3.0, 4.666666666666667, 5.0, 5.0, 5.0`
>Note: By agreement, the first and the last values will remain unchanged.

You have to write the program which helps Little Merlin in this whimsical algorithm of digital signal processing.

## Exercise 2 : Spaceship weight fraud

When a merchant spaceship is fully loaded its total mass is expressed by long integer number, like `31415926`. The Ship's Master wants to tweak this value in documents to increase his profit, because both the tax to be paid and the wages he will receive for his journey are proportional to this mass. He discovered that if he only swaps two digits (not necessarily adjacent) the system will not notice.

So he wants to know two things:

- to which smallest value the original ship mass could be transformed with one digit swap, to decrease the tax that he must pay;
- and also to what largest value the original ship mass could be transformed with one digit swap, to increase the wages he is going to receive.

He can perform only one swap for each value - and there is limitation that resulting value should not start with 0 (so its length is decreased which could be easily noticed).

For the sample value given above the smallest value is `11435926` and the largest is `91415326`.

>Note: the ship mass value will never start with 0

You have to write the program which helps the ship's master maximize his earnings in order to pay his debt with the galactic mafia

## Exercise 3: Phone numbers

In the old times before smartphones, messages where sent with the telephone dial. Each number on it (except 0 and 1) corresponds to three alphabetic characters. Those correspondences are:

```bash

 2 abc  
 3 def  
 4 ghi  
 5 jkl
 6 mno
 7 prs
 8 tuv
 9 wxy

```

> Note: letter z has been omited for the sake of exercise brevity

Given the file dictionary.txt that contains almost 10000 of the most used words in English, write a program that for a given number provides all possible English words. For example, `2327` produces the word `bear`