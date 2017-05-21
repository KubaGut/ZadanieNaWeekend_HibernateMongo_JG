import hibernate_MongoDB.Mongo;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        long startTime = System.currentTimeMillis();

        Mongo.saveObjectToDataBase();
        Mongo mongo = new Mongo();
        mongo.countSubordinates(200);
        mongo.showSubordinates();

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println(totalTime);

    }
}
