/*Java Practical Assignment
March 27, 2018
By Owen, Kevin and Gawshan*/


import java.util.*;//Import the IMPORTant classes for the scanner object and file reader/ buffered reader stuff
import java.io.*;

public class practical {
    public static String[][] filedata =new String[6][1001];
    //Our array that will hold all of the info from the file
    //Reason we want 1001 spots is because of the first line with no actual info about people


    //This is the function that creates the user interface and does the work.
    //It's called over and over again.
    public static void MainMenu() {

        //Our variables and stuff
        Scanner scan=new Scanner(System.in);//Create an instance of the scanner class so we can read user inputs. 

        //Various string variables to hold user inputs, depending on what option they choose in the menu.    
        String column = "";//Column and row numbers for the first option
        String row = "";        
        String name = "";//Name for option 3. It's the full name (first and last)
        String selection = "";//Selection for the main menu (1, 2, 3, 4)
        
        //Output some friendly messages so the user knows what to do.
        System.out.println("Select an option:");
        System.out.println("----------------------------------------");
        System.out.println("1. Enter row and column numbers.");
        System.out.println("2. Display entire data table.");
        System.out.println("3. Enter full name and get email for that person");
        System.out.println("4. Enter ID and get all associated data for that person.");
        System.out.println("5. Quit.");

        //Find out what they inputted
        selection = scan.nextLine();

        //Big if statement, containing the code for each option.
        if (Integer.parseInt(selection)==1)
        {
            //OPTION 1 -> ROW AND COLUMN NUMBERS

            //Tell the user to enter a row number
            System.out.println("");
            System.out.println("Enter row number:");
            System.out.println("----------------------------------------");
            //Get the number they gave us
            row = scan.nextLine();

            //Tell the user to enter a column number
            System.out.println("Enter column number:");
            System.out.println("----------------------------------------");
            //Get the number they gave us
            column = scan.nextLine();  


            //We want to make sure the numbers they gave us are valid, so we don't get errors.
            //This checks to make sure both the row and column numbers are within the right range.
            if (Integer.parseInt(row)>0 && Integer.parseInt(row)<1001 && Integer.parseInt(column)>0 && Integer.parseInt(column)<6) 
            {
                //If the numbers are good, we output a message telling them what spot they chose....
                System.out.println("Data contained at position ("+row+","+column+") is:");    
                //...and then we actually get the info at that position by parsing the row and column variables to ints.         
                System.out.println(filedata[Integer.parseInt(column)][Integer.parseInt(row)]);            
            }   
            else
            {
                //If the numbers aren't good, we tell the user they messed up.
                System.out.println("Invalid row or column number.");         
            }         
        } 
        else if (Integer.parseInt(selection)==2)
        {
            //OPTION 2 -> SHOW THE ENTIRE DATA FILE

            //Just a blank line... don't worry about it
            System.out.println("");

            //Loop through each row, outputting the values for each column in that row.
            for (int x=1; x<1001; x++) {
                System.out.print(filedata[0][x]+" -- "+filedata[1][x]+" -- "+filedata[2][x]+" -- "+filedata[3][x]+" -- "+filedata[4][x]+" -- "+filedata[5][x]+"\r\n");
            } 
            System.out.println("");
            System.out.println("Press enter to continue...");
            scan.nextLine();
        }
        else if (Integer.parseInt(selection)==3)
        {
            //OPTION 3 -> ENTER NAME, GET EMAIL

            //Two variables to store the first and last names later on
            String first = "";
            String last = "";
            //This is important... you'll see
            Boolean skipLoop = false;

            //Prompt for the user
            System.out.println("");
            System.out.println("Enter a name:");
            System.out.println("----------------------------------------");
            //Find out what name they gave us
            name = scan.nextLine();

            //If the name has a space in it (meaning they gave us a first and last like they're supposed to)....
            if (name.contains(" ")==true) {
                //...split the name into an array at the space, get the first part of it (first name) and then... 
                first = name.split(" ")[0];
                //...split the name into an array at the space, get the second part of it (last name) 
                last = name.split(" ")[1];
            }
            else{
                //They didn't give us a full name, so tell them that...
                System.out.println("Please enter a first and last name!");
                //Since the name isn't right, there's no point in looping through the file.
                skipLoop = true;
            }

            for (int x=1; x<=1000; x++) {
                //Loop through the file, but if something went horribly wrong when the user was giving us a name we skip the loop by breaking out right away.
                //Again start at 1, we don't care about the first line of the file
                if (skipLoop==true) {
                    break;
                }
                else if (filedata[1][x].equals(first) && filedata[2][x].equals(last)) {
                    //Else everything went according to plan, so start searching for that name.
                    //Once we found it say: Firstname Lastname's email is:
                    System.out.println(filedata[1][x]+" "+filedata[2][x]+"'s email is:");
                    //Then show the email.
                    System.out.println(filedata[3][x]);
                    //Get out of the loop, we're done here
                    break;
                }
                else if (x==1000){
                    //We've reached the end of the file and haven't found anything. rip.
                    System.out.println("Sorry, that name does not exist in our database.");
                    break;                    
                }
            }
        } 
        else if (Integer.parseInt(selection)==4) 
        {
            //OPTION 4 -> ENTER ID, GET ALL OF THEIR PERSONAL INFO

            //String to hold the id they give us
            String id = ""; 
            //Skiploop does the same thing it did before. No funny business here.           
            Boolean skipLoop = false;
            //Happy little prompt
            System.out.println("");
            System.out.println("Enter an ID number:");
            System.out.println("----------------------------------------");
            //Get the value they give us
            id = scan.nextLine();

            //try to parse the string to an int..........
            try{
                //Check if the ID is within range
                if (Integer.parseInt(id)<=0 || Integer.parseInt(id)>=1001) {
                    //If its out of range tell the user they messed up and tell the program to not loop.
                    System.out.println("Please enter a valid ID!");
                    skipLoop = true;
                }
            }//.........If we can't parse, they haven't entered a number
            catch (NumberFormatException e) {
                //Tell the user they messed up and tell the program to not loop.
                System.out.println("Please enter a valid ID!");
                skipLoop = true;
            }
            
            for (int x=1; x<=1000; x++) {  
                //Again loop through the rows unless something went wrong and we have to skip the loop.
                if (skipLoop==true) {
                    break;
                }              
                else if (filedata[0][x].equals(id)) {
                    //So they gave us the ID and its ok, so we give em what they want
                    System.out.println("All data for ID "+id+":");
                    //Show the data in each column for the row we're in right now, because we know its the right row.
                    System.out.print(filedata[0][x]+" -- "+filedata[1][x]+" -- "+filedata[2][x]+" -- "+filedata[3][x]+" -- "+filedata[4][x]+" -- "+filedata[5][x]+"\r\n");
                    //Get outta here
                    break;
                }
                else if (x==1000){
                    //If we've reached the end and found nothing, that's not good. Tell the user the ID doesn't exist and get out of the loop.
                    System.out.println("Sorry, that ID does not exist in our database.");
                    break;
                }
            }           
        }
        else if (Integer.parseInt(selection)==5) 
        {
            //OPTION 5 -> QUIT

            System.out.println("Application has exited. Trust me look at the tab it says 'Ended.'");
            //Exit the program. I googled this.
            System.exit(0);
        }
        else{
            //They didn't choose 1, 2, 3, 4 or 5.
            System.out.println("");
            //Tell them they messed up real bad
            System.out.println("That isn't a valid option!");
        }
        //Some blank lines to make everything look nice 
        System.out.println("");
        System.out.println(""); 
        //End of the function.
    }


    public static void main(String[] args) {   	
    	//PROGRAM STARTS RIGHT HERE

        //Try to read the file....
    	try{
            //Setup a file reader and buffered reader
    		FileReader fr=new FileReader("dataFile2D.csv");
    		BufferedReader br=new BufferedReader(fr);

            //Get that first line.
            String line = br.readLine();
    		int count = 1;//Start at 1, that way row #1 is the one with id #1. Count is like the row number.
            //yay loops. Keep going until the next line has absolutely nothing
    		while(line != null)
    		{    			
    			//If we've gone past the end of the file for whatever reason, stop.
    			if (count == 1001)
    			{
    				break;
    			}
                //Otherwise, everything is a-ok
    			else
    			{
                    //Get the next line
                    line = br.readLine();
                    //Split it up into an array by the commas
    				String[] info = line.split(",");
    				
                    //Loop through that array that we just made
    				for (int x = 0; x<info.length; x++) {
                        //At the current row, put each element of that mini array into the file data array.
    					filedata[x][count] = info[x];
                        //Basically we fill each column in row 1, then move on to the next row and do it again.
    				}    				
    			} 
                count++;//Next row!
    		}

            //After we've got all of our info ready, do stuff

            //Greeting message
            System.out.println("Welcome!");

            //Infinite loop!
            while (1==1)
            {
              MainMenu();//Call the function that does the stuff.
            }   
    	}
    	catch(IOException e){
            //Oh yeah, we're in a try-catch thing. 
            //If the file can't be read for something tell the user that we're sorry and we tried our very best but there's nothing we can do for them.
    		System.out.println("Uh-oh... File not found...");
    	}    	
    }
}