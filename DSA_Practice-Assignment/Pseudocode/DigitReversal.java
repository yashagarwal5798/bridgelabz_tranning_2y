START

INPUT N

reverse = 0

WHILE N > 0
digit = N MOD 10
reverse = reverse * 10 + digit
        N = N / 10
END WHILE

OUTPUT reverse

END