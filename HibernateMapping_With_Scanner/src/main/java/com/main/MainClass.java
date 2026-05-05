package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Laptop Name : ");
		String lName = sc.nextLine();
		
		System.out.println("Enter Student ID : ");
		int sId = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student Name : ");
		String sName = sc.nextLine();
		
		
		System.out.println("Enter Student City Name : ");
		String cName = sc.nextLine();
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Laptop.class);
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Laptop l = new Laptop();
		l.setlName(lName);
		ss.persist(l);

		Student s = new Student();
		s.setStudId(sId);
		s.setName(sName);
		s.setCity(cName);
		s.setLaptopId(l);

		ss.save(s);

		tr.commit();
		ss.close();

		System.out.println("Data is Inserted... ! ");
	}

}