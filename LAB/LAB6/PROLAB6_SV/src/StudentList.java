
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList implements IStudent {
    
    @Override
    public void f1_readfromfile(RandomAccessFile raf, List<Student> list) throws IOException {
        raf.seek(0);
        list.clear();

        String line;
        while ((line = raf.readLine()) != null) {
            String[] parts = line.split(";");
            if (parts.length == 4) {
                String id = parts[0].trim();
                String name = parts[1].trim();
                int age = Integer.parseInt(parts[2].trim());
                double mark = Double.parseDouble(parts[3].trim());
                list.add(new Student(id, name, mark, age));
            }
        }
    }

    @Override
    public void f2_writetoFile(List<Student> list, RandomAccessFile raf) throws IOException {
        raf.setLength(0);
        for (Student s : list) {
            raf.writeBytes(s.toString() + "\n");
        }
        
    }

    @Override
    public void f3_sortbyName(List<Student> list, RandomAccessFile raf) throws IOException {
        Collections.sort(list, Comparator.comparing(Student::getName));
        f2_writetoFile(list, raf);
    }

    @Override
    public void f4_sortbyMark(List<Student> list, RandomAccessFile raf) throws IOException {
        Collections.sort(list, Comparator.comparingDouble(Student::getMark).reversed());
        f2_writetoFile(list, raf);
    }

    @Override
    public void f5_getSurName(List<Student> list, RandomAccessFile raf) throws IOException {
        List<Student> result = list.stream()
                .filter(s -> s.getName().split(" ")[0].equalsIgnoreCase("Nguyen"))
                .collect(Collectors.toList());
        if (result.isEmpty()) {
            raf.setLength(0);
            raf.writeBytes("Nothing to display (file is empty).\n");
        } else {
            f2_writetoFile(result, raf);
        }
    }

    @Override
    public void f6_getTop(List<Student> list, RandomAccessFile raf) throws IOException {
        list.sort(Comparator.comparingDouble(Student::getMark).reversed());
        double topScore = list.get(0).getMark();
        List<Student> topStudents = list.stream()
                .filter(s -> s.getMark() == topScore)
                .collect(Collectors.toList());
        f2_writetoFile(topStudents, raf);
    }

    @Override
    public void f7_getmax(RandomAccessFile raf, List<Student> list) throws IOException {
        if (list.isEmpty()) {
            raf.setLength(0);
            raf.writeBytes("Nothing to display (file is empty).\n");
            return;
        }
        double maxMark = list.stream()
                .mapToDouble(Student::getMark)
                .max()
                .orElse(Double.NaN);
        List<Student> maxStudents = list.stream()
                .filter(s -> s.getMark() == maxMark)
                .collect(Collectors.toList());
        f2_writetoFile(maxStudents, raf);
    }

    @Override
    public void f8_getmin(RandomAccessFile f, List<Student> t) throws IOException {
        if (t.isEmpty()) {
            System.out.println("Nothing to display (file is empty).");
            return;
        }

        double minMark = t.stream()
                .mapToDouble(Student::getMark)
                .min()
                .orElse(Double.NaN);

        List<Student> minMarkStudents = t.stream()
                .filter(student -> student.getMark() == minMark)
                .collect(Collectors.toList());

        for (Student student : minMarkStudents) {
            f.writeBytes(student.toString() + "\n");
        }
    }

    @Override
    public void f9_getFull(RandomAccessFile f, List<Student> t) throws IOException {
        if (t.isEmpty()) {
            System.out.println("Nothing to display (file is empty).");
            return;
        }

        for (Student student : t) {
            String status = student.getMark() > 5 ? "passed" : "Not passed";
            String line = String.format("%s;\t %s;\t %d;\t %.1f;\t %s",
                    student.getId(), student.getName(), student.getAge(), student.getMark(), status);
            f.writeBytes(line + "\n");
        }
    }

    @Override
    public void f10_getunder20(RandomAccessFile f, List<Student> t) throws IOException {
        if (t.isEmpty()) {
            System.out.println("Nothing to display (file is empty).");
            return;
        }

        List<Student> under20Students = t.stream()
                .filter(student -> student.getAge() < 20)
                .collect(Collectors.toList());

        for (Student student : under20Students) {
            f.writeBytes(student.toString() + "\n");
        }
    }
}
