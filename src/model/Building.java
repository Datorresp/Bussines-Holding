
package model;

/**
 *
 * @author diegoandrestorres
 */
public class Building {
    
    private int buildingNumber;
    
    private Cubicle[][] cubicles;
    
    public final void inicializatedCub(){
        for (int i = 0; i < cubicles.length;i++) {
            for (int j = 0; j < cubicles[0].length; j++) {
                cubicles[i][j] = new Cubicle ("",68 + i +j,"","",false);
            }
        }
    }

    public Building(int buildingNumber) {
        this.buildingNumber = buildingNumber;
        cubicles = new Cubicle[buildingNumber][20];
        inicializatedCub();
    }   
    
    

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public Cubicle[][] getCubicles() {
        return cubicles;
    }

    public void setCubicles(Cubicle[][] cubicles) {
        this.cubicles = cubicles;
    }
    
    public void addEmployee(String employeeName, String employeePosition, String employeeEmail){

	boolean found = false;
            for(int i = 0; i < cubicles.length && !found;i++){
                   
                for(int j = 0; j < cubicles[0].length && !found;j++){
                        
                    if(cubicles[i][j].isDisponibility()== false){
                            
               		cubicles[i][j].setEmployeeName(employeeName);
                               
                        cubicles[i][j].setPosition(employeePosition);
                                
			cubicles[i][j].setEmail(employeeEmail);
                        
			cubicles[i][j].setDisponibility(true);                                
                        
			found = true;
                                
			}
                    }
                }
    }
    
    public String routeL(String employeeName){
        
        String msj="";
        int j = 0;
        boolean finalL = false;
        
        for (int i = 0; i < cubicles.length; i++) {
            if (cubicles[i][j].getEmployeeName().equals(employeeName)) {
                
                msj += "La extencion del empleado es: "+cubicles[i][j].getExtention();
            }
            finalL = true;
        }
        
        if (finalL == true) {
            
            
            for (int k = 0; k < cubicles[0].length; k++) {
                
                if (cubicles[j][k].getEmployeeName().equals(employeeName)) {
                    
                    msj += "La extencion del empleado es: " + cubicles[j][k].getExtention();
                }
            }
        }
        return msj;
    }
    
    public String routeZ (String employeeName){

        String msj = "";

        for (int i =0; i < cubicles[0].length; i++){

            if (cubicles[0][i].getEmployeeName().equals(employeeName)){

              msj = "La extencion delempleado es: " + cubicles[0][i].getExtention();

            }
        }

        for (int j = 1; j < cubicles[0].length; j++){

              if(cubicles[j][cubicles[0].length-j].getEmployeeName().equals(employeeName)){

                  msj = "La extencion del empleado es: " + cubicles[j][cubicles[0].length-j].getExtention();
              }

        }

        for(int k= cubicles[0].length -1; k >0 ; k--){

          if(cubicles[cubicles.length][k].getEmployeeName().equals(employeeName)){

            msj = "la extencion del empleado es: " + cubicles[cubicles.length][k].getExtention();
          }
        }
        return msj;
    }
    
    public String routeO(String employeeName){
        
        String msj = "";

        for(int i = 0; i < cubicles[0].length;i++){
            
          if(cubicles[0][i].getEmployeeName().equals(employeeName)){
              
            msj += "la extencion del empleado es: " + cubicles[0][i].getExtention();
            
          }
          
        }

        for(int j = cubicles[0].length-1; j > 0; j--){
            
          if(cubicles[cubicles.length][j].getPosition().equals(employeeName)){
              
            msj += "la extencion del empleado es: " + cubicles[cubicles.length][j].getExtention();
            
          }
          
        }

        for(int k = 0; k < cubicles.length; k++){
            
         if(cubicles[k][0].getEmployeeName().equals(employeeName)){
             
           msj += "la extencion del empleado es: " +cubicles[k][0].getExtention();
           
         }else if(cubicles[k][cubicles[0].length].getEmployeeName().equals(employeeName)){
             
           msj += "la extencion del empleado es: " +cubicles[k][cubicles[0].length].getExtention();
           
         }
         
        }
        return msj;

    }
    
    public String routeE(String employeeName){
        
        String msj = "";

        for(int i = 0; i < cubicles.length;i++){
            
            if(i % 2 == 0){
                
                for(int j = 0; j < cubicles[0].length;j++){
                
                    if(cubicles[i][j].getEmployeeName().equals(employeeName)){
                    
                        msj += "la extencion del empleado es: " + cubicles[i][j].getExtention();
                    }
                }
            }else if(i % 2 != 0){
                
                for(int k = cubicles[0].length-1; k > 0; k--){
                    
                    if(cubicles[i][k].getEmployeeName().equals(employeeName)){
                        
                        msj += "la extencion del empleado es: " + cubicles[i][k].getExtention();
                    }
                }
            }
        }
        return msj;
    }
    
    public String spiralXColumn(String position){
        
        
	String msj = "";
	boolean downRight = false;
	boolean lastUp = false;
	boolean upLeft = false;
	int adder = 0;
	int receiver = 0;

	for(int i = 0; i < cubicles.length;i++){
		
		for(int j = 0; i < cubicles[0].length-adder;  j++){
                    
                    if(cubicles[j][i].getPosition().equals(position)){
                        
                        msj += cubicles[j][i].getEmail();
                    }
                    
                    downRight = true;
                }
	
                if(downRight == true){
                    
                    for(int k = 1; k < cubicles[0].length-adder; k++){
                        
                        if(cubicles[cubicles.length][k].getPosition().equals(position)){
                            
                            msj += cubicles[cubicles.length][k].getEmail();
                            
			}
                        
                    lastUp = true;
                    
                    }
                }

                if(lastUp == true){
                    
                    for(int l = cubicles.length; l > adder; l--){

                        if(cubicles[l][cubicles.length].getPosition().equals(position)){
                            
                            msj += cubicles[l][cubicles.length].getEmail();
                            
                        }
                        
                            upLeft = true;
                            
                    }
                }

                if(upLeft == true){
                    
                    for(int m = cubicles.length-adder; m > receiver ; m--){
                        
                        if(cubicles[receiver][m].getPosition().equals(position)){
                            
                            msj += cubicles[receiver][m].getEmail();
                            
                        }
                    }
                }

                downRight = false;
                lastUp = false;
                upLeft = false;
                adder++;
                receiver++;

	}
	return msj;
    }
    
    public String routeX(String employeeName){
        
        String msj ="";

        
         for(int i = 0; i < cubicles.length;i++){
             
             if(cubicles[i][i].getEmployeeName().equals(employeeName)){
                 
                 msj += "la extencion del empleado es: " + cubicles[i][i].getExtention();
                 
             }
         }

        
          for(int j = 0; j < cubicles.length;j++){
              
            if((cubicles.length % 2 == 0) || (cubicles.length % 2 != 0 && j != cubicles.length/2)){
                
                if(cubicles[j][cubicles.length-1-j].getEmployeeName().equals(employeeName)){
                    
                    msj += "la extencion del empleado es: " + cubicles[j][cubicles.length-1-j].getExtention();
                    
               }
            }
          }

        return msj;
    }
    
    public String espriral(String position){
        
        String msj = "";
	int file1 = 0;
	int file2 = cubicles.length-1;
	int column1 = 0;
	int column2 = cubicles.length-1;

	while(file1 < file2 && column1 < column2){

            for(int i = file1 ; i < file2 ;i++){
                    
                if(cubicles[i][column1].getPosition().equals(position)){
                            
                    msj += "la extencion del empleado es: " + cubicles[i][column1].getEmail();
                        
                }
            }

            column1++;
            
            for(int j = column1 ; j < column2 ; j++){
			
                if(cubicles[file2][j].getPosition().equals(position)){
                    
                    msj += "la extencion del empleado es: " + cubicles[file2][j].getEmail();
		}
            }
		
            file2--;

		
            for(int k = file2; k >= file1 ; k--){
		
                if(cubicles[k][column2].getPosition().equals(position)){
		
                    msj += "la extencion del empleado es: " + cubicles[k][column2].getEmail();
	
                }
		
            }
		
            column2--;

		
            for(int l = column2 ; l >= column1 ; l--){
			
                if(cubicles[file1][l].getPosition().equals(position)){
				
                    msj += "la extencion del empleado es: " + cubicles[file1][l].getEmail();
			
                }
		
            }
		
            file1++;

	}
        return msj;
    }
        
}
