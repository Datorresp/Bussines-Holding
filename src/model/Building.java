
package model;

/**
 *
 * @author diegoandrestorres
 */
public class Building {
    
    private int buildingNumber;
    
    private Cubicle[][] cubicles;

    public Building(int buildingNumber) {
        this.buildingNumber = buildingNumber;
        
        cubicles = new Cubicle[buildingNumber][20];
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

}
