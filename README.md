
<h1>Secret Decoder</h1>

<h2>Skills</h2>
Strings, Regular Expressions

<h2>Summary</h2>
You will write two Java programs: one to decode secret messages and one to decode secret images. Hint: Use the <a href="RegularExpressions.pdf">Regular Expressions cheat sheet</a>.

<h2>Instructions</h2>
<h3>Base Assignment: MessageDecoder (12 points)</h3>
Don’t let your messages be understood by hackers! There is a file in this project secret_messages.txt. It contains 3 messages, but to keep them safe from hackers, they were first encoded in the following ways, in this order:

1. All two adjacent vowels were surrounded by v's. e.g. "either" became "veivther"

2. Lowercase vowels shifted over: a became e, e became i, i became o, o became u, u became a.

3. Every 3-letter combination with an s in the middle was surrounded by f and r. E.g. "asp" became "faspr"

4. Commas replaced spaces and spaces replaced commas. E.g. "this i know" became "this,i,know"

5. Every occurrance of "nn" became "Xd".

6. "yy" was appended to the end of every word.

Here are the instructions to get started:

1. Git clone the starter code: https://github.com/daltonschool/SecretDecoder.git
(Eclipse > Import... > Git > Project from Git > Clone URI)

2. Open MessageDecoder.java.

3. Run it. See it prints the messages from secret_messages.txt.

4. Your job is to decode the messages before it prints them.

<h3> Initiative: SvgImageDecoder (5 points)</h3>
You can also encode images! The images in this project were encoded by switching all the x,y coordinates to y,x, e.g. 0.646,2.49 became 2.49,0.646. Any pair that included a negative number was ignored, so you do not have to handle negative numbers.

1. First, let's make it easier to see the images. Here are the steps:
  * Control-click on secret_image1.svg to get the menu.
  * Select Open With, Other..., Internal Web Browser, then PAUSE.
  * Select the 2 check boxes, select OK. Now all the images will open in a new tab in Eclipse.
  * Double-click an image to test it out.

2. Run SvgImageDecoder.java.

3. Open the decoded images. (At first they will look the same as the original.)

3. Your job is to write code to switch all the x,y coordinates back.

4. After each change you make to SvgImageDecoder, run it and refresh the decoded_image in the Internal Web Browser.

5. If you succeed, the decoded images will go back to their original form. 

Hint: This initiative can be done with one line of code.


<h2>Grading Rubric:</h2>
  
 72 pts for on time.
  
 12 pts for base assignment (2 pts for each decoding rule).
  
 3 pts for documentation including name!
  
 3 pts for style
  
 5 pts for also decoding the images

