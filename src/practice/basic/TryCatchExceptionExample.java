package practice.basic;



public class TryCatchExceptionExample {

    public static void main(String args[]){
        try {
            findUserByUserName("Khanh Tran");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findUserByUserName (String userName) throws Exception {
        try{
            connectDataBase();
        } catch (Exception e){
            throw new Exception("Cannot connect db. Please check !!!");
        }

        String user = null;

        if(user == null){
            throw new Exception("Cannot found object by user name " + userName);
        }
    }

    public static void connectDataBase () throws Exception {
        Boolean isSuccessful = true;

        if(! isSuccessful){
            throw new Exception("Cannot connect database");
        }
    }
}
