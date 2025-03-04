/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Bill {
    private int invoiceCode;
    private int bookCode;
    private int employeeCode;
    private String time;
    private float unitPrice;
    private int salaryAmount;
    private String status;

    public Bill(int invoiceCode, int bookCode, int employeeCode, String time, float unitPrice, int salaryAmount, String status) {
        this.invoiceCode = invoiceCode;
        this.bookCode = bookCode;
        this.employeeCode = employeeCode;
        this.time = time;
        this.unitPrice = unitPrice;
        this.salaryAmount = salaryAmount;
        this.status = status;
    }

    public int getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(int invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bill{" + "invoiceCode=" + invoiceCode + ", bookCode=" + bookCode + ", employeeCode=" + employeeCode + ", time=" + time + ", unitPrice=" + unitPrice + ", salaryAmount=" + salaryAmount + ", status=" + status + '}';
    }
    
}
