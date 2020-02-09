package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    @Before
    public void createJobs(){
        Job job1 = new Job();
        Job job2 = new Job();
    }
    @Test
    //Test Empty Constructor
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
    assertFalse(job1.getId() == job2.getId());
    }

    //Test full constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job instanceof  Job);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    //Test job equality
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    //Test toString
    @Test
    public void testToString(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "*****" + "\n"+
                "ID: "  + job.getId() + "\n"+
                "Name: Product tester"  + "\n"+
                "Employer: ACME" + "\n"+
                "Location: Desert" + "\n"+
                "Position Type: Quality control" + "\n"+
                "Core Competency: Persistence"  +"\n"+
                "******";
        assertEquals(expected, job.toString());
    }
    @Test
    public void testEmptyObj(){
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expected = "*****" + "\n"+
                "ID: " + job.getId() + "\n"+
                "Name: Data not available"  + "\n"+
                "Employer: Data not available" + "\n"+
                "Location: Data not available" + "\n"+
                "Position Type: Data not available" + "\n"+
                "Core Competency: Data not available"  +"\n"+
                "******";
        assertEquals(expected, job.toString());
    }
}
