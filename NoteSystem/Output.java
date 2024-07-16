package NoteSystem;

public class Output {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("FİZİK ", "FZK101", "FZK");
        Course kimya = new Course("KİMYA", "KMY101", "KMY");


        Teacher t1 = new Teacher("İrfan Vural", "90550", "MAT");
        Teacher t2 = new Teacher("İsmail Akdoğan", "90551", "FZK");
        Teacher t3 = new Teacher("Tahsin Altay", "90555", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ömer Faruk", 4, "1234556", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "1234563", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "968687123", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();



    }
}
