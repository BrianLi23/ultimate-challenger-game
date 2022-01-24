import processing.core.PApplet;

public class Sketch extends PApplet {

  // This variable determines what stage of the game the player is at
  public int intStage = 0;

  // These variables determine the lives and coins of the player
  public int intLives = 3;
  public int intCoins = 0;

  // This variable keeps track of what page of the introduction the player is on,
  // and the game displays different information depending on this variable
  // value
  public int intIntroduction = 0;

  // This variable keeps track of what level of the obstacle course the player is
  // on, and the game displays a different level depending on this variable
  // value
  public int intLevel = 0;

  // This variable keeps track of what question of the test the player is
  // on, and the game displays a different question/puzzle depending on this
  // variable
  // value
  public int intQuestion = 0;

  // This array keeps track of the x positions of the player for the first
  // challenge
  public int[] intPlayerX = { 20, 20, 20, 20, 20 };

  // This array keeps track of the y positions of the player for the first
  // challenge
  public int[] intPlayerY = { 20, 20, 20, 20, 20 };

  // Variables for tracking WASD keys (in order to handle multiple games for first
  // challenge)

  public boolean WPressed = false;
  public boolean APressed = false;
  public boolean SPressed = false;
  public boolean DPressed = false;

  // Guard Positions (Level 1)
  public int[] intGaurdX1 = { 300, 450 };
  public int[] intGaurdY1 = { 300, 450 };
  public boolean[] boolDirection1 = { true, true };

  // Guard Positions (Level 2)
  public int[] intGaurdX2 = { 300, 450, 150, 200, 300 };
  public int[] intGaurdY2 = { 300, 450, 150, 400, 600 };
  public boolean[] boolDirection2 = { true, true, true, true, true };

  // Guard Positions (Level 3)
  public int[] intGaurdX3 = { 100, 300, 500, 200, 300, 600 };
  public int[] intGaurdY3 = { 250, 200, 150, 400, 600, 300 };
  public boolean[] boolDirection3 = { true, true, true, true, true, true };

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(700, 700);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Ending Screen (if user dies)
    if (intStage == -1) {
      text("You have loss all 3 of your lives, and deemed yourself unworthy of the title of Ultimate Challenger...", 50,
          300);

      // Start Button
      stroke(51, 51, 255);
      strokeWeight(2);
      fill(168, 219, 255);
      rect((width / 2) - 160, height / 2, 300, 100, 20);

      fill(0, 0, 0);
      text("Try Again?", (width / 2) - 100, (height / 2) + 70);

      // Making start button teact to cursor
      if (mouseX >= (width / 2) - 160 && mouseX <= (width / 2) + 140 && mouseY >= (height / 2)
          && mouseY <= height / 2 + 100) {

        stroke(51, 51, 255);
        strokeWeight(2);
        fill(255, 0, 0);
        rect((width / 2) - 160, height / 2, 300, 100, 20);

        fill(255, 255, 255);
        text("Try Again?", (width / 2) - 80, (height / 2) + 70);
      }

      // Checking if the user clicks the start button
      if (mousePressed) {
        // paste all variable
      }
    }

    // Starting Screen
    if (intStage == 0) {

      // Reset Background
      background(91, 193, 252);

      // Variables

      // Display Text
      textSize(60);
      fill(255, 255, 255);
      text("The Ultimate Challenger", (width / 2) - 300, (height / 2) - 100);

      // Start Button
      stroke(51, 51, 255);
      strokeWeight(2);
      fill(168, 219, 255);
      rect((width / 2) - 160, height / 2, 300, 100, 20);

      fill(0, 0, 0);
      text("Start!", (width / 2) - 80, (height / 2) + 70);

      // Making start button teact to cursor
      if (mouseX >= (width / 2) - 160 && mouseX <= (width / 2) + 140 && mouseY >= (height / 2)
          && mouseY <= height / 2 + 100) {

        stroke(51, 51, 255);
        strokeWeight(2);
        fill(255, 0, 0);
        rect((width / 2) - 160, height / 2, 300, 100, 20);

        fill(255, 255, 255);
        text("Start!", (width / 2) - 80, (height / 2) + 70);

        // Checking if the user clicks the start button
        if (mousePressed) {
          intStage += 1;
        }
      }

      // Draw Red Box on Cursor
      noStroke();
      fill(255, 0, 0);
      rect(mouseX, mouseY, 20, 20);

    }

    if (intStage == 1) {

      if (intIntroduction == 0) {

        // Reset Background
        background(91, 193, 252);

        // Text Box 1
        stroke(51, 51, 255);
        strokeWeight(2);

        fill(255, 255, 255);
        rect((width / 3) - 200, 20, 400, 230, 20);

        fill(255, 0, 0);
        textSize(20);
        String textBoxMessage = "Hello fellow red block! My name is... uh... red!\nI am please to meet one of our newest and\nmost promising candidate for the Ultimate\nChallenger! The title of Ultimate Challenger\nis only given to the selected few individuals\nwho can pass our gruesome series of test.";
        text(textBoxMessage, 45, 55);

        // Red Block
        stroke(1);
        fill(255, 0, 0);
        rect(width - 300, height - 300, 275, 275);

        fill(0, 0, 0);
        circle(width - 200, height - 250, 30);
        circle(width - 120, height - 250, 30);

        // Instructions
        text("Use the left and right arrow\nkeys to go forward or back", 50, height - 100);

        // Draw Red Box on Cursor
        noStroke();
        fill(255, 0, 0);
        rect(mouseX, mouseY, 20, 20);

      }

      if (intIntroduction == 1) {

        // Reset Background
        background(91, 193, 252);

        // Text Box
        stroke(51, 51, 255);
        strokeWeight(2);

        fill(255, 255, 255);
        rect((width / 3) - 200, 20, 400, 230, 20);

        fill(255, 0, 0);
        textSize(20);
        String textBoxMessage = "In this challenge, you'll face a series of test,\nfrom a maze, where you have to avoid guards\nfrom catching you, to answering questions\nand solving puzzles to even... a card game.\nJust know that it's all apart of your trials to\nbecome the Ultimate Challenger.";
        text(textBoxMessage, 45, 55);

        // Red Block
        stroke(1);
        fill(255, 0, 0);
        rect(width - 300, height - 300, 275, 275);

        fill(0, 0, 0);
        circle(width - 200, height - 250, 30);
        circle(width - 120, height - 250, 30);

        // Instructions
        text("Use the left and right arrow\nkeys to go forward or back", 50, height - 100);

        // Draw Red Box on Cursor
        noStroke();
        fill(255, 0, 0);
        rect(mouseX, mouseY, 20, 20);
      }

      if (intIntroduction == 2) {

        // Reset Background
        background(91, 193, 252);

        // Text Box 1
        stroke(51, 51, 255);
        strokeWeight(2);

        fill(255, 255, 255);
        rect((width / 3) - 200, 20, 400, 230, 20);

        fill(255, 0, 0);
        textSize(20);
        String textBoxMessage = "Throughout the challenge, you will have\n3 lives, or 3 chances should I say. If you make\n3 mistakes (Getting caught by a gaurd,\nanswering a question wrong, losing a round,\nsmashing your keyboard), the challenge is\nover and you are deemed not worthy.";
        text(textBoxMessage, 45, 55);

        // Red Block
        stroke(1);
        fill(255, 0, 0);
        rect(width - 300, height - 300, 275, 275);

        fill(0, 0, 0);
        circle(width - 200, height - 250, 30);
        circle(width - 120, height - 250, 30);

        // Instructions
        text("Use the left and right arrow\nkeys to go forward or back", 50, height - 100);

        // Draw Red Box on Cursor
        noStroke();
        fill(255, 0, 0);
        rect(mouseX, mouseY, 20, 20);
      }

      if (intIntroduction == 3) {

        // Reset Background
        background(91, 193, 252);

        // Text Box 1
        stroke(51, 51, 255);
        strokeWeight(2);

        fill(255, 255, 255);
        rect((width / 3) - 200, 20, 400, 230, 20);

        fill(255, 0, 0);
        textSize(20);
        String textBoxMessage = "There will also be coins that can be collected\nthroughout the game, either through finding\nsecret passages or completing hidden\nmissions, or they're right out in the open. If\nyou collect _ amount of coins, you will\nbe titled the GRAND Ultimate Challenger!";
        text(textBoxMessage, 45, 55);

        // Red Block
        stroke(1);
        fill(255, 0, 0);
        rect(width - 300, height - 300, 275, 275);

        fill(0, 0, 0);
        circle(width - 200, height - 250, 30);
        circle(width - 120, height - 250, 30);

        // Instructions
        text("Use the left and right arrow\nkeys to go forward or back", 50, height - 100);

        // Draw Red Box on Cursor
        noStroke();
        fill(255, 0, 0);
        rect(mouseX, mouseY, 20, 20);
      }

      if (intIntroduction == 4) {

        // Reset Background
        background(91, 193, 252);

        // Text Box 1
        stroke(51, 51, 255);
        strokeWeight(2);

        fill(255, 255, 255);
        rect((width / 3) - 200, 20, 400, 230, 20);

        fill(255, 0, 0);
        textSize(20);
        String textBoxMessage = "And that's all you need to know for the\nupcoming challenge, I hope you're ready and\nI wish you luck! Let's see if you have what it\ntakes to become the Ultimate Challenger!";
        text(textBoxMessage, 45, 55);

        // Red Block
        stroke(1);
        fill(255, 0, 0);
        rect(width - 300, height - 300, 275, 275);

        fill(0, 0, 0);
        circle(width - 200, height - 250, 30);
        circle(width - 120, height - 250, 30);

        // Instructions
        text("Use the left and right arrow\nkeys to go forward or back", 50, height - 100);

        // Draw Red Box on Cursor
        noStroke();
        fill(255, 0, 0);
        rect(mouseX, mouseY, 20, 20);
      }

      if (intIntroduction == 5) {

        // Reset Background
        background(91, 193, 252);

        // Display Text
        textSize(60);
        fill(255, 255, 255);
        text("Are you ready?", (width / 2) - 190, (height / 2) - 100);

        // Start Button
        stroke(51, 51, 255);
        strokeWeight(2);
        fill(168, 219, 255);
        rect((width / 2) - 160, height / 2, 300, 100, 20);

        fill(0, 0, 0);
        text("Start!", (width / 2) - 80, (height / 2) + 70);

        // Making start button teact to cursor
        if (mouseX >= (width / 2) - 160 && mouseX <= (width / 2) + 140 && mouseY >= (height / 2)
            && mouseY <= height / 2 + 100) {

          stroke(51, 51, 255);
          strokeWeight(2);
          fill(255, 0, 0);
          rect((width / 2) - 160, height / 2, 300, 100, 20);

          fill(255, 255, 255);
          text("Start!", (width / 2) - 80, (height / 2) + 70);

          // Checking if the user clicks the start button
          if (mousePressed) {
            intStage += 1;
          }
        }

        // Draw Red Box on Cursor
        noStroke();
        fill(255, 0, 0);
        rect(mouseX, mouseY, 20, 20);
      }

    }

    if (intStage == 2) {
      if (intLevel == 0) {

        // Reset Background
        background(91, 193, 252);

        // Text 1
        textSize(30);
        fill(0, 0, 0);
        text("Objective: Reach the              area", width / 2 - 125, 150);

        textSize(30);
        fill(25, 153, 17);
        text("green", width / 2 + 137, 150);

        fill(25, 153, 17);
        noStroke();
        rect(width / 2 + 30, 200, 100, 100);

        // Text 2
        textSize(30);
        fill(0, 0, 0);
        text("First Challenge: Reach the End Point", width / 2 - 225, 50);

        // WASD Controls Text
        textSize(30);
        fill(0, 0, 0);
        text("Use WASD keys to move", width / 2 - 300, 375);

        textSize(40);
        text("W", width / 2 - 200, 445);
        text("A", width / 2 - 247, 495);
        text("S", width / 2 - 197, 495);
        text("D", width / 2 - 147, 495);

        // Avoid Guards
        textSize(30);
        fill(0, 0, 0);
        text("Avoid touching guards!", width - 325, height - 180);

        fill(0, 0, 255);
        noStroke();
        rect(width - 150, height - 150, 100, 100);

        // Draw Red Box on Cursor
        noStroke();
        fill(255, 0, 0);
        rect(mouseX, mouseY, 20, 20);

        // Next Button
        stroke(51, 51, 255);
        strokeWeight(2);
        fill(168, 219, 255);
        rect(50, height - 120, 200, 75, 20);

        fill(0, 0, 0);
        textSize(40);
        text("Next!", 100, height - 70);

        // Making start button teact to cursor
        if (mouseX >= 50 && mouseX <= 250 && mouseY >= height - 120
            && mouseY <= height - 45) {

          stroke(51, 51, 255);
          strokeWeight(2);
          fill(255, 0, 0);
          rect(50, height - 120, 200, 75, 20);

          fill(255, 255, 255);
          textSize(40);
          text("Next!", 100, height - 70);

          // Checking if the user clicks the start button
          if (mousePressed) {
            intLevel = 1;
          }
        }

      }

      if (intLevel == 1) {

        // Reset Background
        background(91, 193, 252);

        // WASD Controls
        if (keyPressed) {
          if (WPressed) {
            intPlayerY[0] -= 3;
          }
          if (APressed) {
            intPlayerX[0] -= 3;
          }

          if (SPressed) {
            intPlayerY[0] += 3;
          }

          if (DPressed) {
            intPlayerX[0] += 3;
          }
        }

        // Gaurd movement
        fill(0, 0, 255);
        rect(intGaurdX1[0], intGaurdY1[0], 50, 50);
        rect(intGaurdX1[1], intGaurdY1[1], 50, 50);

        if (intGaurdX1[0] >= width - 70) {
          boolDirection1[0] = false;
        } else if (intGaurdX1[0] <= 20) {
          boolDirection1[0] = true;
        }

        if (boolDirection1[0]) {
          intGaurdX1[0] += 5;
        } else {
          intGaurdX1[0] -= 5;
        }

        if (intGaurdY1[1] >= height - 70) {
          boolDirection1[1] = false;
        } else if (intGaurdY1[1] <= 20) {
          boolDirection1[1] = true;
        }

        if (boolDirection1[1]) {
          intGaurdY1[1] += 5;
        } else {
          intGaurdY1[1] -= 5;
        }

        // Wall
        fill(97, 65, 0);
        rect(0, 0, width, 20);

        fill(97, 65, 0);
        rect(0, 0, 20, height);

        fill(97, 65, 0);
        rect(0, height - 20, width, 20);

        fill(97, 65, 0);
        rect(width - 20, 0, 20, height);

        // Safe Zone
        fill(25, 153, 17);
        rect(width - 200, height - 100, 200, 100);

        // Setting boundaries on walls and access to safe Zone
        if (intPlayerX[0] < 20) {
          intPlayerX[0] = 20;
        }

        if (intPlayerX[0] > (width - 70)) {
          intPlayerX[0] = width - 70;
        }

        if (intPlayerY[0] > (height - 70)) {
          intPlayerY[0] = height - 70;
        }

        if (intPlayerY[0] < 20) {
          intPlayerY[0] = 20;
        }

        if (intPlayerX[0] + 25 > width - 200 && intPlayerY[0] + 25 > height - 100) {
          intLevel += 1;
        }

        // Up and down side
        for (int i = 0; i < intGaurdY1.length; i++) {
          if (intPlayerX[0] + 50 > intGaurdX1[i] && intPlayerX[0] < intGaurdX1[i] + 50
              && intPlayerY[0] + 50 > intGaurdY1[i] && intPlayerY[0] < intGaurdY1[i] + 50) {
            intLives -= 1;
            intPlayerX[0] = 20;
            intPlayerY[0] = 20;
          }
        }

        // Drawing player Cube
        fill(255, 0, 0);
        noStroke();
        rect(intPlayerX[0], intPlayerY[0], 50, 50);

        // Showing Level, Number of Lives, Pause Button
        fill(255, 0, 0);
        textSize(40);
        text("Lives: " + intLives, width - 160, 65);

        fill(255, 0, 0);
        textSize(40);
        text("Level: " + intLevel, width / 2 - 90, 65);

        // Checking if user loses all 3 lives, goes to ending screen
        if (intLives == 0) {
          intStage = -1;
        }
      }

      if (intLevel == 2) {

        // Reset Background
        background(91, 193, 252);

        if (keyPressed) {
          if (keyCode == ALT) {
            intLevel += 1;
          }
        }

        // Showing Level, Number of Lives, Pause Button
        fill(255, 0, 0);
        textSize(40);
        text("Lives: " + intLives, width - 160, 65);

        fill(255, 0, 0);
        textSize(40);
        text("Level: " + intLevel, width / 2 - 90, 65);

        // Checking if user loses all 3 lives, goes to ending screen
        if (intLives == 0) {
          intStage = -1;
        }

        // WASD Controls
        if (keyPressed) {
          if (WPressed) {
            intPlayerY[1] -= 3;
          }
          if (APressed) {
            intPlayerX[1] -= 3;
          }

          if (SPressed) {
            intPlayerY[1] += 3;
          }

          if (DPressed) {
            intPlayerX[1] += 3;
          }
        }

        // Walls
        fill(97, 65, 0);
        rect(0, 0, width, 20);
        rect(0, 0, 20, height);
        rect(0, height - 20, width, 20);
        rect(width - 20, 0, 20, height);

        // Safe Zone
        fill(25, 153, 17);
        rect(width - 200, height - 100, 200, 100);

        // Outer Walls
        if (intPlayerX[1] < 20) {
          intPlayerX[1] = 20;
        }
        if (intPlayerX[1] > (width - 70)) {
          intPlayerX[1] = width - 70;
        }
        if (intPlayerY[1] > (height - 70)) {
          intPlayerY[1] = height - 70;
        }
        if (intPlayerY[1] < 20) {
          intPlayerY[1] = 20;
        }

        // Middle Wall
        fill(97, 65, 0);
        rect(300, 200, 40, 400);

        // Setting Boundary on Top Side
        if (intPlayerX[1] + 50 > 300 && intPlayerX[1] < 300 + 40 && intPlayerY[1] + 50 > 200
            && intPlayerY[1] < 200) {
          intPlayerY[1] = 150;
        }

        // Putting Boundary on Bottom Side
        if (intPlayerX[1] + 50 > 300 && intPlayerX[1] < 300 + 40 && intPlayerY[1] <= 600
            && intPlayerY[1] + 50 >= 600) {
          intPlayerY[1] = 600;
        }

        // Putting Boundary on Left Side
        if ((intPlayerX[1] + 50 > 300 && intPlayerX[1] < 300 && intPlayerY[1] + 50 > 200)
            && (intPlayerY[1] < 200 || intPlayerY[1] < 200 + 400)) {
          intPlayerX[1] = 250;
        }

        // Putting Boundary on Right Side
        if ((intPlayerX[1] <= 340 && intPlayerX[1] + 50 >= 340 && intPlayerY[1] + 50 > 200)
            && (intPlayerY[1] < 200 || intPlayerY[1] < 200 + 400)) {
          intPlayerX[1] = 340;
        }

        // Drawing player Cube
        fill(255, 0, 0);
        noStroke();
        rect(intPlayerX[1], intPlayerY[1], 50, 50);

        // Checking for collision between player and gaurd
        for (int i = 0; i < intGaurdY2.length; i++) {
          if (intPlayerX[1] + 50 > intGaurdX2[i] && intPlayerX[1] < intGaurdX2[i] + 50
              && intPlayerY[1] + 50 > intGaurdY2[i] && intPlayerY[1] < intGaurdY2[i] + 50) {
            intLives -= 1;
            intPlayerX[1] = 20;
            intPlayerY[1] = 20;
          }
        }

        // If player reaches safe zone
        if (intPlayerX[1] + 25 > width - 200 && intPlayerY[1] + 25 > height - 100) {
          intLevel += 1;
        }

        // Gaurd movement
        fill(0, 0, 255);
        rect(intGaurdX2[0], intGaurdY2[0], 50, 50);
        rect(intGaurdX2[1], intGaurdY2[1], 50, 50);
        rect(intGaurdX2[2], intGaurdY2[2], 50, 50);
        rect(intGaurdX2[3], intGaurdY2[3], 50, 50);
        rect(intGaurdX2[4], intGaurdY2[4], 50, 50);

        if (intGaurdX2[0] >= width - 70) {
          boolDirection2[0] = false;
        } else if (intGaurdX2[0] <= 340) {
          boolDirection2[0] = true;
        }

        if (boolDirection2[0]) {
          intGaurdX2[0] += 5;
        } else {
          intGaurdX2[0] -= 5;
        }

        if (intGaurdY2[1] >= height - 70) {
          boolDirection2[1] = false;
        } else if (intGaurdY2[1] <= 20) {
          boolDirection2[1] = true;
        }

        if (boolDirection2[1]) {
          intGaurdY2[1] += 5;
        } else {
          intGaurdY2[1] -= 5;
        }

        if (intGaurdY2[2] >= height - 70) {
          boolDirection2[2] = false;
        } else if (intGaurdY2[2] <= 20) {
          boolDirection2[2] = true;
        }

        if (boolDirection2[2]) {
          intGaurdY2[2] += 5;
        } else {
          intGaurdY2[2] -= 5;
        }

        if (intGaurdY2[3] >= height - 70) {
          boolDirection2[3] = false;
        } else if (intGaurdY2[3] <= 20) {
          boolDirection2[3] = true;
        }

        if (boolDirection2[3]) {
          intGaurdY2[3] += 5;
        } else {
          intGaurdY2[3] -= 5;
        }

        if (intGaurdX2[4] >= width - 70) {
          boolDirection2[4] = false;
        } else if (intGaurdX2[4] <= 20) {
          boolDirection2[4] = true;
        }

        if (boolDirection2[4]) {
          intGaurdX2[4] += 5;
        } else {
          intGaurdX2[4] -= 5;
        }
      }

      if (intLevel == 3) {

        // Reset Background
        background(91, 193, 252);

        // Showing Level, Number of Lives, Pause Button
        fill(255, 0, 0);
        textSize(40);
        text("Lives: " + intLives, width - 160, 65);

        fill(255, 0, 0);
        textSize(40);
        text("Level: " + intLevel, width / 2 - 90, 65);

        // Checking if user loses all 3 lives, goes to ending screen
        if (intLives == 0) {
          intStage = -1;
        }

        // WASD Controls
        if (keyPressed) {
          if (WPressed) {
            intPlayerY[2] -= 3;
          }
          if (APressed) {
            intPlayerX[2] -= 3;
          }

          if (SPressed) {
            intPlayerY[2] += 3;
          }

          if (DPressed) {
            intPlayerX[2] += 3;
          }
        }

        // Outer Wall
        fill(97, 65, 0);
        rect(0, 0, width, 20);
        rect(0, 0, 20, height);
        rect(0, height - 20, width, 20);
        rect(width - 20, 0, 20, height);

        // Safe Zone
        fill(25, 153, 17);
        rect(width / 2 - 100, height / 2 - 100, 200, 200);

        // Wall Surronding Safe Zone
        fill(97, 65, 0);
        rect(width / 2 - 100, height / 2 - 120, 200, 20);
        rect(width / 2 - 120, height / 2 - 120, 20, 240);
        rect(width / 2 - 100, height / 2 + 100, 200, 20);
        rect(width / 2 - 100, height / 2 + 100, 200, 20);
        rect(width / 2 + 100, height / 2 - 120, 20, 80);
        rect(width / 2 + 100, height / 2 + 40, 20, 80);

        // If player reaches safe zone
        if (intPlayerX[2] + 25 <= width / 2 + 100 && intPlayerX[2] + 25 >= width / 2 - 100
            && intPlayerY[2] > height / 2 - 100
            && intPlayerY[2] + 50 < height / 2 + 100) {
          intLevel += 1;
        }

        // Draw player Cube
        fill(255, 0, 0);
        noStroke();
        rect(intPlayerX[2], intPlayerY[2], 50, 50);

        // Making Restrictions on wall

        // Top Side
        if (intPlayerX[2] + 50 >= width / 2 - 120 && intPlayerX[2] <= width / 2 + 120
            && intPlayerY[2] + 50 >= height / 2 - 120 && intPlayerY[2] < height / 2 - 120) {
          intPlayerY[2] = height / 2 - 170;
        }

        // Bottom Side
        if (intPlayerX[2] + 50 >= width / 2 - 120 && intPlayerX[2] <= width / 2 + 120
            && intPlayerY[2] <= height / 2 + 120 && intPlayerY[2] + 50 > height / 2 + 120) {
          intPlayerY[2] = height / 2 + 120;
        }

        // Left Side
        if (intPlayerX[2] + 50 >= width / 2 - 120 && intPlayerX[2] <= width / 2 - 120
            && intPlayerY[2] + 50 >= height / 2 - 120 && intPlayerY[2] <= height / 2 + 120) {
          intPlayerX[2] = width / 2 - 170;
        }

        // Right Side (Top)
        if (intPlayerX[2] <= width / 2 + 120 && intPlayerX[2] + 50 >= width / 2 + 120
            && intPlayerY[2] + 50 >= height / 2 - 120 && intPlayerY[2] <= height / 2 - 40) {
          intPlayerX[2] = width / 2 + 120;
        }

        // Right Side (Bottom)
        if (intPlayerX[2] <= width / 2 + 120 && intPlayerX[2] + 50 >= width / 2 + 120
            && intPlayerY[2] + 50 >= height / 2 + 40 && intPlayerY[2] <= height / 2 + 120) {
          intPlayerX[2] = width / 2 + 120;
        }

        // public int[] intGaurdX3 = { 100, 300, 500, 200, 300 };
        // public int[] intGaurdY3 = { 250, 200, 150, 400, 600 };
        fill(0, 0, 255);
        rect(intGaurdX3[0], intGaurdY3[0], 50, 50);
        rect(intGaurdX3[1], intGaurdY3[1], 50, 50);
        rect(intGaurdX3[2], intGaurdY3[2], 50, 50);
        rect(intGaurdX3[4], intGaurdY3[4], 50, 50);

        fill(160, 32, 240);
        rect(intGaurdX3[3], intGaurdY3[3], 50, 50);
        rect(intGaurdX3[5], intGaurdY3[5], 50, 50);

        if (intGaurdX3[0] >= width - 70) {
          boolDirection3[0] = false;
        } else if (intGaurdX3[0] <= 20) {
          boolDirection3[0] = true;
        }

        if (boolDirection3[0]) {
          intGaurdX3[0] += 5;
        } else {
          intGaurdX3[0] -= 5;
        }

        if (intGaurdY3[1] >= height - 70) {
          boolDirection3[1] = false;
        } else if (intGaurdY3[1] <= 20) {
          boolDirection3[1] = true;
        }

        if (boolDirection3[1]) {
          intGaurdY3[1] += 5;
        } else {
          intGaurdY3[1] -= 5;
        }

        if (intGaurdX3[2] >= height - 70) {
          boolDirection3[2] = false;
        } else if (intGaurdX3[2] <= 20) {
          boolDirection3[2] = true;
        }

        if (boolDirection3[2]) {
          intGaurdX3[2] += 5;
        } else {
          intGaurdX3[2] -= 5;
        }

        if (intGaurdY3[3] >= height - 70) {
          boolDirection3[3] = false;
        } else if (intGaurdY3[3] <= 20) {
          boolDirection3[3] = true;
        }

        if (boolDirection3[3]) {
          intGaurdY3[3] += 5;
        } else {
          intGaurdY3[3] -= 5;
        }

        if (intGaurdX3[3] >= height - 70) {
          boolDirection3[3] = false;
        } else if (intGaurdX3[3] <= 20) {
          boolDirection3[3] = true;
        }

        if (boolDirection3[3]) {
          intGaurdX3[3] += 5;
        } else {
          intGaurdX3[3] -= 5;
        }

        if (intGaurdX3[4] >= height - 70) {
          boolDirection3[4] = false;
        } else if (intGaurdX3[4] <= 20) {
          boolDirection3[4] = true;
        }

        if (boolDirection3[4]) {
          intGaurdX3[4] += 5;
        } else {
          intGaurdX3[4] -= 5;
        }

        if (intGaurdX3[5] >= height - 70) {
          boolDirection3[5] = false;
        } else if (intGaurdX3[5] <= 20) {
          boolDirection3[5] = true;
        }

        if (boolDirection3[5]) {
          intGaurdX3[5] += 5;
        } else {
          intGaurdX3[5] -= 5;
        }

        if (intGaurdY3[5] >= height - 70) {
          boolDirection3[5] = false;
        } else if (intGaurdY3[5] <= 20) {
          boolDirection3[5] = true;
        }

        if (boolDirection3[5]) {
          intGaurdY3[5] += 5;
        } else {
          intGaurdY3[5] -= 5;
        }

        // Outer Walls
        if (intPlayerX[2] < 20) {
          intPlayerX[2] = 20;
        }
        if (intPlayerX[2] > (width - 70)) {
          intPlayerX[2] = width - 70;
        }
        if (intPlayerY[2] > (height - 70)) {
          intPlayerY[2] = height - 70;
        }
        if (intPlayerY[2] < 20) {
          intPlayerY[2] = 20;
        }

        for (int i = 0; i < intGaurdY3.length; i++) {
          if (intPlayerX[2] + 50 > intGaurdX3[i] && intPlayerX[2] < intGaurdX3[i] + 50
              && intPlayerY[2] + 50 > intGaurdY3[i] && intPlayerY[2] < intGaurdY3[i] + 50) {
            intLives -= 1;
            intPlayerX[2] = 20;
            intPlayerY[2] = 20;
          }
        }

      }
      if (intLevel == 4) {

        // Reset Background
        background(91, 193, 252);

        // Display Text
        textSize(40);
        fill(0, 0, 0);
        text("Well, well, well, guess you were\nable to complete the first challenge!", 50, 100);
        text("Let see how well you fare against\nthe next challenge! Puzzle Solving!", 50, 300);

        // Next Button
        stroke(51, 51, 255);
        strokeWeight(2);
        fill(168, 219, 255);
        rect(50, height - 120, 200, 75, 20);

        fill(0, 0, 0);
        textSize(40);
        text("Next!", 100, height - 70);

        // Making next button teact to cursor
        if (mouseX >= 50 && mouseX <= 250 && mouseY >= height - 120
            && mouseY <= height - 45) {

          stroke(51, 51, 255);
          strokeWeight(2);
          fill(255, 0, 0);
          rect(50, height - 120, 200, 75, 20);

          fill(255, 255, 255);
          textSize(40);
          text("Next!", 100, height - 70);

          // Checking if the user clicks the start button
          if (mousePressed) {
            intStage += 1;
          }

        }

      }
    }

    if (intStage == 3) {

      // Reset Background
      background(91, 193, 252);

      // Text 1
      textSize(30);
      fill(0, 0, 0);
      text("Objective: Answer and solve each question and puzzle", width / 2 - 125, 150);

      textSize(30);
      fill(25, 153, 17);
      text("green", width / 2 + 137, 150);

      fill(25, 153, 17);
      noStroke();
      rect(width / 2 + 30, 200, 100, 100);

      // Text 2
      textSize(30);
      fill(0, 0, 0);
      text("Second Challenge: Solve the puzzles, answer questions", width / 2 - 225, 50);

    }

  }

  public void keyPressed() {
    // To handle multiple keys in challenge 1
    if (intStage == 2) {
      if (key == 'w' || key == 'W') {
        WPressed = true;
      }

      else if (key == 's' || key == 'S') {
        SPressed = true;
      }

      else if (key == 'a' || key == 'A') {
        APressed = true;
      }

      else if (key == 'd' || key == 'D') {
        DPressed = true;
      }
    }
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void keyReleased() {
    // Left and right control on stage 1 (Introduction Part)
    if (intStage == 1) {

      if (intIntroduction == 0) {

        if (keyCode == RIGHT) {
          intIntroduction = 1;
        }

      }

      else if (intIntroduction == 1) {
        if (keyCode == RIGHT) {
          intIntroduction = 2;
        }

        if (keyCode == LEFT) {
          intIntroduction = 0;
        }

      }

      else if (intIntroduction == 2) {

        if (keyCode == RIGHT) {
          intIntroduction = 3;
        }

        if (keyCode == LEFT) {
          intIntroduction = 1;
        }

      }

      else if (intIntroduction == 3) {

        if (keyCode == RIGHT) {
          intIntroduction = 4;
        }

        if (keyCode == LEFT) {
          intIntroduction = 2;
        }
      }

      else if (intIntroduction == 4) {

        if (keyCode == RIGHT) {
          intIntroduction = 5;
        }

        if (keyCode == LEFT) {
          intIntroduction = 3;
        }

      }

      else if (intIntroduction == 5) {
        if (keyCode == LEFT) {
          intIntroduction = 4;
        }
      }

    }
    if (intStage == 2) {
      if (key == 'w' || key == 'W') {
        WPressed = false;
      }

      else if (key == 's' || key == 'S') {
        SPressed = false;
      }

      else if (key == 'a' || key == 'A') {
        APressed = false;
      }

      else if (key == 'd' || key == 'D') {
        DPressed = false;
      }
    }

  }

}
