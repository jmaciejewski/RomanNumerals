public class RomanNumeral {
    int number;
    String romanNumerical;
    public RomanNumeral(int number){
        this.number = number;
        this.romanNumerical = "";
    }
    public String getRomanNumeral()
    {
        return this.romanNumerical;
    }

    public int getNumber()
    {
        return this.number;
    }
}
