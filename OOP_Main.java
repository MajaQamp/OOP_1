package OOP;
import java.util.Scanner;

public class OOP_Main {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            String unesitePrviBroj = "Please enter the first number: ";
            String unesiteDrugiBroj = "Please enter the second number: ";

        Calculator myCalculator=new Calculator(0,0, 3.14159, 0);

        System.out.println("Please select the operation:\n1 - Addition two numbers\n2 - Subtract two numbers\n3 - Multiply two numbers\n4 - Divide two numbers\n5 - Addition several numbers\n6 - Multiply several numbers\n7 - Calculate the area of a circle\nPlease enter your answer:");
            char izbor=reader.nextLine().charAt(0);

            if (izbor=='1'){
                System.out.print(unesitePrviBroj);
                myCalculator.setBrojA(reader.nextInt());
                System.out.print(unesiteDrugiBroj);
                myCalculator.setBrojB(reader.nextInt());
                int sabiranje= myCalculator.sabiranje();
                System.out.println(sabiranje);
            }

            else if (izbor=='2'){
                System.out.print(unesitePrviBroj);
                myCalculator.setBrojA(reader.nextInt());
                System.out.print(unesiteDrugiBroj);
                myCalculator.setBrojB(reader.nextInt());
                int oduzimanje= myCalculator.oduzimanje();
                System.out.println(oduzimanje);
            }

            else if (izbor=='3'){
                System.out.print(unesitePrviBroj);
                myCalculator.setBrojA(reader.nextInt());
                System.out.print(unesiteDrugiBroj);
                myCalculator.setBrojB(reader.nextInt());
                double mnozenje= myCalculator.mnozenje();
                System.out.println(mnozenje);
            }

            else if (izbor=='4'){
                System.out.print(unesitePrviBroj);
                myCalculator.setBrojA(reader.nextInt());
                System.out.print(unesiteDrugiBroj);
                myCalculator.setBrojB(reader.nextInt());
                double dijeljenje= myCalculator.dijeljenje();
                System.out.println(dijeljenje);
            }

            else if (izbor=='5'){
                System.out.println("How many numbers would you like to use?");
                    int n=reader.nextInt();
                    int sum=0;
                System.out.println("Please enter the numbers you want to addition: ");
                    int nizBrojeva[]=new int[n];
                for (int i=0; i<n; i++){
                    nizBrojeva[i]=reader.nextInt();
                }
                for(int i=0;i<n;i++) {
                    sum += nizBrojeva[i];
                }
                System.out.println("The sum of numbers is " + sum);
            }

            else if (izbor=='6'){
                System.out.println("How many numbers would you like to use?");
                    int n=reader.nextInt();
                                    System.out.println("Please enter the numbers you want to multiply: ");
                    int nizBrojeva[]=new int[n];
                for (int i=0; i<n; i++){
                    nizBrojeva[i]=reader.nextInt();
                    }
                    int result=1;
                for(int i=0;i<n;i++) {
                    result *= nizBrojeva[i];
                }
                System.out.println("The sum of numbers is " + result);
            }

            else if (izbor=='7') {
                System.out.print("Please enter the radius: ");
                myCalculator.setRadius(reader.nextDouble());
                double povrsinaKruga = myCalculator.povrsinaKruga();
                System.out.println("The surface of the circle is " + povrsinaKruga);
            }






    }}
