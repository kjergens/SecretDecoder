# Secret Decoder

##Skills
Strings, Regular Expressions

##Summary
Don’t let your messages be understood by hackers! The messages in the project have been secretly encoded in the following ways, in this order:

1. All two adjacent vowels were surrounded by v's. e.g. "either" became "veivther"

2. Lowercase vowels shifted over: a became e, e became i, i became o, o became u, u became a.

3. Every 3-letter combination with an s in the middle was surrounded by f and r. E.g. "asp" became "faspr"

4. Commas replaced spaces and spaces replaced commas. E.g. "this i know" became "this,i,know"

5. Every occurrance of "nn" became "Xd".

6. "yy" was appended to the end of every word.


Write a Java program to decode the secret messages.



##Instructions
###Base Assignment (12 points)
1. Git clone the starter code: https://github.com/daltonschool/SecretDecoder.git
(Eclipse > Import... > Git > Project from Git > Clone URI)

2. Open MessageDecoder.java.

3. Run it. See it prints the messages from the text file named secret_messages.txt.

4. Your job is to decode the messages before it prints them.

### Initiative (5 points)
You can also encode images! The images in this project were encoded by a program that switched all the x,y coordinates, e.g. 0.646,2.49 became 2.49,0.646. 


1. Run ImageDecoder.java and Refresh the project.

2. Open decoded_image.svg. (At first it will look the same as the original.)

3. Your job is to write code to switch all the x,y coordinates back.

4. If you succeed, decoded_image.svg will be the correct image.

Hint: This initiative can be done with one line of code.


##Grading Guide:
  
 72 pts for on time.
  
 12 pts for base assignment (2 pts for each decoding rule).
  
 3 pts for documentation including name!
  
 3 pts for style
  
 5 pts for being able to also decode the images in ImageDecoder.java

