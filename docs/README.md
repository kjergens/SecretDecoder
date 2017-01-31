
<h1>Secret Decoder</h1>

<h2>Skills</h2>
Strings, Regular Expressions

<h2>Summary</h2>
<p>
Don’t let your messages be understood by hackers! There is a file in this project secret_messages.txt. It contains messages that have been encoded in the following ways, in this order:</p>

<ol>
<li>1. All two adjacent vowels were surrounded by v's. e.g. "either" became "veivther"

<li>2. Lowercase vowels shifted over: a became e, e became i, i became o, o became u, u became a.

<li>3. Every 3-letter combination with an s in the middle was surrounded by f and r. E.g. "asp" became "faspr"

<li>4. Commas replaced spaces and spaces replaced commas. E.g. "this i know" became "this,i,know"

<li>5. Every occurrance of "nn" became "Xd".

<li>6. "yy" was appended to the end of every word.
</ol>

<p>Write a Java program to decode the secret messages. Hint: Use the <a href="RegularExpressions.pdf">Regular Expressions cheat sheet</a>.</p>




<h2>Instructions</h2>
<h3>Base Assignment (12 points)</h3>
1. Git clone the starter code: https://github.com/daltonschool/SecretDecoder.git
(Eclipse > Import... > Git > Project from Git > Clone URI)

2. Open MessageDecoder.java.

3. Run it. See it prints the messages from secret_messages.txt.

4. Your job is to decode the messages before it prints them.

<h3> Initiative (5 points)</h3>
You can also encode images! The images in this project were encoded by a program that switched all the x,y coordinates, e.g. 0.646,2.49 became 2.49,0.646. 

1. Open the secret images included in this project. (Control-click on secret_image1.svg, Open With, Other..., Internal Web Browser, select the 2 check boxes, select OK. Now all the images will open in a new tab.)

2. Run ImageDecoder.java.

3. Open the decoded images. (At first they will look the same as the original.)

3. Your job is to write code to switch all the x,y coordinates back.

4. If you succeed, the decoded images will go back to their original form.

Hint: This initiative can be done with one line of code.


<h2>Grading Guide:</h2>
  
 72 pts for on time.
  
 12 pts for base assignment (2 pts for each decoding rule).
  
 3 pts for documentation including name!
  
 3 pts for style
  
 5 pts for also decoding the images

