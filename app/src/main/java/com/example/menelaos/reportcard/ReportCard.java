package com.example.menelaos.reportcard;

/**
 * Created by menelaos on 19/7/2017.
 */

// In this project, i will use 5 lessons and their grades.
// The number 5 is not strict. It is just used for exemple.
// The code can be used also for more or less lessons

import java.util.ArrayList;

public class ReportCard {

    // Array for storing the Lesson names
    private ArrayList<String> mLessons = new ArrayList<String>();

    // Array for storing the Lesson grades
    // I will use int values for grades
    private ArrayList<Integer> mGrades = new ArrayList<Integer>();

    // Variable to calculate the average grade
    private double mAverageGrade = 0.0;

    // Lessons used
    //    Maths
    //    Physics
    //    Chemistry
    //    Computer Science
    //    Language

    //The public method
    public ReportCard(int mathsGrade, int physicsGrade, int chemistryGrade, int computerScienceGrade, int languadgeGrade) {

        //initializing lessons names
        mLessons.add(0, "Maths");
        mLessons.add(1, "Physics");
        mLessons.add(2, "Chemistry");
        mLessons.add(3, "Computer Science");
        mLessons.add(4, "Language");

        // initializing lessons grades
        mGrades.add(0, mathsGrade);
        mGrades.add(1, physicsGrade);
        mGrades.add(2, chemistryGrade);
        mGrades.add(3, computerScienceGrade);
        mGrades.add(4, languadgeGrade);

    }

    // set and get methods for maths
    public void setMathsGrade(int grade) {
        mGrades.set(0, grade);
    }

    public int getMathsGrade() {
        int grade = mGrades.get(0);
        return grade;
    }

    // set and get methods for physics
    public void setPhysicsGrade(int grade) {
        mGrades.set(1, grade);
    }

    public int getPhysicsGrade() {
        int grade = mGrades.get(1);
        return grade;
    }

    // set and get methods for chemistry
    public void setChemistryGrade(int grade) {
        mGrades.set(2, grade);
    }

    public int getChemistryGrade() {
        int grade = mGrades.get(2);
        return grade;
    }

    // set and get methods for computer science
    public void setComputerScienceGrade(int grade) {
        mGrades.set(3, grade);
    }

    public int getComputerScienceGrade() {
        int grade = mGrades.get(3);
        return grade;
    }

    // set and get methods for languadge
    public void setLanguadgeGrade(int grade) {
        mGrades.set(4, grade);
    }

    public int getLanguadgeGrade() {
        int grade = mGrades.get(4);
        return grade;
    }

    // Calculate the average grade
    public double getAverageGrade() {
        for (int i = 0; i < mGrades.size(); i++) {
            mAverageGrade += mGrades.get(i);
        }
        mAverageGrade = mAverageGrade / mGrades.size();
        return mAverageGrade;
    }

    @Override
    public String toString() {
        String finalText = "";
        for (int i = 0; i < mGrades.size(); i++) {
            String lesson = mLessons.get(i);
            int grade = mGrades.get(i);
            finalText = finalText + lesson + ": " + grade + "\n";
        }
        finalText = finalText + "Average Grade: " + mAverageGrade;
        return finalText;
    }

}
