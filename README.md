# SecretDecoder
Secret Decoder

#Skills
Strings, Regular Expressions

#Summary
Don’t let your messages be understood by hackers! You will get messages that have been secretly encoded in the following ways, in this order:

All h's not at the beginning of the word became X’s.

All two adjacent vowels were surrounded by v's. e.g. either became veivther

Lowercase vowels shifted over: a became e, e became i, i became o, o became u, u became a.

Every 3-letter combination with an s in the middle was surrounded by f and r. E.g. asp became faspr

Commas replaced spaces and spaces replaced commas. E.g. this i know became this,i,know

Inserted y as second letter of each word.


Write a Java program to decode the messages.



#Instructions
##Base Assignment (12 points)
Git clone the starter code: https://github.com/daltonschool/SecretDecoder.git
(Eclipse > Import... > Git > Project from Git > Clone URI)

Open MessageDecoder.java.

Run it. See it prints the messages from the text file named “encoded”.

Add code to decode the messages before it prints them.

## Initiative (5 points)
Background: The images in this project were encoded by switching all the x,y coordinates, e.g. 0.646,2.49 became 2.49,0.646.

Open c.svg (included in this project) 

It was encoded which means the lines are drawn in the wrong places.

Also see t.svg and h.svg. They were also encoded.

Run ImageDecoder.java and Refresh the project.

Open decoded.svg. It will look the same as the original.

Add code to decode the image by switching all the x,y coordinates back.

If you succeed, decoded.svg will be the correct image.

Hint: This initiative can be done with one line of code.


#Grading Guide:
  
 72 pts for on time.
  
 12 pts for base assignment (2 pts for each decoding rule).
  
 3 pts for documentation including name!
  
 3 pts for style
  
 5 pts for being able to also decode the images in ImageDecoder.java

