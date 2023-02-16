public class Figure {
    double height;
    double width;
    double length;
    public Figure(){
    }
    public Figure (double figureHeight, double figureWidth, double figureLength ){
        this.height = figureHeight;
        this.width = figureWidth;
        this.length = figureLength;
    }
    public double calculateVolume () {
        double volume;
        volume = this.height * this.width * this.width;
        return volume;
    }
    public double calculateFigureSurfArea (){
        double a = this.width;
        double b = this.length;
        double h = this.height;
        double square ;
        square = 2 * ( this.height * this.length + this.width * this.height + this.length * this.height) ;
        return square ;
    }



}



