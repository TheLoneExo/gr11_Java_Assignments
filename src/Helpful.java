public class Helpful {
    /*    triangleArea(double base, double height)
        Description: returns the area of a triangle. Recall A = b*h/2
        Parameters:
        double base - the base of the triangle
        double height - the height of the triangle
        Return: double - the area of the triangle
        Sample input: 6, 8	Sample Output: 24*/
    public static double triangleArea(double base, double height){
        double area = ((base * height) / 2);
        return area;
    }
/*
    average(int n1, int n2, int n3)
    Description: returns the average of 3 numbers (average = (add all numbers)/(number of numbers) example: average of 70 and 78 = (70+78)/2 = 74)
    Parameters: int n1, n2, n3 - are integers to be averaged
    Return: double - the average of the three integers
    Sample input: 65, 70, 75	Sample Output: 70
*/

    public static double average(int n1, int n2, int n3){
        double mean_average = ((n1 + n2 + n3)/3);
        return mean_average;
    }

}
