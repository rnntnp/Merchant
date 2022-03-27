# Merchant
 2021-1 JAVA PROGRAMMING LAB final project
## 1. Briefly describe the project purpose:<br>
This is a game which you can experience being a merchant.<br>
The goal is to make your amount of money greater than some value,
by buying cheap items from an npc(non player character) merchant and selling them expensive to another npc merchant.

## 2. Draw the logic flow of the program (with flowchart):<br>
<img width="460" alt="image" src="https://user-images.githubusercontent.com/60357053/160287147-0263b03f-a5ad-480c-9c6a-4f398e09f2eb.png">

## 3. Provide screenshots for each screen with brief description:<br>
<img width="460" alt="image" src="https://user-images.githubusercontent.com/60357053/160287176-e8f32728-be3d-4531-a922-053aab125346.png"><br>
Main page: you can choose a merchant to trade with.<br>
<img width="460" alt="image" src="https://user-images.githubusercontent.com/60357053/160287482-ec45abf9-3a1f-4864-bd35-003d70451da5.png">
<img width="460" alt="image" src="https://user-images.githubusercontent.com/60357053/160287509-228cef82-b6be-40e5-b6bc-c66c70e31dcc.png">
<br>Merchant Page: you can buy or sell items<br>
<img width="460" alt="image" src="https://user-images.githubusercontent.com/60357053/160287462-0d72528d-f3b8-4f29-acb3-d5ca55afd382.png">
<br>My Inventory: you can check your item, and its stock.<br>
<img width="460" alt="image" src="https://user-images.githubusercontent.com/60357053/160287637-5ca99ca7-79bb-49fa-912b-29888cb321c1.png">
<br>Output file: when the game is cleared(you earned 100G), You can see the history.<br>
## 4. Explain what is included in your project and why it is used (Polymorphism, Inheritance, File I/O, etc)
-Polymorphism:
   At class [Player](https://github.com/rnntnp/Merchant/blob/main/src/Player.java), I needed to store the page that the user was at just before entering the “Player” page. <br>Since I don’t know the exact class of the previous page, I declared it as **Jframe** [lastScreen](https://github.com/rnntnp/Merchant/blob/main/src/Player.java#L21), which every kinds of pages inherits.
 <br><br>-Inheritance:
   Class [Merchant](https://github.com/rnntnp/Merchant/blob/main/src/Merchant.java) and [Player](https://github.com/rnntnp/Merchant/blob/main/src/Player.java) inherits class [Inventory](https://github.com/rnntnp/Merchant/blob/main/src/Inventory.java). 
   <br>They have panel with the title on(green,magenta or cyan),blue panel, yellow panel, and panel where items are shown in common.
<br><br>-File I/0:
   File output is used to make a file when the user clears the game.
   The file shows the history of buying and selling at that game.
<br><br>-Threads:
   I tried threads to make flickering effect of the text when the game is cleared. See [TextEffect.java](https://github.com/rnntnp/Merchant/blob/main/src/TextEffect.java).
