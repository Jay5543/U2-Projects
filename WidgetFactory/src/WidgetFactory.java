import javax.swing.*;

public class WidgetFactory {

    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production: $9,240.00
     Profit: $760.00

     */

    //Plan
    /*
    Make methods
    number of days
    number od widgets
    cost of widgets
    cost of production
    profit
    output
     */

    public static void main(String[] args) {
        int widgetsMade = Integer.parseInt(JOptionPane.showInputDialog(null, "How many widgets were made?"));
        int numbersOfDays = widgetsMade / 160;
        double widgetCost = widgetsMade * 10;
        double productionCost = numbersOfDays * 10 * 8 * 16.50;
        double amountOfProfit = widgetCost - productionCost;

        numberOfWidgets(widgetsMade);
        numberOfDaysMethod(numbersOfDays);
        costOfWidgets(widgetCost);
        costOfProduction(productionCost);
        profits(amountOfProfit);

    }
    public static void numberOfDaysMethod(int numberOfDays){
        JOptionPane.showMessageDialog(null, "The number of days is: " + numberOfDays);
    }
    public static void numberOfWidgets(int widgetsMade){
        JOptionPane.showMessageDialog(null, "The amount of Widgets made were: " + widgetsMade);
    }
    public static void costOfWidgets(double widgetsCost){
        JOptionPane.showMessageDialog(null, "Cost of all the widgets is : $" + widgetsCost);
    }
    public static void costOfProduction(double productionCost){
        JOptionPane.showMessageDialog(null, "The cost of the production is: $" + productionCost);
    }
    public static void profits(double amountOfProfit){
        JOptionPane.showMessageDialog(null, "Your profits is: $" + amountOfProfit);
    }
}
