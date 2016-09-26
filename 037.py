def primeFind(number):
	oldnum = number
	factor = 1
	while number > 1:
		factor += 1
		if number % factor == 0:
			if 1 < factor < oldnum:
				return False # is not prime
			number //= factor
	return True # is prime!

def checkLeft(number):
	tmp = True
	for i in range(2, len(number)):
		number.pop(i)
		if not primeFind(int(number)):
			tmp = False
	return tmp

# for i in range(8, 500000):
# 	if primeFind(i):

print(checkLeft(str(3797)))
