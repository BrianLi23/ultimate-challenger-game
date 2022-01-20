import processing.core.PApplet;

public class Sketch extends PApplet {

  // This variable determines what stage of the game the player is at
  public int intStage = 0;

  // These variables determine the lives and coins of the player
  public int intLives = 3;
  public int intCoins = 0;

  // This variable keeps track of what page of the introduction the player is on,
  // and the game displays different information depending on this varaiable
  // number, when this variable reaches 4, it enters a different stage of the
  // game.
  public int intIntroduction = 0;

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

    }

  }

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

        else if (intIntroduction == 4) {

          if (keyCode == RIGHT) {
            intIntroduction = 5;
          }

          if (keyCode == LEFT) {
            intIntroduction = 3;
          }

        }

      }

    }

  }
}