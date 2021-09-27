package Lesson_5;

public class TaskKnapsack {

    public static void main(String[] args) {
        final int MAX_KNAP = 4;
        Items guitar = new Items("Гитара", 1, 1500);
        Items recorder = new Items("Магнитофон", 4, 3000);
        Items notebook = new Items("Ноутбук", 3, 2000);
        Items iPhone = new Items("Телефон", 1, 2000);

        Items[] items = {guitar, recorder, notebook, iPhone};

        System.out.println("Максимальная вместимость рюкзака равна " + MAX_KNAP);
        System.out.println("Наименование предметов:");

        for (Items s : items) {
            s.printInfoItem();
        }

        System.out.println();
        System.out.println("Максимальная стоимость предметов, вмещающихся в рюкзак:");
        System.out.println(findBestResult(items, items.length - 1, MAX_KNAP));

    }

    private static int findBestResult(Items[] items, int num, int weigth) {
        if (num < 0) {
            return 0;
        }
        if (items[num].getWeigth() > weigth) {
            return findBestResult(items, num - 1, weigth);
        } else {
            return Math.max(findBestResult(items, num - 1, weigth),
                    findBestResult(items, num - 1, weigth - items[num].getWeigth()) + items[num].getPrice());
        }
    }
}

class Items {
    private String name;
    private int weigth;
    private int price;

    public Items(String name, int weigth, int price) {
        this.name = name;
        this.weigth = weigth;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeigth() {
        return weigth;
    }

    public int getPrice() {
        return price;
    }

    public void printInfoItem() {
        System.out.println(this.name + ", вес " + this.weigth + ", цена " + this.price);
    }
}
