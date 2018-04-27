package com.epam.lena_tuseeva.java.lesson3.task1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class EducationalCenter {
    private List<Student> students = null;

    public EducationalCenter() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void printReport(boolean isFull) {
        System.out.println("--------------");
        System.out.println(isFull ? "Full report: " : "Simple report: ");
        System.out.println("--------------");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat simpleHourFormat = new SimpleDateFormat("HH");
        Date currentDate = new Date();

        for (Student student : this.students) {
            System.out.println(student.toString());

            int durationOfCourse = student.courses.stream()
                    .map(course -> course.duration)
                    .reduce(0, (a, b) -> a + b);

            int daysOfCourse = durationOfCourse / 8;
            int hoursOfCourse = durationOfCourse % 8;

            long differenceBetweenDates = currentDate.getTime() - student.startDate.getTime();
            int passedDays = (int) (differenceBetweenDates / (24 * 60 * 60 * 1000));
            int passedHours = Integer.parseInt(simpleHourFormat.format(currentDate));

            if (!isFull) {
                System.out.println(isCoursesEnded(passedDays, daysOfCourse, passedHours, hoursOfCourse) ?
                        "Training is over." : "Training isn't over.");
                continue;
            }

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(student.startDate);
            int addDays = daysOfCourse;
            if (hoursOfCourse != 0) {
                addDays++;
            }
            calendar.add(Calendar.DAY_OF_MONTH, addDays - 1);
            Date finishDate = calendar.getTime();

            StringBuilder reportStr = new StringBuilder();
            reportStr.append("Duration of the program - ").append(durationOfCourse).append(" hour(s)").append('\n');

            if (isCoursesEnded(passedDays, daysOfCourse, passedHours, hoursOfCourse)) {
                int laterDays = passedDays - daysOfCourse;
                int laterHours = Math.min(18, passedHours) - (hoursOfCourse + 10);

                reportStr.append("After finishing through: ")
                        .append(laterDays).append(" day(s) ")
                        .append(laterHours).append(" hour(s) ")
                        .append('\n');
            } else {
                int leftDays = daysOfCourse - passedDays;
                if (passedHours >= 18) {
                    leftDays--;
                }
                int leftHours = (hoursOfCourse + 10) - Math.min(10, Math.max(10, passedHours));

                reportStr.append("Will be completed through: ")
                        .append(leftDays).append(" day(s) ")
                        .append(leftHours).append(" hour(s) ")
                        .append('\n');
            }
            reportStr.append("Start date: ").append(simpleDateFormat.format(student.startDate)).append('\n');
            reportStr.append("End date: ").append(simpleDateFormat.format(finishDate)).append('\n');

            System.out.println(reportStr);
        }
    }

    private boolean isCoursesEnded(int passedDays, int daysOfCourse, int passedHours, int hoursOfCourse) {
        return passedDays > daysOfCourse || (passedDays == daysOfCourse && passedHours >= hoursOfCourse + 10);
    }
}
