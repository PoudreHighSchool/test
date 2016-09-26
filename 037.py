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
	lit = []
	for i in range(1, len(str(number))):
		lit.append(int( (str(number)[-1]) )

	for i in range(2, int(len(lit)) ):
		del (lit[i - 1])
		if not primeFind(int(lit)):
			tmp = False
	return tmp

# for i in range(8, 500000):
# 	if primeFind(i):

print(str(checkLeft(3797)))
