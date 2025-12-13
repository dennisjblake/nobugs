public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int newStudentID, String newStudentName){
        this.studentID = newStudentID;
        this.studentName = newStudentName;
    }

    static void changeUniversityName(String newName){
        universityName = newName;
    }

    void getStudentName(String newStudentName){
        this.studentName = newStudentName;
    }

    void printStudentInfo(){
        System.out.println("Student name: " + this.studentName + " ID: " + this.studentID + " University: " + universityName);
    }


}
