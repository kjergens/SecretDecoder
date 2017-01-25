# SecretDecoder
Secret Decoder

#Skills
Strings, Regular Expressions

#Summary
Don’t let your messages be understood by hackers! You will get messages that have been secretly encoded in the following ways, in this order:

1. All h's not at the beginning of the word became X’s.

2. All two adjacent vowels were surrounded by v's. e.g. "either" became "veivther"

3. Lowercase vowels shifted over: a became e, e became i, i became o, o became u, u became a.

4. Every 3-letter combination with an s in the middle was surrounded by f and r. E.g. "asp" became "faspr"

5. Commas replaced spaces and spaces replaced commas. E.g. "this i know" became "this,i,know"

6. Inserted y as second letter of each word.


Write a Java program to decode the messages.



#Instructions
##Base Assignment (12 points)
1. Git clone the starter code: https://github.com/daltonschool/SecretDecoder.git
(Eclipse > Import... > Git > Project from Git > Clone URI)

2. Open MessageDecoder.java.

3. Run it. See it prints the messages from the text file named “encoded”.

4. Your job is to decode the messages before it prints them.

## Initiative (5 points)
Background: You can also encode images! The images in this project were encoded by switching all the x,y coordinates, e.g. 0.646,2.49 became 2.49,0.646. Open c.svg (included in this project) and you will see the lines were drawn in the wrong places. Same for t.svg and h.svg.


1. Run ImageDecoder.java and Refresh the project.

2. Open decoded.svg. It will look the same as the original.

3. Your job is to decode the images by switching all the x,y coordinates back.

4. If you succeed, decoded.svg will be the correct image.

Hint: This initiative can be done with one line of code.


#Grading Guide:
  
 72 pts for on time.
  
 12 pts for base assignment (2 pts for each decoding rule).
  
 3 pts for documentation including name!
  
 3 pts for style
  
 5 pts for being able to also decode the images in ImageDecoder.java

