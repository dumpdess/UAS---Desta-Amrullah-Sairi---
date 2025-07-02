/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import net.sf.jasperreports.engine.JasperCompileManager;

/**
 *
 * @author ASUS
 */
public class CompileReport {
    public static void main(String[] args) {
        try {
            System.out.println("⏳ Meng-compile laporan...");
            JasperCompileManager.compileReportToFile("src/report/laporan_peminjaman.jrxml");
            System.out.println("✅ Compile berhasil!");
        } catch (Exception e) {
            System.out.println("❌ Error saat compile: " + e);
        }
    }
}
