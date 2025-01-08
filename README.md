# 🚗 Car Dealership Commission Manager

## 🎯 Intro:
A Java-based program designed to calculate and distribute sales commissions among car dealership staff. This project automates the process of tracking car sales and fairly distributing commissions based on roles, performance metrics, and various bonus factors.

## 🛠️ Tech Stack:
* Java
* Scanner class for user input
* Command line interface
* String formatting for currency display

## 💫 Features:
* Sales tracking system:
    * Records individual car sales
    * Tracks dealer markup
    * Calculates commission pools
    * Maintains running totals

* Role-based commission distribution:
    * Salespeople (45% of pool)
    * Sales Managers (25% of pool)
    * Finance Officers (20% of pool)
    * Support Staff (10% of pool)

* Performance bonus system:
    * Customer satisfaction ratings
    * Sales target achievements
    * Peak season adjustments
    * Overtime recognition

* Detailed reporting:
    * Individual commission breakdowns
    * Performance-based bonus calculations
    * Total earnings per role
    * Sales volume tracking

## 📝 Process:
Developed this project to streamline commission calculations in car dealerships. The focus was on creating a fair and transparent system that accounts for various contribution factors. Key development aspects included:
* Implementing flexible commission structures
* Creating comprehensive bonus calculations
* Ensuring accurate distribution ratios
* Developing clear user interaction flows

## 📚 Learnings:
* Enhanced understanding of percentage-based calculations
* Improved handling of monetary values in Java
* Better grasp of nested conditional logic
* Experience with multi-factor bonus systems
* Deeper insight into sales commission structures

## ⭐ Improvement:
Future enhancements could include:
* Database integration for sales history
* GUI implementation
* Multiple dealership support
* Export functionality for reports
* Employee profile management
* Commission trend analysis
* Tax calculation integration
* Support for different currency formats

## 🚀 Running the Project:
To run this project locally:
1. Clone the repository
2. Navigate to the project directory
3. Compile: `javac CarDealershipCommissionManager.java`
4. Run: `java CarDealershipCommissionManager`
5. Follow the prompts to enter sales and staff information

## 🖼️ Sample Output:
```bash
Enter car sale amount: 25000
Enter dealer markup amount: 3000
Total Sales so far: $25000.00
Current commission pool: $1200.00
Total amount: $28000.00
Number of Sales: 1

...

Final Commission Distribution:
Salesperson Commission: $750.25
Manager Commission: $425.50
Finance Officer Commission: $320.75
Support Staff Commission: $185.30