import java.util.*;
public class ComparingArrays {
int [] array1; //stores 4 numbers
int [] array2; // another 4 numbers
Scanner console = new Scanner (System.in);
System.out.println("Enter 4 numbers:");
array1 = console.nextInt();
//int[] firstArray = { 2, 4, 6, 8, 10 };  used as test
//int[] secondArray = { 2, 4, 6, 8, 10 }; used as test
boolean arraysEqual = true;
int i = 0;
// determines if they are the same size because that helps with determing positions
if (array1.length != array2.length)
arraysEqual = false;
// Next determine whether the elements contain the same data 
while (arraysEqual && i < array1.length)
{
if (array1[i] != array2[i])
arraysEqual = false;
i++;
}
if (arraysEqual) 
System.out.println("The arrays are equal.");
else
System.out.println("The arrays are not equal.");

}
