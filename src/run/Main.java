package run;

import books.Book;
import books.FictionBook;
import books.ProgrammingBook;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
// Con -> Cha (upcasting)
// 1 danh sách hoặc 1 tập hợp cùng kiểu cha dễ duyệt các thuộc tính
// và phương thức chung
        books[0] = new FictionBook();
        books[1] = new FictionBook();
        books[2] = new ProgrammingBook();
        for (Book b: books
             ) {
            b.getPrice();
        }
//        Ép kiểu Cha -> Con
//        books[0] đang từ kiểu Book ép sang FictionBook
//        (Kiểu dữ liệu muốn ép)tên biến muốn ép
//        Kiểm tra xem biến đó có thuộc kiểu dữ liệu mình mong muốn hay không?
//        Muốn dùng các phương thức và thuộc tính điển hình của lớp con
        System.out.println(books[2] instanceof Book);
        if (books[2] instanceof FictionBook){
            System.out.println(((FictionBook)books[2]).getCategory());
        }
        System.out.println(((FictionBook)books[2]).getCategory());
    }
}
