
package ui;
import java.util.Scanner;
import java.util.ArrayList;
import model.*;



/**
 *
 * @author diegoandrestorres
 */
public class Main {

    private Holding hold;
    private Scanner reader;

    public Main(){
      init();
      reader = new Scanner(System.in);
    }


    public static void main(String[] args) {
    Main m = new Main();
    m.showMenu();
    m.message();
    }


    private void message() {
    System.out.println("**************************");
    System.out.println("/1.Show The Info.        /");
    System.out.println("/2.Add A Company.        /");
    System.out.println("/0.Salir.                /");
    System.out.println("**************************");
    }

    private void init() {
    

    }

    private void showMenu() {
        int userImput = 0;

        while(userImput != 20){

            userImput = reader.nextInt();
            reader.nextLine();

            switch (userImput) {

            case 1:
                infoClient();
                try {
  				Thread.sleep(1500);
  			} catch (InterruptedException e) {

  			}

        message();
        break;

      case 2:
        System.out.println("\n");
              System.out.println("\n");
              System.out.println("\n");
              System.out.println("enter the name");

              String name = reader.nextLine();

              System.out.println("\n");
              System.out.println("Type your nit");

              String nit = reader.nextLine();
      

              System.out.println("\n");
              System.out.println("type your Address");

              String adress = reader.nextLine();

              System.out.println("\n");
              System.out.println("Type your phone");

              String phone = reader.nextLine();

              System.out.println("Enter the quantity");
              int employee = reader.nextInt();
              reader.nextLine();

              System.out.println("Enter the values Assets");
                double valuesAssets = reader.nextDouble();
                reader.nextLine();
                
                System.out.println("Enter the Constitution Date");
                String constitutionDate = reader.nextLine();
                
                System.out.println("Type the type of organization" + "Agriculture, hunting, wild and fish: A" +Company.AGRI_SILVI_HUNT_FISH + '\n' + "Exploitation of mines: B" + Company.EXPLO_MINES_OUARRIES + '\n' + "Manufacturing industry:C" + Company.MANUFACTURING + '\n' + "ELECTRICITY,gas:D" + Company.ELEC_GAS_STEAM + '\n' + "construction:E" + Company.CONSTRUCTION + '\n' + "Wholesale and retail: F" + Company.COMMERCE_MM + '\n' + "Transportation, storage and Communications: G" + Company.TRANS_STORAGE_COMU + '\n' + "Insurance, real estate: H" + Company.EST_INSU_ESTATE_SERV+ '\n' + "Communal, social:I" + Company.SOCIAL_COMUNALS);
                char type= reader.nextLine().charAt(0);
                
                System.out.println("Enter the legal name");
                String legalRepresentative = reader.nextLine();
                
                System.out.println("Enter the registration number before the Ministry of Education");
                int noMen = reader.nextInt();
                reader.nextLine();

                System.out.println("Enter the accreditation years ");
                int acreeditedYear = reader.nextInt();
                reader.nextLine();

                System.out.println("Enter the post the position in knowing 11 (If you are in the Baccalaureate sector, if you do not put 0)");
                int positionSaber11 = reader.nextInt();
                reader.nextLine();

                System.out.println("Enter the position to know Pro (If you are in the university sector, if you do not put 0)");
                int positionSaberPro = reader.nextInt();
                reader.nextLine();

                System.out.println("Enter the name of the rector");
                String principalName = reader.nextLine();

                System.out.println("Enter the education sector");
                String educationSector = reader.nextLine();

                System.out.println("Enter students in strata 1 and 2");
                int amountStudentsStratum1and2 = reader.nextInt();
                reader.nextLine();

                System.out.println("Enter the total number of students");
                int quantity = reader.nextInt();
                reader.nextLine();
                
                System.out.println('\n');
                System.out.println("Building");
                System.out.println('\n');
                System.out.println("building floors");
                
                int floors = reader.nextInt();
                reader.nextLine();

                Building build = new Building(floors);
                
                Company e = new EducationCompany(name,nit,adress,phone,employee,valuesAssets,constitutionDate,type,legalRepresentative,build,noMen,acreeditedYear,positionSaber11,positionSaberPro,principalName,educationSector,quantity, amountStudentsStratum1and2);

                        System.out.println( "Ingrese las encuestas hechas por los usuarios, 1.SI son 10 encuestas,2.NO son mas de 10 (50)");
            int userSel = reader.nextInt();
            reader.nextLine();

            ArrayList<Poll> pollss = new ArrayList<Poll>();

            if(userSel == 1){

              for(int i = 0; i <1; i++){
              System.out.println("Digite el servicio hecho");
              int q = reader.nextInt();
              reader.nextLine();

              System.out.println("Digite el tiempo de respuesta dado");
              int w = reader.nextInt();
              reader.nextLine();

              System.out.println("Digite el costo de relacion por beneficio");
              int x = reader.nextInt();
              reader.nextLine();

              Poll kjr = new Poll(q,w,x);
              pollss.add(kjr);
              hold.addCompanyWithPolls(e,pollss);

              }
            }
              hold.addCompanyWithPolls(e,pollss);


        
        message();
        break;
            }
        }
    }
    
    public void infoClient(){
        
        System.out.println(hold.showInfo());
    }



    private void createCompanies() {
        int addCompanies = 0;

      System.out.println("****************************");
      System.out.println("Choose the type of company:");
      System.out.println("***********SERVICE**********");
      System.out.println("1.Education Company");
      System.out.println("2.Technology Company");
      System.out.println("3.Public Company");
      System.out.println("********Manufacture*********");
      System.out.println("4.Invima");
      System.out.println("6.Exit");
      System.out.println("****************************");
      
        while(addCompanies != 6){ 
            
            addCompanies = reader.nextInt();
            reader.nextLine();

            switch (addCompanies) {

              case 1:
              
              break;
            }
        }
    }
}