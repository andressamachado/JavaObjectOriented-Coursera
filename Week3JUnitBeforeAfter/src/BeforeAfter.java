import org.junit.*;

public class BeforeAfter {



        @Before
        public void before() {
            System.out.println("@Before");
        }

        @After
        public void after() {
            System.out.println("@After");
        }

        @BeforeClass
        public static void beforeClass(){
            System.out.println("@BeforeClass");
        }

        @AfterClass
        public static void afterClass(){
            System.out.println("@AfterClass");
        }


        @org.junit.Test
        public void test1() {
            System.out.println("teste 1");
        }


        @org.junit.Test
        public void test2() {
            System.out.println("teste 2");
        }


        @org.junit.Test
        public void test3() {
            System.out.println("teste 3");
        }

    }

