class maxDistToClosest {
    
   public int maxDistToClosest(int[] seats) {
  
      
        // int  count = -1; // 1 seat already empty
        // int distance = 0; 
         int distance = -1; // just a flag for 1st process
         int available = -1; // because 1 seat already occupied
        for( int i = 0; i < seats.length; i++ ) {          
               available++;         
            // REMEMBER...this is a loop
            if (seats[i] == 1) {  //if we encounter an occupied seat 
                
                if (distance == -1){ //if there is only 1 occupied seat (front or back)
                distance = available; //just return the amount of empty seats
                } 
                else { // distance > -1 ...if there is an occupied seat front and back
                distance = Math.max(distance, available / 2 );  
                } 
                
            available = 0; //reset 'available' after EVERY TIME it goes out of ifelse
            }   
            
        }
     // Use Math.max in case input is [1,0,0,0].. because if statement can't run after last 0 to pass value of 'available' to 'distance'. In this case, we are using value of 'available'
     return Math.max(distance, available) ;
    
   }

}

// Example input and output:
// Input: [1,1,0,0,0,0,0,1,0,0,1]
// Output: 3
// Input: [0,0,0,0,0,1,0,0,1]
// Output: 5