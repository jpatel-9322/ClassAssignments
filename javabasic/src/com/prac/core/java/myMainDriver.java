package com.prac.core.java;

import com.prac.core.java.geo.Circle;
import com.prac.core.java.geo.Shape;
import com.prac.core.java.geo.SubCircle;
import com.prac.core.java.geo.Triangle;

public class myMainDriver {

	public static void main(String[] args) {
		Shape s = new Circle(123);
		s.calShapeArea();
		
		s = new SubCircle();
		s.calShapeArea();
		
		Shape t = new Triangle(12,10);
		t.calShapeArea();
		
	}

}
