# SetBitsInBinaryRepresentation
Find the Set Bits in Binary Number
In this i define Two Methods

	:-In FirstMethod

	we take the digit one by one 

		ans+=n&1

	and with the of this we go through all the digits one by one

		n=n>>1

	Time Complexity:-   O(log n)


	:-In Second Method

	we remove the last one from the digit by using

		n=n&(n-1)

	Time Complexity:-O(the set bits in binary number)

	
