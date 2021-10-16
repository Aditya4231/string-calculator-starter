package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.equals(""))
        {
    		return 0;
        }
    	else if(input.contains(","))
    	{
    		String [] numbers = input.split(",");
    		return  Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    	}
    	else
    	{
    		return 1;
    	}
    }

}