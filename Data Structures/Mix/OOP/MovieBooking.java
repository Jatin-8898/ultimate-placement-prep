import java.util.*;

class Matrix{
    String screen;
    int rows;
    int seats;
    boolean[][] mat;

    Matrix(String screen, int rows, int seats, boolean[][] mat){
        this.screen = screen;
        this.rows = rows;
        this.seats = seats;
        this.mat = new boolean[rows][seats];
    }
}

class MovieBooking {
    
    public static List<Matrix> list = new LinkedList<>();
    
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);
        int t = s.nextInt();        
        
        while(t-- > 0){
            
            String type = s.next();        
            if(type.equals("add-screen")){
                
                String name = s.next();
                int rows = Integer.parseInt(s.next());
                int seats = Integer.parseInt(s.next());
                boolean mat[][]  = new boolean[rows][seats];
                
                /* while(s.hasNextLine()){
                    int a = Integer.parseInt(s.next());  
                    System.out.print(a);
                } */

                Matrix ob = new Matrix(name, rows, seats, mat);
                if(!list.contains(ob)){
                    list.add(ob);
                    System.out.println("success");
                }else
                    System.out.println("failure");

                for(Matrix m : list){     
                    System.out.println(m.screen+ " "+m.rows +" "+m.seats+" ");
                }
            
            }else if(type.equals("reserve-screen")){
            
                String name = s.next();
                int rows = Integer.parseInt(s.next());
                int seats = 0;
                boolean[][] temp = new boolean[rows][seats];
                
                /* ListIterator<Matrix> it = list.listIterator();
                while(it.hasNext()){
                }   */ 
                for(Matrix m : list){  
                    if(name.equals(m.screen)){
                        System.out.println(m.screen + " here" + " " +m.seats);
                        temp = m.mat;
                        seats  = m.seats;
                    }
                }

                while(s.hasNext()){
                    int noOfSeats = s.nextInt(); 
                    if(temp[rows][noOfSeats] == true){
                        System.out.println("failure Seat already reserved");
                        break;
                    }
                    temp[rows][noOfSeats] = true;           //Mark the cell as reserved
                } 
                list.add(new Matrix(name, rows, seats, temp));
                System.out.println("success");

                for(Matrix m : list){     
                    System.out.println(m.screen+ " "+m.rows +" "+m.seats+" ");
                }

            }
            else if(type.equals("get-unreserved-seats")){
            
                String name = s.next();
                int rows = Integer.parseInt(s.next());
                int seats = 0;
                boolean[][] temp = new boolean[rows][seats];

                for(Matrix m : list){  
                    if(name.equals(m.screen)){
                        temp = m.mat;
                        seats  = m.seats;
                    }
                }
                
                for (int i = 0; i < seats; i++) {   //      < seats
                    if(temp[rows][i] == false){
                        System.out.print(temp[rows][i]);    
                    }else{
                        System.out.println("failure seats is already booked");
                    }

                } 
                list.add(new Matrix(name, rows, seats, temp));
                System.out.println("success");

            }
            else if(type.equals("suggest-contigous-seats")){
            
                String name = s.next();
                int seats = Integer.parseInt(s.next());
                int rows = Integer.parseInt(s.next());
                int choice = Integer.parseInt(s.next());
                boolean[][] temp = new boolean[rows][seats];

                for(Matrix m : list){  
                    if(name.equals(m.screen)){
                        temp = m.mat;
                    }
                }
                
                for (int i = 0; i < seats; i++) {   //      < seats
                    if(temp[rows][i] == false)
                        System.out.print(temp[rows][i]);    
                } 
                list.add(new Matrix(name, rows, seats, temp));

            }
        }
        s.close();
    }
}
