class Main {
  public static void main(String[] args) {
    int i;
    int y;
    int z;
    
    for(i=0;i<4;i++){
      if(i==0 || i==2){
        
        for(z=1;z<=4;z++){
          for(y=4;y>=z;y--){System.out.print(" ");}
          for(y=0;y<z;y++){System.out.print("*");}
          for(y=0;y<=z;y++){System.out.print(" ");}
          System.out.print("\n");
          
                    
        }}
    else if(i==1 || i==3){
              for(z=0;z<4;z++){
                  for(y=0;y<=4;y++){System.out.print(" ");}
          for(y=0;y<=z;y++){System.out.print("*");}
                for(y=0;y<=4;y++){System.out.print(" ");}
        System.out.print("\n");}
    }
  }}}
