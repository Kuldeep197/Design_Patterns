package BuilderPattern;

public class Student {
    private final String name;
    private final Integer rollNo;
    private final String className;
    private final String city;

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.className = builder.className;
        this.city = builder.city;
        this.prevSchool = builder.prevSchool;
        this.board = builder.board;
    }

    private final String prevSchool;
    private final String board;

    public String getName() {
        return name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public String getClassName() {
        return className;
    }

    public String getCity() {
        return city;
    }

    public String getPrevSchool() {
        return prevSchool;
    }

    public String getBoard() {
        return board;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", className='" + className + '\'' +
                ", city='" + city + '\'' +
                ", prevSchool='" + prevSchool + '\'' +
                ", board='" + board + '\'' +
                '}';
    }

    public static class StudentBuilder{

        private final String name;
        private final Integer rollNo;
        private String className;
        private String city;
        private String prevSchool;
        private String board;

        public StudentBuilder setClassName(String className) {
            this.className = className;
            return this;
        }

        public StudentBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public StudentBuilder setPrevSchool(String prevSchool) {
            this.prevSchool = prevSchool;
            return this;
        }

        public StudentBuilder setBoard(String board) {
            this.board = board;
            return this;
        }


        StudentBuilder(String name,Integer rollNo){
            this.name = name;
            this.rollNo = rollNo;
        }

        public Student build(){
            return new Student(this);

        }

    }
    public static void main(String...args){
        Student student = new StudentBuilder("prashant",32).setBoard("CBSE").build();
        System.out.println(student);
    }

}
