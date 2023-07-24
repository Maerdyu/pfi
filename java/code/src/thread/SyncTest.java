package thread;

public class SyncTest {

    public static void main(String[] args) {
        SyncTest.test();
    }

    public static synchronized void test(){
        System.out.print("aaaa");
    }

    /**
     * $ javap -verbose SyncTest.class
     * Classfile /C:/Users/jinch/Desktop/spring/out/production/code/thread/SyncTest.class
     *   Last modified 2020-11-29; size 595 bytes
     *   MD5 checksum cf0267933dd847610eaa68bfa1866f9c
     *   Compiled from "SyncTest.java"
     * public class thread.SyncTest
     *   minor version: 0
     *   major version: 52
     *   flags: ACC_PUBLIC, ACC_SUPER
     * Constant pool:
     *    #1 = Methodref          #7.#22         // java/lang/Object."<init>":()V
     *    #2 = Methodref          #6.#23         // thread/SyncTest.test:()V
     *    #3 = Fieldref           #24.#25        // java/lang/System.out:Ljava/io/PrintStream;
     *    #4 = String             #26            // aaaa
     *    #5 = Methodref          #27.#28        // java/io/PrintStream.print:(Ljava/lang/String;)V
     *    #6 = Class              #29            // thread/SyncTest
     *    #7 = Class              #30            // java/lang/Object
     *    #8 = Utf8               <init>
     *    #9 = Utf8               ()V
     *   #10 = Utf8               Code
     *   #11 = Utf8               LineNumberTable
     *   #12 = Utf8               LocalVariableTable
     *   #13 = Utf8               this
     *   #14 = Utf8               Lthread/SyncTest;
     *   #15 = Utf8               main
     *   #16 = Utf8               ([Ljava/lang/String;)V
     *   #17 = Utf8               args
     *   #18 = Utf8               [Ljava/lang/String;
     *   #19 = Utf8               test
     *   #20 = Utf8               SourceFile
     *   #21 = Utf8               SyncTest.java
     *   #22 = NameAndType        #8:#9          // "<init>":()V
     *   #23 = NameAndType        #19:#9         // test:()V
     *   #24 = Class              #31            // java/lang/System
     *   #25 = NameAndType        #32:#33        // out:Ljava/io/PrintStream;
     *   #26 = Utf8               aaaa
     *   #27 = Class              #34            // java/io/PrintStream
     *   #28 = NameAndType        #35:#36        // print:(Ljava/lang/String;)V
     *   #29 = Utf8               thread/SyncTest
     *   #30 = Utf8               java/lang/Object
     *   #31 = Utf8               java/lang/System
     *   #32 = Utf8               out
     *   #33 = Utf8               Ljava/io/PrintStream;
     *   #34 = Utf8               java/io/PrintStream
     *   #35 = Utf8               print
     *   #36 = Utf8               (Ljava/lang/String;)V
     * {
     *   public thread.SyncTest();
     *     descriptor: ()V
     *     flags: ACC_PUBLIC
     *     Code:
     *       stack=1, locals=1, args_size=1
     *          0: aload_0
     *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
     *          4: return
     *       LineNumberTable:
     *         line 3: 0
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0       5     0  this   Lthread/SyncTest;
     *
     *   public static void main(java.lang.String[]);
     *     descriptor: ([Ljava/lang/String;)V
     *     flags: ACC_PUBLIC, ACC_STATIC
     *     Code:
     *       stack=0, locals=1, args_size=1
     *          0: invokestatic  #2                  // Method test:()V
     *          3: return
     *       LineNumberTable:
     *         line 6: 0
     *         line 7: 3
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0       4     0  args   [Ljava/lang/String;
     *
     *   public static synchronized void test();
     *     descriptor: ()V
     *     flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNCHRONIZED
     *     Code:
     *       stack=2, locals=0, args_size=0
     *          0: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *          3: ldc           #4                  // String aaaa
     *          5: invokevirtual #5                  // Method java/io/PrintStream.print:(Ljava/lang/String;)V
     *          8: return
     *       LineNumberTable:
     *         line 10: 0
     *         line 11: 8
     * }
     * SourceFile: "SyncTest.java"
     */
}
