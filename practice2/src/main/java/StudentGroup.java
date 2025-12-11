public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String newGroupName, int newStudentCount){
        this.groupName = newGroupName;
        this.studentCount = newStudentCount;
    }

    String getGroupName(){
        return this.groupName;
    }
    int getStudentCount(){
        return this.studentCount;
    }

    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }

    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }

    void printInfo(){
        System.out.println("The group name is: " + this.groupName + " and it has " + this.studentCount + " students");
    }




}
