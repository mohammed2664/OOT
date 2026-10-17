import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void validateParticipantCount(int count) throws InvalidNIRFDataException {
        if (count <= 0) {
            throw new InvalidNIRFDataException("Participant count must be greater than 0. Given: " + count);
        }
    }

    public static void main(String[] args) {
        System.out.println("======================================================================");
        System.out.println("   DCST, GOA UNIVERSITY - 3-YEAR NIRF RANKING PORTAL (2024 - 2026)    ");
        System.out.println("======================================================================\n");

        // 1. OBJECT REFERENCING & CONSTRUCTORS
        System.out.println("--- [1] OBJECT REFERENCING & CONSTRUCTORS ---");
        Student s1 = new Student("2664", "Mohammed Faaris Khan", "MCA", 2026);
        Student s2 = s1;
        System.out.println("Original s1 Name: " + s1.name);
        s2.name = "Mohammed Faaris Khan (NIRF Student Rep)";
        System.out.println("After modifying s2.name -> s1.name becomes: " + s1.name + "\n");

        // 2. STATIC ATTRIBUTES, METHODS & ENUMS
        System.out.println("--- [2] STATIC ATTRIBUTES, METHODS & ENUMS ---");
        Student s3 = new Student("2601", "Aarav Naik", "M.Sc. Data Science", 2025);
        Staff st1 = new Staff("FAC-01", "Dr. Hanumant Redkar", "Assistant Professor", true);
        Staff st2 = new Staff("ADM-05", "Sandeep Dessai", "Laboratory Assistant", false);
        DCSTMember.displayTotalMembers();
        System.out.println("Enum Categories Available: " + Arrays.toString(ActivityCategory.values()) + "\n");

        // 3. MULTIPLE INHERITANCE (INTERFACE + DEFAULT IMPLEMENTATION)
        System.out.println("--- [3] MULTIPLE INHERITANCE (DCST ACTIVITIES) ---");
        DCSTActivity act1 = new DCSTActivity("ISA, Midpoint & SEA Examinations", ActivityCategory.ACADEMIC, 180, "Exam Cell");
        DCSTActivity act2 = new DCSTActivity("Campus Placements & Internship Drive", ActivityCategory.ACADEMIC, 120, "Placement Cell");
        DCSTActivity act3 = new DCSTActivity("Industrial Study Tour & Hackathon", ActivityCategory.ACADEMIC, 60, "Faculty Coord");
        DCSTActivity act4 = new DCSTActivity("InfoFest (National IT Tech Fest)", ActivityCategory.NON_ACADEMIC, 450, "Student Council");
        DCSTActivity act5 = new DCSTActivity("Plateaunia & Play-On Sports Meet", ActivityCategory.NON_ACADEMIC, 300, "Cultural & Sports Secretary");
        act1.generateNIRFEntry();
        act4.generateNIRFEntry();
        System.out.println();

        // 4. ACCESS MODIFIERS
        System.out.println("--- [4] ACCESS MODIFIERS ---");
        System.out.println("Public Field Access (Outside Class):    " + s1.name);
        System.out.println("Protected Field Access (Same Package):  " + s1.department);
        System.out.println("Private Field via Public Getter:        " + s1.getMemberId());
        System.out.println("Private Field Inside Own Class Method:  " + s1.verifyInternalAccess() + "\n");

        // 5. ABSTRACT CLASSES & INTERFACES
        System.out.println("--- [5] ABSTRACT CLASSES & INTERFACES ---");
        System.out.println("Derived Student Role -> " + s1.getRoleDetails());
        System.out.println("Derived Staff Role   -> " + st1.getRoleDetails() + "\n");

        // 6. CLASS/INTERFACE AS A TYPE & MESSAGE PASSING
        System.out.println("--- [6] CLASS AS A TYPE & MESSAGE PASSING ---");
        NIRFAuditor.submitToPortal(s1);
        NIRFAuditor.submitToPortal(st1);
        NIRFAuditor.submitToPortal(st2);
        NIRFAuditor.submitToPortal(act2);
        NIRFAuditor.submitToPortal(act3);
        NIRFAuditor.submitToPortal(act5);
        System.out.println();

        // 7. POLYMORPHISM (OVERRIDING & OVERLOADING)
        System.out.println("--- [7] POLYMORPHISM (OVERRIDING & OVERLOADING) ---");
        System.out.println("Overloaded Score (ISA 20 + SEA 60):               " + s1.calculateTotalScore(20, 60));
        System.out.println("Overloaded Score (ISA 20 + Midpoint 15 + SEA 50): " + s1.calculateTotalScore(20, 15, 50) + "\n");

        // 8. GENERICS & COLLECTION FRAMEWORKS (LIST, SET, QUEUE, MAP)
        System.out.println("--- [8] GENERICS & COLLECTION FRAMEWORKS ---");
        NIRFRepository<DCSTActivity> activityRepo = new NIRFRepository<>();
        activityRepo.addRecord(act1);
        activityRepo.addRecord(act2);
        activityRepo.addRecord(act3);
        activityRepo.addRecord(act4);
        activityRepo.addRecord(act5);
        NIRFRepository.printBatchSummary("Generic Repository: DCST Activities", activityRepo.getAllRecords());

        Set<String> dcstCourses = new HashSet<>(Arrays.asList(
            "MCA (Master of Computer Applications)",
            "M.Sc. Artificial Intelligence & Data Science",
            "Ph.D. in Computer Science",
            "CS-501: Object Oriented Technology",
            "CS-502: Problem Solving & Programming Lab"
        ));
        System.out.println("Set (Unique Programs & Courses): " + dcstCourses);

        Queue<String> placementQueue = new LinkedList<>(Arrays.asList("Codanto", "Lenovo Leap", "Persistent Systems"));
        System.out.println("Queue (Upcoming Placement Recruiters): Polling first -> " + placementQueue.poll() + " | Remaining: " + placementQueue);

        Map<Integer, Integer> nirfYearlyPlacements = new HashMap<>();
        nirfYearlyPlacements.put(2024, 48);
        nirfYearlyPlacements.put(2025, 54);
        nirfYearlyPlacements.put(2026, 62);
        System.out.println("Map (3-Year Placement Count 2024-2026): " + nirfYearlyPlacements + "\n");

        // 9. EXCEPTION HANDLING (TRY, CATCH, FINALLY, THROW, CUSTOM EXCEPTION)
        System.out.println("--- [9] EXCEPTION HANDLING ---");
        try {
            validateParticipantCount(-15);
        } catch (InvalidNIRFDataException e) {
            System.out.println("Caught Custom Exception -> " + e.getMessage());
        } finally {
            System.out.println("Finally Block Executed -> NIRF Validation Audit Completed.\n");
        }

        // 10. REFLECTION, RTTI, PERSISTENCE, I/O & CLONING (SHALLOW VS DEEP)
        System.out.println("--- [10] REFLECTION, RTTI, PERSISTENCE, I/O & CLONING ---");
        DCSTMember rttiRef = s1;
        System.out.println("RTTI Check -> Object is instance of Student? " + (rttiRef instanceof Student) + " | Runtime Class: " + rttiRef.getClass().getName());

        Class<?> clazz = Student.class;
        System.out.print("Reflection (Declared Fields in Student): ");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.print(f.getName() + " ");
        }
        System.out.print("\nReflection (Declared Methods in Student): ");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.print(m.getName() + "() ");
        }
        System.out.println();

        try {
            DCSTProgram originalMCA = new DCSTProgram("MCA", 2, new CourseModule("CS-501", "Object Oriented Technology"));
            DCSTProgram shallowMCA = originalMCA.shallowCopy();
            DCSTProgram deepMCA = originalMCA.deepCopy();

            shallowMCA.coreSubject.courseTitle = "Modified via Shallow Copy";
            System.out.println("After Shallow Copy Edit -> Original Core Subject: " + originalMCA.coreSubject.courseTitle);

            deepMCA.coreSubject.courseTitle = "Advanced AI (Deep Copy Only)";
            System.out.println("After Deep Copy Edit    -> Original Core Subject: " + originalMCA.coreSubject.courseTitle);
            System.out.println("After Deep Copy Edit    -> Deep Copy Subject:     " + deepMCA.coreSubject.courseTitle);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nirf_program.ser"))) {
                oos.writeObject(originalMCA);
            }
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("nirf_program.ser"))) {
                DCSTProgram loadedProgram = (DCSTProgram) ois.readObject();
                System.out.println("Persistence (Deserialized Object from Disk): " + loadedProgram);
            }

            try (FileWriter fw = new FileWriter("nirf_summary_2026.txt")) {
                fw.write("NIRF 2024-2026 Report Submitted by SDO, DCST, Goa University.\n");
            }
            System.out.println("File I/O -> Saved text summary to nirf_summary_2026.txt");

            Scanner sc = new Scanner("Verified-By-SDO-2026");
            System.out.println("Console/Stream Scanner I/O Read -> Confirmation Token: " + sc.nextLine());
            sc.close();
        } catch (Exception e) {
            System.out.println("Error in Section 10: " + e.getMessage());
        }
    }
}