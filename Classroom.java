class Classroom{

    public static void main(String[] args){
        Wilder personOne = new Wilder("Jean-Claude", true);
        Wilder personTwo = new Wilder("Henri", false);

        System.out.println(personOne.whoAmi());
        System.out.println(personTwo.whoAmi());
    }
}