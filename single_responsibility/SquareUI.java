package single_responsibility;

public class SquareUI {

    public void draw() 
    {

        boolean highResDisplay = true;

        if (highResDisplay) 
        {
            // render a high res image of a square
        }
        else 
        {
            // render the normal image
        }

    }

    public void rotate(int degree)
    {

        // rotate the image fo the square clockwise to the required degree and re-render

    }

}
