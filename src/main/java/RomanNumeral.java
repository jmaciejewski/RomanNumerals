public class RomanNumeral {
    int number;
    String romanNumerical;
    public RomanNumeral(int number){
        this.number = number;
        this.romanNumerical = "";
        while(number > 0) {
            if(number>=1000)
            {
                romanNumerical += "M";
                number -= 1000;
            }
            else if(number>=900)
            {
                romanNumerical += "C";
                number += 100;
            }
            else if(number>=500)
            {
                romanNumerical += "D";
                number -= 500;
            }
            else if(number>=400)
            {
                romanNumerical += "C";
                number += 100;
            }
            else if(number>=100)
            {
                romanNumerical += "C";
                number -= 100;
            }
            else if(number>=90)
            {
                romanNumerical += "X";
                number += 10;
            }
            else if(number>=50)
            {
                romanNumerical += "L";
                number -= 50;
            }
            else if(number>=40)
            {
                romanNumerical += "X";
                number += 10;
            }
            else if(number>=10)
            {
                romanNumerical += "X";
                number -= 10;
            }
            else if(number>=9)
            {
                romanNumerical += "I";
                number += 1;
            }
            else if(number>=5)
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
