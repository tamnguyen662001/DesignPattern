package CompositePattern;

public class mainComposite {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));
        
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        
        root.add(comp);
        root.add(new Leaf("Leaf C"));
        
         Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
        root.display(1);
    }
}


/*Composite là một mẫu thiết kế thuộc nhóm cấu trúc, cho phép thực hiện các tương tác với tất cả đối tượng trong mẫu tương tự nhau.
Một đối tượng Composite được tạo thành từ một hay nhiều đối tượng tương tự nhau (hoặc có một số chức năng tương tự nhau).
Ý tưởng ở đây là có thể thao tác trên một nhóm đối tượng theo cách như thao tác trên một đối tượng duy nhất, các đối tượng của nhóm phải có các thao tác chung (method chung).
Composite có thể được gọi là “Đối tượng đa hợp”.

Composite là mẫu thiết kế dùng để tạo ra các đối tượng trong các cấu trúc cây để biểu diễn hệ thống phân lớp.
Composite cho phép các client tác động đến từng đối tượng và các thành phần của đối tượng một cách thống nhất. 
– Component (Thành phần):

Khai báo interface hoặc abstract chung cho các thành phần đối tượng.
Chứa các method thao tác chung của các thành phần đối tượng.
– Leaf (Lá):

Biểu diễn các đối tượng lá (ko có con) trong thành phần đối tượng.
– Composite (Hỗn hợp):

Định nghĩa một thao tác cho các thành phần có thành phần con.
Lưu trữ thành phần con.
Thực thi sự quản lý các thành phần con của giao diện Component.
Composite Pattern: Tổ chức các đối tượng theo cấu trúc phân cấp dạng cây. Tất cả các đối tượng trong cấu trúc được thao tác một cách thuần nhất như nhau.*/