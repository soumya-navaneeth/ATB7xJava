package Aug2024;

    public class ConsStudent {
        int StuId;
        String StuName;

        //creating a parameterized constructor
        ConsStudent(int i, String n) {
            StuId = i;
            StuName = n;
        }

        ConsStudent(String n) {
            StuName = n;
        }

        //method to display the values
        void display() {
            System.out.println("ID: "+StuId + " Name: " + StuName);
        }
    }
