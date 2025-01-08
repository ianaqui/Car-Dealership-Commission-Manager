import java.util.Scanner;

public class CarDealershipCommissionManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double totalSales = 0.0;
        double totalCommission = 0.0;
        int numberOfSales = 0;

        while (true) {
            System.out.print("Enter car sale amount: ");
            double saleAmount = in.nextDouble();

            System.out.print("Enter dealer markup amount: ");
            double markupAmount = in.nextDouble();

            double totalAmount = saleAmount + markupAmount;
            double commissionPool = markupAmount * 0.40; // 40% of markup goes to commission pool

            totalSales += saleAmount;
            totalCommission += commissionPool;
            numberOfSales++;

            System.out.println("Total Sales so far: $" + String.format("%.2f", totalSales));
            System.out.println("Current commission pool: $" + String.format("%.2f", totalCommission));
            System.out.println("Total amount: $" + String.format("%.2f", totalAmount));
            System.out.println("Number of Sales: " + numberOfSales);

            System.out.print("Do you want to stop(y/n)? ");
            char stop = in.next().charAt(0);

            if (stop == 'y' || stop == 'Y') {
                break;
            }
        }

        // Staff numbers input
        System.out.print("Enter number of salespeople present: ");
        int salespeoplePresent = in.nextInt();

        System.out.print("Enter number of sales managers present: ");
        int managersPresent = in.nextInt();

        System.out.print("Enter number of finance officers present: ");
        int financeOfficersPresent = in.nextInt();

        System.out.print("Enter number of support staff present: ");
        int supportStaffPresent = in.nextInt();

        int totalStaff = salespeoplePresent + managersPresent + financeOfficersPresent + supportStaffPresent;

        // commission distribution based on percentages
        double salesCommission = totalCommission * 0.45 / salespeoplePresent; // 45% for Salespeople
        double managerCommission = totalCommission * 0.25 / managersPresent; // 25% for Managers
        double financeCommission = totalCommission * 0.20 / financeOfficersPresent; // 20% for Finance Officers
        double supportCommission = totalCommission * 0.10 / supportStaffPresent; // 10% for Support Staff

        // Performance metrics
        System.out.print("Enter number of staff with customer satisfaction above 90%: ");
        int highRatedStaff = in.nextInt();

        System.out.print("Enter number of staff exceeding monthly targets: ");
        int targetExceedingStaff = in.nextInt();

        System.out.print("Was this a peak season month? (yes/no): ");
        String peakSeasonInput = in.next().toLowerCase();

        double seasonMultiplier;
        if (peakSeasonInput.equals("yes")) {
            seasonMultiplier = 1;
        } else {
            seasonMultiplier = 0;
        }

        System.out.print("Enter number of staff working overtime this month: ");
        int overtimeStaff = in.nextInt();

        double satisfactionBonus = totalCommission / highRatedStaff * 0.05; // 5% bonus for high customer satisfaction
        double targetBonus = totalCommission / targetExceedingStaff * 0.08; // 8% bonus for exceeding targets
        double seasonalBonus = totalCommission / totalStaff * seasonMultiplier * 0.03; // 3% seasonal bonus
        double overtimeBonus = totalCommission / overtimeStaff * 0.04; // 4% overtime bonus

        // Salesperson evaluation
        System.out.print("Did the salesperson achieve >90% satisfaction? (yes/no): ");
        String salesSatisfactionInput = in.next().toLowerCase();

        double salesSatisfaction = salesSatisfactionInput.equals("yes") ? 1 : 0;
        double salesSatisfactionTotal = salesSatisfaction == 1 ? satisfactionBonus : 0;

        System.out.print("Did the salesperson exceed monthly targets? (yes/no): ");
        String salesTargetInput = in.next().toLowerCase();

        double salesTarget = salesTargetInput.equals("yes") ? 1 : 0;
        double salesTargetTotal = salesTarget == 1 ? targetBonus : 0;

        System.out.print("Did the salesperson work overtime? (yes/no): ");
        String salesOvertimeInput = in.next().toLowerCase();

        double salesOvertime = salesOvertimeInput.equals("yes") ? 1 : 0;
        double salesOvertimeTotal = salesOvertime == 1 ? overtimeBonus : 0;

        double salespersonTotalCommission = salesCommission + salesSatisfactionTotal +
                salesTargetTotal + salesOvertimeTotal + seasonalBonus;

        // Manager evaluation
        System.out.print("Did the manager achieve >90% team satisfaction? (yes/no): ");
        String managerSatisfactionInput = in.next().toLowerCase();

        double managerSatisfaction = managerSatisfactionInput.equals("yes") ? 1 : 0;
        double managerSatisfactionTotal = managerSatisfaction == 1 ? satisfactionBonus : 0;

        System.out.print("Did the manager's team exceed targets? (yes/no): ");
        String managerTargetInput = in.next().toLowerCase();

        double managerTarget = managerTargetInput.equals("yes") ? 1 : 0;
        double managerTargetTotal = managerTarget == 1 ? targetBonus : 0;

        System.out.print("Did the manager work overtime? (yes/no): ");
        String managerOvertimeInput = in.next().toLowerCase();

        double managerOvertime = managerOvertimeInput.equals("yes") ? 1 : 0;
        double managerOvertimeTotal = managerOvertime == 1 ? overtimeBonus : 0;

        double managerTotalCommission = managerCommission + managerSatisfactionTotal +
                managerTargetTotal + managerOvertimeTotal + seasonalBonus;

        // Finance Officer evaluation
        System.out.print("Did the finance officer achieve >90% satisfaction? (yes/no): ");
        String financeOfficerSatisfactionInput = in.next().toLowerCase();

        double financeOfficerSatisfaction = financeOfficerSatisfactionInput.equals("yes") ? 1 : 0;
        double financeOfficerSatisfactionTotal = financeOfficerSatisfaction == 1 ? satisfactionBonus : 0;

        System.out.print("Did the finance officer exceed targets? (yes/no): ");
        String financeOfficerTargetInput = in.next().toLowerCase();

        double financeOfficerTarget = financeOfficerTargetInput.equals("yes") ? 1 : 0;
        double financeOfficerTargetTotal = financeOfficerTarget == 1 ? targetBonus : 0;

        System.out.print("Did the finance officer work overtime? (yes/no): ");
        String financeOfficerOvertimeInput = in.next().toLowerCase();

        double financeOfficerOvertime = financeOfficerOvertimeInput.equals("yes") ? 1 : 0;
        double financeOfficerOvertimeTotal = financeOfficerOvertime == 1 ? overtimeBonus : 0;

        double financeOfficerTotalCommission = financeCommission + financeOfficerSatisfactionTotal +
                financeOfficerTargetTotal + financeOfficerOvertimeTotal + seasonalBonus;

        // Support Staff evaluation
        System.out.print("Did the support staff achieve >90% satisfaction? (yes/no): ");
        String supportStaffSatisfactionInput = in.next().toLowerCase();

        double supportStaffSatisfaction = supportStaffSatisfactionInput.equals("yes") ? 1 : 0;
        double supportStaffSatisfactionTotal = supportStaffSatisfaction == 1 ? satisfactionBonus : 0;

        System.out.print("Did the support staff exceed service targets? (yes/no): ");
        String supportStaffTargetInput = in.next().toLowerCase();

        double supportStaffTarget = supportStaffTargetInput.equals("yes") ? 1 : 0;
        double supportStaffTargetTotal = supportStaffTarget == 1 ? targetBonus : 0;

        System.out.print("Did the support staff work overtime? (yes/no): ");
        String supportStaffOvertimeInput = in.next().toLowerCase();

        double supportStaffOvertime = supportStaffOvertimeInput.equals("yes") ? 1 : 0;
        double supportStaffOvertimeTotal = supportStaffOvertime == 1 ? overtimeBonus : 0;

        double supportStaffTotalCommission = supportCommission + supportStaffSatisfactionTotal +
                supportStaffTargetTotal + supportStaffOvertimeTotal + seasonalBonus;

        // Print final commission amounts
        System.out.println("\nFinal Commission Distribution:");
        System.out.println("Salesperson Commission: $" + String.format("%.2f", salespersonTotalCommission));
        System.out.println("Manager Commission: $" + String.format("%.2f", managerTotalCommission));
        System.out.println("Finance Officer Commission: $" + String.format("%.2f", financeOfficerTotalCommission));
        System.out.println("Support Staff Commission: $" + String.format("%.2f", supportStaffTotalCommission));

        in.close();
    }
}