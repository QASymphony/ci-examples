/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package junitdemo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.*;


@Ignore
public class JUnitDemoIgnoreTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println(Thread.currentThread() + " - setUpBeforeClass()");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println(Thread.currentThread() + " - tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println(Thread.currentThread() + " - setUp()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(Thread.currentThread() + " - tearDown()");
    }

    List<String> mylist = Arrays.asList("123", "456");

    @Test
    public void listLength4() {
        mylist = Arrays.asList("abc", "def", "ghi");
        System.out.println(mylist);
        assertEquals(3, mylist.size());
    }

    @Test
    public void listLength3() {
        System.out.println(mylist);
        assertEquals(2, mylist.size());
    }
		
	@Test
	public void testSame1() {
		assertEquals(1, 2);
	}
	
	@Test
	public void testSomething1() 
	{ 
		System.out.println("Sorry this test will not run, its ignored"); 
	}
		
	@Test
    public void ignoreTest5() {
        System.out.println("in ignore test");
    }
}
