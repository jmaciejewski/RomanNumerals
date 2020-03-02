public class RomanNumeral {
    int number;
    String romanNumerical;
    public RomanNumeral(int number){
        this.number = number;
        this.romanNumerical = "";
        while(number > 0) {
            if(number>=5)
            {
                romanNumerical += "V";
                number -= 5;
            }
            else if(number>=4)
            {
                romanNumerical += "I";
                number += 1;
            }
            else {
            romanNumerical += "I";
            number -= 1;
            }
        }
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
