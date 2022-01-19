import processing.core.PApplet;

public class Test extends PApplet {

    // This variable determines what stage of the game the player is at
    public int intStage = 0;

    // These variables determine the lives and coins of the player
    public int intLives = 3;
    public int intCoins = 0;

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

            // This variable keeps track of what page of the introduction the player is on,
            // and the game displays different information depending on this varaiable
            // number, when this variable reaches 4, it enters a different stage of the
            // game.
            int intIntroduction = 0;

            // Reset Background
            background(91, 193, 252);

            if (intIntroduction == 0) {

                // Text Box 1
                stroke(51, 51, 255);
                strokeWeight(2);

                fill(255, 255, 255);
                rect((width / 3) - 200, 20, 300, 100, 20);

                fill(255, 0, 0);
                textSize(20);
                text("Hello fellow red block!", 20, 20);

                // Text Box 2
                // rect((width / 2) - 160, 20, 300, 300, 20);

                // Text Box 3
                // rect((width / 2) - 160, 20, 300, 100, 20);

            }
        }

    }

    // define other methods down here.
}