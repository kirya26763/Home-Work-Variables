public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var WeightfirstBoxer = 78.2;
        var WeightSecondBoxer = 82.7;
        System.out.println("Первый боксер " + WeightfirstBoxer + " кг");
        System.out.println("Второй боксер " + WeightSecondBoxer + " кг");
        var TotalWeightBoxers = WeightSecondBoxer + WeightfirstBoxer;
        System.out.println("Общий вес боксёров " + TotalWeightBoxers + " кг" );
        var WeightDifference = WeightSecondBoxer - WeightfirstBoxer;
        System.out.println("Разница в весе " + WeightDifference + " кг");
        var FirstHeavierSecond = WeightSecondBoxer % WeightfirstBoxer;
        System.out.println("Второй тяжелее первого на " + FirstHeavierSecond + " кг");

        var AllWorkingHours = 640;
        var EmployeeHours = 8;
        System.out.println("Всего " + AllWorkingHours + " часов на всех сотрудников");
        System.out.println(EmployeeHours + " часов, рабочее время одного сотрудника");
        var TotalEmployees = AllWorkingHours / EmployeeHours;
        System.out.println("Всего работников в компании — " + TotalEmployees + " человек");
        EmployeeHours = AllWorkingHours / (TotalEmployees + 94);
        System.out.println("Если в компании работает " + (TotalEmployees + 94) + " человек, то всего " + EmployeeHours + " часов работы может быть поделено между сотрудниками");

    }
}