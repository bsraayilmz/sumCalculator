public class SimpleCalculator {
    // write your code here
    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    } public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        double adding = firstNumber + secondNumber;
        return adding;
    }
    public double getSubtractionResult(){
        double subtracting = firstNumber - secondNumber;
        return subtracting;
    }
    public double getMultiplicationResult(){
        double multiplying = firstNumber * secondNumber ;
        return multiplying;
    }
    public double getDivisionResult(){
        double dividing = firstNumber / secondNumber;
        if(secondNumber == 0){
            return 0;
        }
        else{
            return dividing;
        }
    }
}
