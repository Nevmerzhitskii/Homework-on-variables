public class Main {
    public static void main(String[] args) {
        var dog = 8d;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача № 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача № 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача № 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача № 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача № 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача № 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
       System.out.println("Общий вес боксеров " + (firstBoxerWeight + secondBoxerWeight) +" кг");
       System.out.println("Разница в весе боксеров " + (secondBoxerWeight - firstBoxerWeight) + " кг" );



        System.out.println("Задача № 7");

        var differnceWeightBoxers = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе " + differnceWeightBoxers  + "кг!");
        var differenceWithDivision = ("Разница в весе " + secondBoxerWeight % firstBoxerWeight + "кг!" ) ;
        System.out.println(differenceWithDivision);

        System.out.println("Задача № 8");
        var ollWorkHours = 640;
        var employeeHours = 8;
        var totalEmployee = ollWorkHours / employeeHours;
        System.out.println("Всего работников в компании " + totalEmployee + " человек");

        var ollEmployee = totalEmployee + 94;
        var totalHours = ollEmployee * 8;
        System.out.println("Если в компании работает " + ollEmployee + " человек, то всего "
                + totalHours + " часов работы может быть поделено между сторудниками." );



    }
}
