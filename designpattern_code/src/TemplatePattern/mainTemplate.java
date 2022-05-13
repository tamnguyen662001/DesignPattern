package TemplatePattern;

public class mainTemplate {
    public static void main(String[] args) {
        System.out.println("---- Coffee");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("---- Tea");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
