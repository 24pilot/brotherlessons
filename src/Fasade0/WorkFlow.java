/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fasade0;

/**
 *
 * @author user
 */
public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    
    public void solveProblem(){
        job.doJob();
        developer.doBeforeDeadline(bugTracker);
        bugTracker.startSprint();
        developer.doBeforeDeadline(bugTracker);
        bugTracker.stopSprint();
        developer.doBeforeDeadline(bugTracker);
    }
}
