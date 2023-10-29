class Task113 {
    public static void main (String[] args){
        int Check_Number=10;
        String message;
        for (int i=1; i<= Check_Number; i++){
            message = (i%2==0) ? i+ " is even number" : i+ " is odd number";
            System.out.println(message);
        }
    }
}
