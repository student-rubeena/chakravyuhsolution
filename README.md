# chakravyuhsolution
Algorithm Design
1.	Initialization:     
•	p: Initial power of Abhimanyu.
•	k: Array of length 11 representing the power of enemies in each circle.
•	a: Number of skips available.
•	b: Number of recharges available.
•	Initialize circle = 0 (Abhimanyu starts at the innermost circle).

2.	Simulate Movement Through Circles:
•	Loop through each circle from innermost to outermost.
•	At each circle, perform the following:
	Check for Skip: If skips are available (a > 0), skip this circle and decrement a.
	Check for Recharge: If recharges are available (b > 0), recharge and increment p.
	Battle: 
                 If p < k[circle], Abhimanyu loses.     
                 If p >= k[circle], decrement p by k[circle] to simulate power loss in battle.
	Regeneration Check: For circles 3 and 7, if the enemy regenerates, reduce p by half of k[2] or k[6] (index is 0-based).
3.	Victory Condition: If Abhimanyu survives all circles, return "Can cross Chakravyuh". If Abhimanyu loses at any circle, return "Cannot cross Chakravyuh".
