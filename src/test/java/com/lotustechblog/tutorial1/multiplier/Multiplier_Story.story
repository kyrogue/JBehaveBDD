!--Scenario:  A scenario is a collection of executable steps of different type
!--Given step represents a precondition to an event
!--When step represents the occurrence of the event
!--Then step represents the outcome of the event
					 
!--Scenario:  Another scenario exploring different combination of events
!--Given a precondition  
!--When a negative event occurs  
!--Then a the outcome should be captured

Scenario: Multiplier multiply testing
Given a Multiplier
When I multiply 2 and 5
Then the outcome should be 10