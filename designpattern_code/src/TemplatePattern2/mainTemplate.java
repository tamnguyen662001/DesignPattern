package TemplatePattern2;

public class mainTemplate {
    public static void main(String[] args) {
        StudentDB db = new StudentDB();
        Students sv1 = new Students(1,"Nam","Nha Trang", 19);
        Students sv2 = new Students(2,"Duy","Van Ninh", 18);
        Students sv3 = new Students(2,"Duy update","Van Ninh", 18);

        db.add(sv1);
        db.add(sv2);

        db.display(); 
        System.out.println("==================");
        db.update(sv3);
        db.display();

    }
}
