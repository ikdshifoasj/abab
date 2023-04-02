import java.awt.print.Book;
import java.util.Collections;
import java.util.LinkedList;

public class H {
    public static void main(String[] args) {
        K b1 = new Book("老人与海", 20);
        K b2 = new Book("环游世界", 30);
        K b3 = new Book("追风筝的人", 40);
        K b5 = new Book("sdad", 555);
        K list<Book>= new LinkedList<>();
        list.add(b1);333
        list.add(b2);
        list.add(b3);
        list.add(b5);
        Collections.sort(list);
        System.out.println(list);
    }
        Collections.sort(list, new Comparator()); {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                if (b1.getPrice() < b2.getPrice()) {
                    return 1;
                } else if (b1.getPrice() > b2.getPrice()) {
                    return -1
                } else
                    return 0;
            }
        }
        System.out.println(list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).getPrice() < list.get(i).getPrice()) {
                //接收器
                b4 = list.get(i - 1);
                list.remove(i - 1);
                list.add(b4);
                //向前移动指针
                i--;
            }
        }

    }
